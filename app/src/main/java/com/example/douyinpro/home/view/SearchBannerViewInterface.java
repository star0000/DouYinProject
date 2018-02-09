package com.example.douyinpro.home.view;

import com.example.douyinpro.home.bean.SearchBannerBean;

import java.util.List;

/**
 * Created by 墨羽 on 2018/2/4.
 */

public interface SearchBannerViewInterface {

    void SearchBannersuccess(List<SearchBannerBean.BannerBean> bannerList);
    void SearchBannerfailed(Exception e);

}
