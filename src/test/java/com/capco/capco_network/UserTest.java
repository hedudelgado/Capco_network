package com.capco.capco_network;

import com.capco.capco_network.domain.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sorry on 17/04/2016.
 */
public class UserTest {

    User user;

    @Before
    public void setUp(){
       user = new User("Spike");
    }

    @Test
    public void testUser(){
        assertNotNull(user);
    }
    @Test
    public void testGetterName(){
        assertNotNull(user.getName());
        assertNotEquals("", user.getName());
    }
    //@After

}