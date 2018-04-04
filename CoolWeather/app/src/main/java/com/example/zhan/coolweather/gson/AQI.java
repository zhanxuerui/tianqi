package com.example.zhan.coolweather.gson;

/**
 * Created by zhan on 2018/4/3.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
