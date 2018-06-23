package com.cleo.borisbike;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;


public class DockingStationTest
{

    @Test
    void DockingStationCreatesNewInstance()
    {
        DockingStation dock = new DockingStation();

        assertThat(dock, instanceOf(DockingStation.class));
    }

}
