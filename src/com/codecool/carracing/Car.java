package com.codecool.carracing;

public class Car extends Vehicle {

    public Car() {
        this.speed = Util.getRandomNumberBetweenAandB(80, 110);
        this.distanceTraveled = 0;
        String names = "Augury Silver Prospect Avalanche Tigress Marvel Eos Motive Crown Mirage Realm Climax Vigor Inferno Treasure Striker Instinct Formula Charm Daydream Twister Dragon Eon Prestige Symbol Legacy Hero Stardust";
        String[] namePool = names.split("\\s+");
        this.name = Util.getRandomNameFromArray(namePool);
        this.type = "car";
    }

    @Override
    public void moveForAnHour(Race race) {
        this.distanceTraveled += race.isThereABrokenTruck() ? 75 : this.speed;
    }
}

