package com.prabhat.android.mvpexample.retrofit;

import com.prabhat.android.mvpexample.retrofit.APIService;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Android on 1/19/2018.
 */

public class RetrofitInstanceClass {

    String BaseRUL = "";

    public RetrofitInstanceClass(String baseRUL) {
        this.BaseRUL = baseRUL;
    }

    // retrofit method
    public APIService api() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseRUL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())   // for rx android
                .build();


        APIService service = retrofit.create(APIService.class);

        return service;
    }



}
