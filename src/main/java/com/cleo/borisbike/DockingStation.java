package com.cleo.borisbike;

public class DockingStation
{

    Object bikeList = null;

    public Object releaseBike()
    {
        return this.bikeList;
    }

    public String dockYourBike(Bike bikeDocked)
    {
        this.bikeList = bikeDocked;
        return "Bike Accepted";
    }
}
