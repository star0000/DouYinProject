package com.example.douyinpro.home.presenter;

import com.example.douyinpro.home.bean.SearchBannerBean;

import java.util.List;

/**
 * Created by 墨羽 on 2018/2/4.
 */

public interface SearchBannerPresenterInterface {

    void SearchBannerSuccess(List<SearchBannerBean.BannerBean> bannerList);
    void SearchBannerFailed(Exception e);

}
