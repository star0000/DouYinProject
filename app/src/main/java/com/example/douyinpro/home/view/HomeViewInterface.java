package com.example.douyinpro.home.view;

import com.example.douyinpro.home.bean.HomeBean;

import java.util.List;

/**
 * Created by 墨羽 on 2018/2/1.
 */

public interface HomeViewInterface {

    void homesuccess(List<HomeBean.CategoryListBean> categoryList);
    void homefailed(Exception e);

}
