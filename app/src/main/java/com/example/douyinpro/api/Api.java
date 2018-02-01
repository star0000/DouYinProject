package com.example.douyinpro.api;

import com.example.douyinpro.home.bean.HomeBean;

import io.reactivex.Observable;
import retrofit2.http.POST;

/**
 * Created by 墨羽 on 2018/1/31.
 */

public interface Api {

    @POST("aweme/v1/category/list/?cursor=0&count=5&retry_type=no_retry&iid=23028350734&device_id=42386607829&ac=wifi&channel=xiaomi&aid=1128&app_name=aweme&version_code=169&version_name=1.6.9&device_platform=android&ssmix=a&device_type=Redmi+Note+4&device_brand=Xiaomi&language=zh&os_api=23&os_version=6.0&uuid=863411038560129&openudid=87f33cdff2475c29&manifest_version_code=169&resolution=1080*1920&dpi=480&update_version_code=1692&_rticket=1515741876521&ts=1515741878&as=a195564586db1ac208&cp=61b2af5864845224e1")
    Observable<HomeBean> getHomeString();

}
