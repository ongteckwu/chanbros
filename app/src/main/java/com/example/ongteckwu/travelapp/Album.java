package com.example.ongteckwu.travelapp;

/**
 * Created by Paul on 19/11/2016.
 */

public class Album {

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

}