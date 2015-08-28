package com.example.publictransportalarm.app.domain;

public class OvergroundStop {
    public String name;
    public Coordinates coordinates;

    @Override
    public String toString() {
        return "OvergroundStop{" +
                "station='" + name + '\'' +
                ", coordinates='" + coordinates + '\'' +
                '}';
    }
}
