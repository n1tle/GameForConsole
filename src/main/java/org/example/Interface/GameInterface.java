package org.example.Interface;

import org.example.Cubes.Cube;
import org.example.Cubes.FirstMove;
import org.example.Players.Bot1;
import org.example.Players.RealPlayer;


import java.util.InputMismatchException;
import java.util.Scanner;


public class GameInterface {

    private static Cube cubeGame;


    public static void startGame() {
        System.out.println("Enter the player's name or generated random name");
        System.out.println("1 - Enter name");
        System.out.println("2 - Generate random name");

        checkChoiceName(getChoiceName());

        cubeGame = new Cube();
        //showTurn();

        FirstMove.getRandomMove();
        ComparisonMove();

    }

public static void ComparisonMove() {
    System.out.println("The drawing begins");
        int index = FirstMove.index;
        int b1Index = Bot1.b1Index;
        if (index > b1Index) {
            System.out.println("You start first");
            System.out.println(index + b1Index);
        } else if (index < b1Index) {
            System.out.println(Bot1.getBotName() + "goes first");

        }
}














    private static int getChoiceName() {
        var choice = 0;
        try {
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect menu entry type. Try again.");
            getChoiceName();
        }
        return choice;
    }

    private static void checkChoiceName(int choiceName) {
        switch (choiceName) {
            case 1 -> {
                Scanner sc = new Scanner(System.in);
                RealPlayer.setPlayerName(sc.nextLine());
            }
            case 2 -> RealPlayer.getRandomName();
            default -> {
                System.out.println("An incorrect selection was entered. Please, try again");
                startGame();
            }
        }
    }

    private static void showTurn() {
        System.out.println(RealPlayer.getPlayerName()+ "," + " your cubes:");
        cubeGame.getCubeDots();
        generateCubes(cubeGame.getFirstCubeDots());
        generateCubes(cubeGame.getSecondCubeDots());
        generateCubes(cubeGame.getThreeCubeDots());
        generateCubes(cubeGame.getFourCubeDots());
        generateCubes(cubeGame.getFiveCubeDots());

        System.out.println("You have a minute to give an answer. Time has passed");
        ResponseTime.responseTimer.schedule(ResponseTime.task1, 60000);
    }


    private static void generateCubes(int cubeDots) {
        switch (cubeDots) {
            case 1 -> generateOneDot();
            case 2 -> generateTwoDots();
            case 3 -> generateThreeDots();
            case 4 -> generateFourDots();
            case 5 -> generateFiveDots();
            case 6 -> generateSixDots();
        }
    }

    public static void generateSixDots() {
        System.out.println("Cube:");
        System.out.println("● ● ●");
        System.out.println("● ● ●");
    }

    public static void generateFiveDots() {
        System.out.println("Cube:");
        System.out.println("● ●");
        System.out.println(" ●");
        System.out.println("● ●");
    }

    public static void generateFourDots() {
        System.out.println("Cube:");
        System.out.println("● ●");
        System.out.println("● ●");
    }

    public static void generateThreeDots() {
        System.out.println("Cube:");
        System.out.println("● ● ●");
    }

    public static void generateTwoDots() {
        System.out.println("Cube:");
        System.out.println("● ●");
    }

    public static void generateOneDot() {
        System.out.println("Cube:");
        System.out.println("●");
    }

}
