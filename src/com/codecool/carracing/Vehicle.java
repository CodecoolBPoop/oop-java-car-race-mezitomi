package com.codecool.carracing;

abstract class Vehicle {

    int speed;
    String name;
    int distanceTraveled;
    String type;

    public abstract void moveForAnHour(Race race);


}
