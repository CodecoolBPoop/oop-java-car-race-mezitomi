package com.codecool.carracing;

class Weather {

    private static boolean isRaining = false;

    static boolean isRaining() {
        return isRaining;
    }

    static void setRaining() {
        isRaining = Util.getRandomNumberBetweenAandB(1, 10) <= 3;
    }
}
