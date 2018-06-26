package com.cleo.borisbike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.instanceOf;

class BikeTest
{

    private Bike bike = null;

    @BeforeEach
    void init()
    {
        bike = new Bike(true);
    }

    @Test
    void BikeClassCreatesNewInstance()
    {
        assertThat(bike, instanceOf(Bike.class));
    }

    @Test
    void BikeToBeWorking()
    {
        assertEquals(true, bike.getWorking());
    }

    @Test
    void BikeNotToBeWorking()
    {
        bike.setWorking(false);

        assertEquals(bike.getWorking(), false);
    }


}