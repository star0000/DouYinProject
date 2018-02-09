package com.example.douyinpro.home;

import com.example.douyinpro.home.bean.HomeBean;

import java.util.List;

/**
 * Created by 墨羽 on 2018/2/5.
 */

public class EventBusMessage {

    public List<HomeBean.CategoryListBean> CategoryList;

    public EventBusMessage(List<HomeBean.CategoryListBean> categoryList) {
        this.CategoryList = categoryList;
    }

}
