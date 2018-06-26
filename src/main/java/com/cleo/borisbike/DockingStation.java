package com.cleo.borisbike;

import java.util.ArrayList;

public class DockingStation
{
    static final int DOCKING_LENGTH = 20;

    private ArrayList <Bike> bikeList;

    public DockingStation()
    {
        bikeList = new ArrayList<>(DOCKING_LENGTH);
    }

    public Object releaseBike()
    {
        return this.bikeList.get(bikeList.size() - 1);
    }

    public String dockYourBike(Bike bikeDocked)
    {
        if (this.bikeList.size() >= DOCKING_LENGTH)
        {
            throw new RuntimeException("Docking Station Full!");
        } else
            {
                this.bikeList.add(bikeDocked);
                return "Bike Accepted";
            }
    }
}
