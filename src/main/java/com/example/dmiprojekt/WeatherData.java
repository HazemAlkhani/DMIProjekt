package com.example.dmiprojekt;

import java.sql.Timestamp;

public class WeatherData {

        int stationID;
        Timestamp datoTid;
        float precip;
        float precipMinutes;
        float avgTemp;
        float maxTemp;
        float minTemp;
        float sunshine;
        float avgWind;
        float maxWind;
        int cloudHeight;
        int cloudCover;



    // LinkedList<WeatherData> weatherData = new LinkedList<>();
        //currently, both station and weatherData has a connection to each other through their constructors.
        // Is this good practice?
        public WeatherData(int stationID, Timestamp datoTid, float precip, float precipMinutes, float avgTemp, float maxTemp, float minTemp, float sunshine, float avgWind, float maxWind, int cloudHeight, int cloudCover) {
            this.stationID = stationID;
            this.datoTid = datoTid;
            this.precip = precip;
            this.precipMinutes = precipMinutes;
            this.avgTemp = avgTemp;
            this.maxTemp = maxTemp;
            this.minTemp = minTemp;
            this.sunshine = sunshine;
            this.avgWind = avgWind;
            this.maxWind = maxWind;
            this.cloudHeight = cloudHeight;
            this.cloudCover = cloudCover;
        }
    public int getStation() {
        return stationID;
    }

    public Timestamp getDatoTid() {
        return datoTid;
    }

    public float getPrecip() {
        return precip;
    }

    public double getPrecipMinutes() {
        return precipMinutes;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public float getSunshine() {
        return sunshine;
    }

    public float getAvgWind() {
        return avgWind;
    }

    public float getMaxWind() {
        return maxWind;
    }

    public double getCloudHeight() {
        return cloudHeight;
    }

    public double getCloudCover() {
        return cloudCover;
    }

}
