package com.example.ongteckwu.travelapp;


/**
 * Created by Paul on 19/11/2016.
 */

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {

    private Context mContext;
    private List<Album> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView travelRoute, travelTime, travelCost;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            travelRoute = (TextView) view.findViewById(R.id.here_to_there);
            travelCost = (TextView) view.findViewById(R.id.transport_cost);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            travelTime = (TextView) view.findViewById(R.id.time_taken);

        }
    }


    public AlbumsAdapter(Context mContext, List<Album> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Album album = albumList.get(position);
//        holder.title.setText(album.getName());
//        holder.count.setText(album.getNumOfSongs() + " songs");

        holder.travelRoute.setText(album.getTravelRoute());
        holder.travelTime.setText(album.getTravelTime());
        holder.travelCost.setText(album.getTravelCost());


        // loading album cover using Glide library
        Glide.with(mContext).load(album.getTravelIcon()).into(holder.thumbnail);

//        holder.overflow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showPopupMenu(holder.overflow);
//            }
//        });
    }


    @Override
    public int getItemCount() {
        return albumList.size();
    }
}