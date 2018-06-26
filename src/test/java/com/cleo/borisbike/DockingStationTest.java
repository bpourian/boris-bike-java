package com.cleo.borisbike;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertThrows;
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
    private Bike bikeMock;


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
        assertEquals("Bike Accepted", dock.dockYourBike(bikeMock));
    }

    @Test
    void DockingStationToThrowErrorIfMoreThanTwentyBikesAdded()
    {
        for (int i = 0; i < DockingStation.DOCKING_LENGTH ; i++) {
            dock.dockYourBike(bikeMock);
        }

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            dock.dockYourBike(bikeMock);
        });

        assertEquals("Docking Station Full!", exception.getMessage());
    }
}
