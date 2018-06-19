package com.codecool.carracing;

public class Truck extends Vehicle {
    private int breakdownTurnsLeft;

    public Truck() {
        this.name = Integer.toString(Util.getRandomNumberBetweenAandB(0, 1000));
        this.distanceTraveled = 0;
        this.speed = 100;
        this.breakdownTurnsLeft = 0;
        this.type = "truck";
    }

    boolean isBrokenDown() {
        return this.breakdownTurnsLeft > 0;
    }

    public void moveForAnHour(Race race) {
        if (this.breakdownTurnsLeft > 0) {
            this.breakdownTurnsLeft--;
        } else {
            int chance = Util.getRandomNumberBetweenAandB(1, 100);
            if (chance <= 5) {
                this.breakdownTurnsLeft = 2;
            } else {
                this.distanceTraveled += speed;
            }
        }
    }
}
