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
        Bike bike = this.bikeList.get(bikeList.size() - 1);

        if (bike.getWorking() == true) {
            return bike;
        } else throw new RuntimeException("Bike selected out of order!");
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
