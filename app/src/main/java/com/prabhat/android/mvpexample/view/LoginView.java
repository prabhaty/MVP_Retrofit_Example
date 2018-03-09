package com.prabhat.android.mvpexample.view;

import com.prabhat.android.mvpexample.bean.City;

import java.util.ArrayList;

/**
 * Created by Android on 1/18/2018.
 */

public interface LoginView  {


    void showList(ArrayList<City> list);
    void listSuccess();

}
