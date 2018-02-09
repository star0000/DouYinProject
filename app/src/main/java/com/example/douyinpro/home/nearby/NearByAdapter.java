package com.example.douyinpro.home.nearby;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.douyinpro.R;
import com.example.douyinpro.home.bean.HomeBean;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

/**
 * Created by 墨羽 on 2018/2/8.
 */

public class NearByAdapter extends XRecyclerView.Adapter<NearByAdapter.ViewHolder> {

    private Context context;
    private List<HomeBean.CategoryListBean> categoryList;
    private Uri uri;

    public NearByAdapter(Context context, List<HomeBean.CategoryListBean> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.nearby_xrv, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        uri = Uri.parse(categoryList.get(position).getAweme_list().get(position).getVideo().getDynamic_cover().getUrl_list().get(0));
        AbstractDraweeController build = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setAutoPlayAnimations(true)
                .setOldController(holder.nearbySimple.getController())
                .build();
        holder.nearbySimple.setController(build);

    }

    @Override
    public int getItemCount() {
        return categoryList != null ? categoryList.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private final SimpleDraweeView nearbySimple;

        public ViewHolder(View itemView) {
            super(itemView);
            nearbySimple = itemView.findViewById(R.id.nearby_simple);
        }
    }
}
