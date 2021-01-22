package com.example.gemography.requests;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

public class AppRequest {
    public Map<String, String> getHash() {

        Gson gson = new Gson();

        Type type = new TypeToken<Map<String, String>>() {}.getType();

        Map<String, String> map = gson.fromJson(gson.toJson(this), type);

        return map;
    }
}
