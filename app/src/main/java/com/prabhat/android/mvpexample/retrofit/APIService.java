package com.prabhat.android.mvpexample.retrofit;

import com.prabhat.android.mvpexample.bean.CityResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by fdc10 on 1/18/2018.
 */

public interface APIService {

    @FormUrlEncoded
    @POST("showStateCity")
    Call<CityResponse> getCityList(@Field("state_name") String state_name);

}
