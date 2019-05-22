package com.speedweather.android.gson;

import android.text.style.UpdateAppearance;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Upate update;
    public class Upate {
        @SerializedName("loc")
        public String updateTime;
    }
}
