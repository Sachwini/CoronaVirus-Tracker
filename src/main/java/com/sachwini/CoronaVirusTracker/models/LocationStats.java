package com.sachwini.CoronaVirusTracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int latestTotalCases;
    private int diffYT;

    public int getDiffYT() {
        return diffYT;
    }

    public void setDiffYT(int diffYT) {
        this.diffYT = diffYT;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
