package com.example.vaibhav.recyclerviewretrofit;

/**
 * Created by vaibhav on 1/6/17.
 */


import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}