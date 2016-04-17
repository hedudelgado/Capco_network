package com.capco.capco_network.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sorry on 17/04/2016.
 */
public class MessageTest {

    Message message;

    @Before
    public void setup(){
    message = new Message("doing Capco tech test");
    }
    @Test
    public void testmessage(){
        assertNotNull(message);
    }

    @Test
    public void testMessage(){
        assertNotNull(message);
        assertNotEquals("", message.getText());
    }
}

