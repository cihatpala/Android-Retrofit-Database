package com.example.pala.androiddbtest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Repo {
    @SerializedName("flight_number")
    @Expose
    public String flightNumber;

    @SerializedName("launch_year")
    @Expose
    public String launchYear;

    @SerializedName("rocket")
    @Expose
    public Rocket rocket;

}
