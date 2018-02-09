package com.example.douyinpro.home.model;

import com.example.douyinpro.api.Api;
import com.example.douyinpro.home.bean.SearchBannerBean;
import com.example.douyinpro.home.presenter.SearchBannerPresenterInterface;
import com.example.douyinpro.retrofit.RetrofitHelper;
import com.example.douyinpro.url.UrlClass;


import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by 墨羽 on 2018/2/4.
 */

public class SearchBannerModel {

    public void doPost(final SearchBannerPresenterInterface searchBannerPresenterInterface){

        Retrofit retrofit = RetrofitHelper.getRetrofit(UrlClass.URL_BASE);
        Api api = retrofit.create(Api.class);
        api.getSearchBannerString()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<SearchBannerBean>() {
                    @Override
                    public void accept(SearchBannerBean searchBannerBean) throws Exception {
                           if(searchBannerBean != null){
                               List<SearchBannerBean.BannerBean> bannerList = searchBannerBean.getBanner();
                               searchBannerPresenterInterface.SearchBannerSuccess(bannerList);
                           }
                    }
                });


    }

}
