package com.codecool.carracing;

public class Motorcycle extends Vehicle {
    public Motorcycle(int numberOfInstance) {
        this.speed = 100;
        this.distanceTraveled = 0;
        this.name = "Motorcycle " + Integer.toString(numberOfInstance);
        this.type = "motorcycle";
    }

    @Override
    public void moveForAnHour(Race race) {
        this.distanceTraveled += Weather.isRaining() ? this.speed - Util.getRandomNumberBetweenAandB(5, 50) : this.speed;
    }

}
