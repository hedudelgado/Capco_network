package com.capco.capco_network.domain;

/**
 * Created by sorry on 17/04/2016.
 */
public class User {

    private String name;
    public static Timeline timeline = new Timeline();

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}