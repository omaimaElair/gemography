package com.example.gemography;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.gemography.models.Repository;
import com.example.gemography.requests.ReposRQ;
import com.example.gemography.responses.ReposRs;
import com.example.gemography.retrofit.ApiManager;

import java.util.List;

import javax.security.auth.login.LoginException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}