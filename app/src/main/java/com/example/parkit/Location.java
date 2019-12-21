package com.example.parkit;

public class Location {
    private String venueName, locAddress, desc;

    public Location(){

    }

    public Location(String venueName, String locAddress, String desc){
        this.venueName = venueName;
        this.locAddress = locAddress;
        this.desc = desc;
    }

    public String getVenueName(){
        return venueName;
    }
    public void setVenueName(String venueName){
        this.venueName = venueName;
    }
    public String getLocAddress(){
        return locAddress;
    }
    public void setLocAddress(String locAddress){
        this.locAddress = locAddress;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }

}
