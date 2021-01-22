package com.example.gemography.models;

import com.google.gson.annotations.SerializedName;

public class Owner {
    @SerializedName("login")
    String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
