package com.example.ongteckwu.travelapp;

/**
 * Created by Paul on 19/11/2016.
 */

public class Album {
//    private String name;
//    private int numOfSongs;
//    private int thumbnail;

    private String travelRoute;
    private String travelCost;
    private String travelTime;
    private int travelIcon;

    public Album(String travelRoute, String travelCost, String travelTime, int travelIcon) {
        this.travelRoute = travelRoute;
        this.travelCost = travelCost;
        this.travelTime = travelTime;
        this.travelIcon = travelIcon;
    }

    public int getTravelIcon() {

        return travelIcon;
    }

    public void setTravelIcon(int travelIcon) {
        this.travelIcon = travelIcon;
    }

    public Album() {
    }

    public String getTravelRoute() {
        return travelRoute;
    }

    public void setTravelRoute(String travelRoute) {
        this.travelRoute = travelRoute;
    }

    public String getTravelCost() {
        return travelCost;
    }

    public void setTravelCost(String travelCost) {
        this.travelCost = travelCost;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }
    //    public Album(String name, int numOfSongs, int thumbnail) {
//        this.name = name;
//        this.numOfSongs = numOfSongs;
//        this.thumbnail = thumbnail;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getNumOfSongs() {
//        return numOfSongs;
//    }
//
//    public void setNumOfSongs(int numOfSongs) {
//        this.numOfSongs = numOfSongs;
//    }
//
//    public int getThumbnail() {
//        return thumbnail;
//    }
//
//    public void setThumbnail(int thumbnail) {
//        this.thumbnail = thumbnail;
//    }
}