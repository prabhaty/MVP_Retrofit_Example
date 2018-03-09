package com.prabhat.android.mvpexample.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Android on 1/19/2018.
 */

public class City {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("city_name")
    @Expose
    private String city_name;
    @SerializedName("city_state")
    @Expose
    private String city_state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity_state() {
        return city_state;
    }

    public void setCity_state(String city_state) {
        this.city_state = city_state;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
}
