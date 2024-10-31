package org.example.Cubes;

public class Cube {
    private int firstCubeDots;
    private int secondCubeDots;
    private int threeCubeDots;
    private int fourCubeDots;
    private int fiveCubeDots;

    public int getFirstCubeDots() {

        return firstCubeDots;
    }

    public int getSecondCubeDots() {
        return secondCubeDots;
    }

    public int getThreeCubeDots() {
        return threeCubeDots;
    }

    public int getFourCubeDots() {
        return fourCubeDots;
    }

    public int getFiveCubeDots() {
        return fiveCubeDots;
    }

    public static int getTurnCounter() {

        return turnCounter;
    }

    private static int turnCounter = 1;

    public static int generateNumberOfDots() {
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
            threeCubeDots = generateNumberOfDots();
            fourCubeDots = generateNumberOfDots();
            fiveCubeDots = generateNumberOfDots();

            turnCounter++;
        }

    }

    private static void showResult() {
    }


}
