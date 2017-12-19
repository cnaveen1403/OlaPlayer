package com.myapps.olaplayer.rest;

import com.myapps.olaplayer.model.Song;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by MYPC on 12/17/2017.
 */

public interface ApiInterface {
    @GET("studio")
    Call<List<Song>> getSongsDetails();
}
