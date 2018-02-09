package com.example.douyinpro.home.search;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import com.example.douyinpro.R;
import com.example.douyinpro.home.GlideImageLoad;
import com.example.douyinpro.home.bean.HomeBean;
import com.example.douyinpro.home.bean.SearchBannerBean;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 墨羽 on 2018/2/5.
 */

public class SearchAdapter1 extends XRecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<HomeBean.CategoryListBean> categoryList;
    private List<SearchBannerBean.BannerBean> bannerList;
    private ArrayList<String> imgList;
    private static final int page1_banner = 0;
    private static final int page1_xrv = 1;


    public SearchAdapter1(Context context, List<HomeBean.CategoryListBean> categoryList, List<SearchBannerBean.BannerBean> bannerList) {
        this.context = context;
        this.categoryList = categoryList;
        this.bannerList = bannerList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == page1_banner){
            View view = View.inflate(context, R.layout.search_xrv_page1_banner, null);
            ViewHolderBanner viewHolderBanner = new ViewHolderBanner(view);
            return viewHolderBanner;
        }

        if(viewType == page1_xrv){
            View view1 = View.inflate(context, R.layout.search_xrv_page1_xrv2, null);
            ViewHolderXrv viewHolderXrv = new ViewHolderXrv(view1);
            return viewHolderXrv;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof ViewHolderBanner){
            ViewHolderBanner viewholderbanner =  (ViewHolderBanner)holder;
            imgList = new ArrayList<>();
            int size = bannerList.size();
            if (size != 0) {
                for (int i = 0; i < size ; i++) {
                    List<String> url_list = bannerList.get(i).getBanner_url().getUrl_list();
                    imgList.add(url_list.get(0));
                }
            }
            viewholderbanner.banner.setImageLoader(new GlideImageLoad());
            viewholderbanner.banner.setImages(imgList);
            viewholderbanner.banner.start();

        }else if(holder instanceof ViewHolderXrv){
            ViewHolderXrv viewholder1 = (ViewHolderXrv)holder;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, GridLayout.VERTICAL, false);
            viewholder1.searchXrv2.setLayoutManager(linearLayoutManager);
            SearchAdapter2 searchAdapter2 = new SearchAdapter2(context,categoryList);
            viewholder1.searchXrv2.setAdapter(searchAdapter2);
        }

    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0){
            return page1_banner;
        }else if(position == 1){
            return page1_xrv;
        }
        return 0;
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    class ViewHolderBanner extends RecyclerView.ViewHolder{

        private final Banner banner;

        public ViewHolderBanner(View itemView) {
            super(itemView);
            banner = itemView.findViewById(R.id.banner);
        }
    }

   class ViewHolderXrv extends RecyclerView.ViewHolder{

       private final XRecyclerView searchXrv2;

       public ViewHolderXrv(View itemView) {
           super(itemView);
           searchXrv2 = itemView.findViewById(R.id.search_xrv_2);
       }
   }


}
