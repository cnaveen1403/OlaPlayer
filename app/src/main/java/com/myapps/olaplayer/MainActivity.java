package com.myapps.olaplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.myapps.olaplayer.model.Song;
import com.myapps.olaplayer.rest.ApiInterface;
import com.myapps.olaplayer.util.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Song>> call = apiService.getSongsDetails();
        call.enqueue(new Callback<List<Song>>() {
            @Override
            public void onResponse(Call<List<Song>> call, Response<List<Song>> response) {
                if(response.isSuccessful()){
                    List<Song> song = response.body();
                    Log.e(TAG, "onResponse: song size : " + song.size());
                    // Can iterate through list and grab Getters from POJO
                    for(Song p: song){
                        Log.e(TAG, "onResponse: title >>> " + p.getSong());
                        Log.e(TAG, "onResponse: audio url >>> " + p.getUrl());
                        Log.e(TAG, "onResponse: artists >>> " + p.getArtists());
                        Log.e(TAG, "onResponse: getCoverImage >>> " + p.getCoverImage());
                        Log.e(TAG, "onResponse: >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
                    }
                } else {
                    // Error response...
                }

            }

            @Override
            public void onFailure(Call<List<Song>> call, Throwable t) {
                Log.e(TAG, "onResponse: response on failure >>>> " + t.toString());
            }
        });
    }
}
