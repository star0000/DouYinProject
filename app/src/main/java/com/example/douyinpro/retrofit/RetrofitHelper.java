package com.example.douyinpro.retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 墨羽 on 2018/1/31.
 */

public class RetrofitHelper {

   private static volatile Retrofit retrofit;

    public RetrofitHelper() {

    }

    public static Retrofit getRetrofit(String baseUrl){
       if(retrofit == null){
           synchronized (RetrofitHelper.class){
               if(null == retrofit){
                   OkHttpClient client = new OkHttpClient.Builder()
                           .build();
                   retrofit = new Retrofit.Builder()
                           .baseUrl(baseUrl)
                           .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                           .addConverterFactory(GsonConverterFactory.create())
                           .client(client)
                           .build();
               }
           }
       }
       return retrofit;
    }

}
