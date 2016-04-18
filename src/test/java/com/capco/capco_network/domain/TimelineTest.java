package com.capco.capco_network.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sorry on 17/04/2016.
 */
public class TimelineTest{

    Timeline timeline;

    @Before
    public void setup() {
        timeline = new Timeline();
    }

    @Test
    public void testtimeLine(){

        assertNotNull(timeline);
    }
}
