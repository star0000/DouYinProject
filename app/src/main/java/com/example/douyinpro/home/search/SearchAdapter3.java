package com.example.douyinpro.home.search;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.douyinpro.R;
import com.example.douyinpro.home.bean.HomeBean;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

/**
 * Created by 墨羽 on 2018/2/6.
 */

public class SearchAdapter3 extends XRecyclerView.Adapter<SearchAdapter3.ViewHolder>{

    private Context context;
    private List<HomeBean.CategoryListBean>  categoryList;

    public SearchAdapter3(Context context, List<HomeBean.CategoryListBean> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewpage3 = View.inflate(context, R.layout.search_xrv_page3, null);
        ViewHolder viewHolder = new ViewHolder(viewpage3);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String img = categoryList.get(position).getAweme_list().get(position).getVideo().getOrigin_cover().getUrl_list().get(0);
        holder.searchSimple.setImageURI(img);
    }

    @Override
    public int getItemCount() {
        return categoryList != null ? categoryList.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private final SimpleDraweeView searchSimple;

        public ViewHolder(View itemView) {
            super(itemView);
            searchSimple = itemView.findViewById(R.id.search_simple);
        }
    }

}
