package com.example.douyinpro.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.douyinpro.R;
import com.example.douyinpro.home.bean.HomeBean;
import com.example.douyinpro.home.bean.SearchBannerBean;
import com.example.douyinpro.home.presenter.SearchBannerPresenter;
import com.example.douyinpro.home.search.SearchAdapter1;
import com.example.douyinpro.home.search.SearchEditActivity;
import com.example.douyinpro.home.view.SearchBannerViewInterface;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements SearchBannerViewInterface{

    @BindView(R.id.homesearchview)
    HomeSearchView homesearchview;
    @BindView(R.id.search_xrv_1)
    XRecyclerView searchXrv1;
    private SearchBannerPresenter searchBannerPresenter;
    private Toast toast;
    private List<HomeBean.CategoryListBean> categoryList;
    private SearchAdapter1 searchAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        EventBus.getDefault().register(this);
        toast = Toast.makeText(this, "", Toast.LENGTH_SHORT);


        searchBannerPresenter = new SearchBannerPresenter(this);
        searchBannerPresenter.excuteQuest();

        homesearchview.setOnSearchClickListener(new HomeSearchView.OnSearchClickListener() {
            @Override
            public void onSearchClick(View v) {
                Intent intent = new Intent(SearchActivity.this, SearchEditActivity.class);
                startActivity(intent);
            }

            @Override
            public void onImgBackClick(View v) {
               finish();
            }
        });

    }

    @Subscribe(threadMode = ThreadMode.MAIN,sticky = true)
    public void getMessageEvent(EventBusMessage eventBusMessage){
        categoryList = eventBusMessage.CategoryList;
        Log.e("WSF", "getMessageEvent: "+categoryList.size() );
    }

    @Override
    public void SearchBannersuccess(List<SearchBannerBean.BannerBean> bannerList) {
        if(bannerList != null){
            LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(SearchActivity.this, GridLayout.VERTICAL, false);
            searchXrv1.setLayoutManager(linearLayoutManager1);
            searchAdapter1 = new SearchAdapter1(SearchActivity.this,categoryList,bannerList);
            searchXrv1.setAdapter(searchAdapter1);
        }
    }

    @Override
    public void SearchBannerfailed(Exception e) {
        toast.setText("请求失败!");
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(SearchActivity.this);
        if(searchBannerPresenter != null){
            searchBannerPresenter.catchView();
        }
    }

//    @Override
//    public void homesuccess(List<HomeBean.CategoryListBean> categoryList) {
//        if(categoryList != null){
//
//        }
//    }
//
//    @Override
//    public void homefailed(Exception e) {
//        toast.setText("请求失败!");
//        toast.setGravity(Gravity.CENTER,0,0);
//        toast.show();
//    }
}
