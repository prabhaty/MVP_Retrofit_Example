package com.prabhat.android.mvpexample.presenters;

import com.prabhat.android.mvpexample.bean.CityResponse;
import com.prabhat.android.mvpexample.model.LoginModel;
import com.prabhat.android.mvpexample.retrofit.APIService;
import com.prabhat.android.mvpexample.WebserviceUtils.WebServiceConstant;
import com.prabhat.android.mvpexample.retrofit.RetrofitInstanceClass;
import com.prabhat.android.mvpexample.view.LoginView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Android on 1/18/2018.
 */

public class PreseneterImpl implements LoginModel {

    LoginView mLoginview;
    RetrofitInstanceClass retrofitInstanceClass;

    public PreseneterImpl(LoginView mLoginview) {
        this.mLoginview = mLoginview;

    }


    @Override
    public void showCityList() {

        retrofitInstanceClass = new RetrofitInstanceClass(WebServiceConstant.BASEURL);
        APIService apiService = retrofitInstanceClass.api();
        Call<CityResponse> call = apiService.getCityList("Madhya pradesh");
        call.enqueue(new Callback<CityResponse>() {
            @Override
            public void onResponse(Call<CityResponse> call, Response<CityResponse> response) {

                if (response.isSuccessful()) {
                    mLoginview.listSuccess();
                    mLoginview.showList(response.body().getCityList());
                }
            }

            @Override
            public void onFailure(Call<CityResponse> call, Throwable t) {

            }
        });


    }
}
