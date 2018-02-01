package com.example.douyinpro.home.presenter;

import com.example.douyinpro.home.bean.HomeBean;
import com.example.douyinpro.home.model.HomeModel;
import com.example.douyinpro.home.view.HomeViewInterface;

import java.util.List;

/**
 * Created by 墨羽 on 2018/2/1.
 */

public class HomePresenter implements HomePresenterInterface{

    private HomeViewInterface homeViewInterface;
    private final HomeModel homeModel;

    public HomePresenter(HomeViewInterface homeViewInterface) {
        this.homeViewInterface = homeViewInterface;
        homeModel = new HomeModel();
    }

    public void excuteQuest(){
        homeModel.doPost(this);
    }

    @Override
    public void HomeSuccess(List<HomeBean.CategoryListBean> categoryList) {
        if(categoryList != null){
            homeViewInterface.homesuccess(categoryList);
        }
    }

    @Override
    public void HomeFailed(Exception e) {
          homeViewInterface.homefailed(e);
    }

    public void catchView(){
        if(homeViewInterface != null){
            homeViewInterface = null;
        }
    }
}
