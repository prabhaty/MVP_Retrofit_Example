package com.prabhat.android.mvpexample.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Android on 1/19/2018.
 */

public class CityResponse {

    @SerializedName("status")
    @Expose
    String re;

    @SerializedName("message")
    @Expose
    String msg;

    @SerializedName("data")
    @Expose
    private ArrayList<City> citylist = new ArrayList<>();

    public String getRe() {
        return re;
    }

    public void setRe(String re) {
        this.re = re;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    /**
     * @return The contacts
     */
    public ArrayList<City> getCityList() {
        return citylist;
    }

    /**
     * @param citylist The contacts
     */
    public void setCityList(ArrayList<City> citylist) {
        this.citylist = citylist;
    }
}
