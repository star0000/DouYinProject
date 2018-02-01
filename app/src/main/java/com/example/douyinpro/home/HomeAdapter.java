package com.example.douyinpro.home;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
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
    private String playUrl;

    public HomeAdapter(Context context, List<HomeBean.CategoryListBean> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.home_xrv, null);
        holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        playUrl = categoryList.get(position).getAweme_list().get(position).getVideo().getPlay_addr().getUrl_list().get(0);
        holder.xrvHeartnum.setText(categoryList.get(position).getAweme_list().get(position).getStatistics().getComment_count()+"");
        holder.xrvNewsnum.setText(categoryList.get(position).getAweme_list().get(position).getStatistics().getDigg_count()+"");

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

        public ViewHolder(View itemView) {
            super(itemView);

            xrvIcon = itemView.findViewById(R.id.xrv_icon);
            xrvHeart = itemView.findViewById(R.id.xrv_heart);
            xrvHeartnum = itemView.findViewById(R.id.xrv_heartnum);
            xrvNews = itemView.findViewById(R.id.xrv_news);
            xrvNewsnum = itemView.findViewById(R.id.xrv_newsnum);
            xrvShareimg = itemView.findViewById(R.id.xrv_shareimg);
        }
    }

}
