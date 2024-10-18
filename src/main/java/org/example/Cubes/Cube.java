package org.example.Cubes;

public class Cube {
    private int firstCubeDots;
    private int secondCubeDots;

    public int getFirstCubeDots() {
        return firstCubeDots;
    }

    public int getSecondCubeDots() {
        return secondCubeDots;
    }

    public static int getTurnCounter() {
        return turnCounter;
    }

    private static int turnCounter = 1;

    private int generateNumberOfDots() {
        int min = 1;
        int max = 6;
        max -= min;

        return (int) (Math.random() * ++max) + min;
    }

    public void getCubeDots() {
        if (turnCounter == 5) {
            showResult();
        }
        else {
            firstCubeDots = generateNumberOfDots();
            secondCubeDots = generateNumberOfDots();
            turnCounter++;
        }

    }

    private static void showResult() {
    }
}
