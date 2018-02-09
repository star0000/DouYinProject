package com.example.douyinpro.home.presenter;

import com.example.douyinpro.home.bean.SearchBannerBean;
import com.example.douyinpro.home.model.SearchBannerModel;
import com.example.douyinpro.home.view.SearchBannerViewInterface;

import java.util.List;

/**
 * Created by 墨羽 on 2018/2/4.
 */

public class SearchBannerPresenter implements SearchBannerPresenterInterface{

    private SearchBannerViewInterface searchBannerViewInterface;
    private final SearchBannerModel searchBannerModel;

    public SearchBannerPresenter(SearchBannerViewInterface searchBannerViewInterface) {
        this.searchBannerViewInterface = searchBannerViewInterface;
        searchBannerModel = new SearchBannerModel();
    }

    public void excuteQuest(){
        searchBannerModel.doPost(this);
    }

    @Override
    public void SearchBannerSuccess(List<SearchBannerBean.BannerBean> bannerList) {
        if(bannerList != null){
            searchBannerViewInterface.SearchBannersuccess(bannerList);
        }
    }

    @Override
    public void SearchBannerFailed(Exception e) {
      searchBannerViewInterface.SearchBannerfailed(e);
    }

    public void catchView(){
        if(searchBannerViewInterface != null){
            searchBannerViewInterface = null;
        }
    }
}
