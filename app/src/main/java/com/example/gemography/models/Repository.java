package com.example.gemography.models;

import com.google.gson.annotations.SerializedName;

public class Repository {
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("stargazers_count")
    private String stargazers_count;
    @SerializedName("owner")
    private Owner owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStargazers_count() {
        return stargazers_count;
    }

    public void setStargazers_count(String stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
