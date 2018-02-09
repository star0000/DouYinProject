package com.example.douyinpro.home;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.douyinpro.R;
import com.example.douyinpro.home.bean.HomeBean;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.io.IOException;
import java.util.List;


/**
 * Created by 墨羽 on 2018/2/1.
 */

public class HomeAdapter extends XRecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private Context context;
    private List<HomeBean.CategoryListBean> categoryList;
    private ViewHolder holder;
    private MediaPlayer mediaPlayer;
    private SurfaceHolder surfaceHolder;
    private boolean isplay = false;

    public HomeAdapter(Context context, List<HomeBean.CategoryListBean> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.commend_xrv, null);
        holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

                String imgPlayUrl = categoryList.get(position).getAweme_list().get(position).getVideo().getOrigin_cover().getUrl_list().get(0);
                String playUrl = categoryList.get(position).getAweme_list().get(position).getVideo().getPlay_addr().getUrl_list().get(0);
                holder.xrvHeartnum.setText(categoryList.get(position).getAweme_list().get(position).getStatistics().getComment_count()+"");
                holder.xrvNewsnum.setText(categoryList.get(position).getAweme_list().get(position).getStatistics().getDigg_count()+"");
                holder.user.setText("@"+categoryList.get(position).getAweme_list().get(position).getAuthor_user_id()+"");
                holder.userTitle.setText(categoryList.get(position).getAweme_list().get(position).getShare_info().getShare_desc());
                mediaPlayer = new MediaPlayer();
                surfaceHolder = holder.homeSurface.getHolder();
                surfaceHolder.setFixedSize(480,800);
                surfaceHolder.addCallback(new SurfaceHolder.Callback() {
                    @Override
                    public void surfaceCreated(SurfaceHolder surfaceHolder1) {
                        mediaPlayer.setDisplay(surfaceHolder1);
                    }

                    @Override
                    public void surfaceChanged(SurfaceHolder surfaceHolder1, int format, int width, int height) {

                    }

                    @Override
                    public void surfaceDestroyed(SurfaceHolder surfaceHolder1) {

                    }
                });
                play(playUrl);

    }


    private void play(String playUrl) {
        mediaPlayer.reset();
        try {
            mediaPlayer.setDataSource(context, Uri.parse(playUrl));
            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mediaPlayer.start();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        holder.homeSurface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if(isplay){
                     holder.homePause.setVisibility(View.VISIBLE);
                     mediaPlayer.pause();
                     isplay = !isplay;
                 }else{
                     mediaPlayer.start();
                     holder.homePause.setVisibility(View.GONE);
                     isplay = !isplay;
                 }
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryList != null ? categoryList.size():0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private final SimpleDraweeView xrvIcon;
        private final ImageView xrvHeart;
        private final TextView xrvHeartnum;
        private final ImageView xrvNews;
        private final TextView xrvNewsnum;
        private final ImageView xrvShareimg;
        private final SurfaceView homeSurface;
        private final ImageView homePause;
        private final TextView user;
        private final TextView userTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            homePause = itemView.findViewById(R.id.home_pause);
            homeSurface = itemView.findViewById(R.id.home_surface);
            xrvIcon = itemView.findViewById(R.id.xrv_icon);
            xrvHeart = itemView.findViewById(R.id.xrv_heart);
            xrvHeartnum = itemView.findViewById(R.id.xrv_heartnum);
            xrvNews = itemView.findViewById(R.id.xrv_news);
            xrvNewsnum = itemView.findViewById(R.id.xrv_newsnum);
            xrvShareimg = itemView.findViewById(R.id.xrv_shareimg);
            user = itemView.findViewById(R.id.user);
            userTitle = itemView.findViewById(R.id.user_title);
        }
    }

}
