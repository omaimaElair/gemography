package com.example.gemography.retrofit;

import com.example.gemography.responses.ReposRs;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ApiInterface {
    @GET("repositories")
    Call<ReposRs> getRepos(@QueryMap Map<String,String> fields);
}
