package com.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;

/**
 * Created by root on 16/8/17.
 */
@Data
public class MovieResponse {

    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<Movie> results;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;
}
