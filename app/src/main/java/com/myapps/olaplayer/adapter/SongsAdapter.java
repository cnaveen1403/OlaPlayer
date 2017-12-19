package com.myapps.olaplayer.adapter;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.myapps.olaplayer.R;
import com.myapps.olaplayer.model.Song;

import java.util.List;

public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.SongViewHolder> {
    private List<Song> songs;
    private int rowLayout;
    private Context mContext;

    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class SongViewHolder extends RecyclerView.ViewHolder{
        LinearLayout songLayout;
        TextView songTitle;
        TextView data;
        TextView artists;
        ImageView coverImage;

        public SongViewHolder(View itemView) {
            super(itemView);
            songLayout = (LinearLayout) itemView.findViewById(R.id.songs_layout);
            songTitle = (TextView)itemView.findViewById(R.id.title);
            coverImage = (ImageView) itemView.findViewById(R.id.coverImage);
            artists = (TextView) itemView.findViewById(R.id.artists);

        }
    }
}
