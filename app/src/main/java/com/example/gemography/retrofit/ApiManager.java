package com.example.gemography.retrofit;

import com.example.gemography.requests.ReposRQ;
import com.example.gemography.responses.ReposRs;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.gemography.Constants.BASE_URL;

public class ApiManager {
    private static ApiManager instance = null;
    private static ApiInterface apiInterface = null;

    public static ApiManager getInstance() {
        if (instance==null){
            instance=new ApiManager();
        }
        return instance;
    }
    public void setUpRetrofit(){
        ApiInterface apiInterface = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiInterface.class);
        instance.apiInterface=apiInterface;
    }
    public Call<ReposRs> getRepos(ReposRQ request){
        return apiInterface.getRepos(request.getHash());
    }

}
