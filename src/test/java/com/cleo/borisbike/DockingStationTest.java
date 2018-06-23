package com.cleo.borisbike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;


public class DockingStationTest
{
    private DockingStation dock = null;

    @BeforeEach
    void init()
    {
        dock = new DockingStation();
    }

    @Test
    void DockingStationCreatesNewInstance()
    {
        assertThat(dock, instanceOf(DockingStation.class));
    }

    @Test
    void DockingStationToReleaseBike()
    {
        assertThat(dock.releaseBike(), instanceOf(Bike.class));
    }
}
