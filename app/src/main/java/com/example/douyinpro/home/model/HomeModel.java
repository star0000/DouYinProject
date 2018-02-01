package com.example.douyinpro.home.model;

import com.example.douyinpro.api.Api;
import com.example.douyinpro.home.bean.HomeBean;
import com.example.douyinpro.home.presenter.HomePresenterInterface;
import com.example.douyinpro.retrofit.RetrofitHelper;
import com.example.douyinpro.url.UrlClass;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by 墨羽 on 2018/2/1.
 */

public class HomeModel {

    public void doPost(final HomePresenterInterface homePresenterInterface){
        Retrofit retrofit = RetrofitHelper.getRetrofit(UrlClass.URL_BASE);
        Api api = retrofit.create(Api.class);
        api.getHomeString()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HomeBean>() {
                    @Override
                    public void accept(HomeBean homeBean) throws Exception {
                        if(homeBean != null){
                            List<HomeBean.CategoryListBean> categoryList = homeBean.getCategory_list();
                            homePresenterInterface.HomeSuccess(categoryList);
                        }

                    }
                });
    }

}
