package com.example.douyinpro.home.presenter;

import com.example.douyinpro.home.bean.HomeBean;

import java.util.List;

/**
 * Created by 墨羽 on 2018/2/1.
 */

public interface HomePresenterInterface {

    void HomeSuccess(List<HomeBean.CategoryListBean> categoryList);
    void HomeFailed(Exception e);

}
