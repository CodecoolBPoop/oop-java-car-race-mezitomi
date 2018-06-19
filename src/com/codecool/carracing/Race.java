package com.codecool.carracing;

import java.util.ArrayList;
import java.util.List;

class Race {
    private List<Vehicle> vehicles;

    private void createVehicles() {
        List<Vehicle> Vehicles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Vehicles.add(new Car());
            Vehicles.add(new Motorcycle(i + 1));
            Vehicles.add(new Truck());
        }
        this.vehicles = Vehicles;
    }

    private void printRaceResults() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.name + ": " + vehicle.distanceTraveled + "km  " + vehicle.type);
        }
    }

    public static void main(String[] args) {
        Race race = new Race();
        race.createVehicles();
        race.simulateRace(race);
        race.printRaceResults();
    }

    private void simulateRace(Race race) {
        for (int i = 0; i < 50; i++) {
            Weather.setRaining();
            for (Vehicle vehicle : race.vehicles) {
                vehicle.moveForAnHour(race);
            }
        }
    }

    boolean isThereABrokenTruck() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).isBrokenDown()) {
                    return true;
                }
            }
        }
        return false;
    }

}
