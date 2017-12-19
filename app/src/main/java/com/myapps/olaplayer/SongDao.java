package com.myapps.olaplayer;

import android.arch.paging.LivePagedListProvider;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.myapps.olaplayer.model.Song;

import java.util.List;

/**
 * Created by MYPC on 12/16/2017.
 */

@Dao
public interface SongDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertAll(List<Song> songs);

    @Query("SELECT * FROM Song")
    public abstract LivePagedListProvider<Integer, Song> songsByTitle();
}
