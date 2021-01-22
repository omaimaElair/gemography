package com.example.gemography.responses;

import com.example.gemography.models.Repository;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReposRs {
    @SerializedName("total_count")
    private int total_count;
    @SerializedName("incomplete_results")
    private boolean incomplete_results;
    @SerializedName("items")
    private List<Repository> repos;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public boolean isIncomplete_results() {
        return incomplete_results;
    }

    public void setIncomplete_results(boolean incomplete_results) {
        this.incomplete_results = incomplete_results;
    }

    public List<Repository> getRepos() {
        return repos;
    }

    public void setRepos(List<Repository> repos) {
        this.repos = repos;
    }
}
