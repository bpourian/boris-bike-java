package com.cleo.borisbike;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;


public class DockingStationTest
{
    private DockingStation dock = null;

    @BeforeEach
    void init()
    {
        dock = new DockingStation();
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Bike bikeMock;


    @Test
    void DockingStationCreatesNewInstance()
    {
        assertThat(dock, instanceOf(DockingStation.class));
    }

    @Test
    void DockingStationToReleaseBike()
    {
        dock.dockYourBike(bikeMock);

        assertThat(dock.releaseBike(), instanceOf(Bike.class));
    }

    @Test
    void DockingStationDocksABike()
    {
        assertEquals(dock.dockYourBike(bikeMock), "Bike Accepted");
    }
}
