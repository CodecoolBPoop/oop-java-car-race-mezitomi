package com.codecool.carracing;

import java.util.Random;

class Util {

    static int getRandomNumberBetweenAandB(int A, int B) {
        Random r = new Random();
        int Low = Math.min(A, B);
        int High = Math.max(A, B);
        return r.nextInt(High - Low) + Low;
    }

    static String getRandomNameFromArray(String[] namePool) {
        Random r = new Random();
        return namePool[r.nextInt(namePool.length - 1)] +
                namePool[r.nextInt(namePool.length - 1)];
    }

}
