package org.example.Interface;

import org.example.Cubes.Cube;
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
        showTurn();
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

        System.out.println("You have a minute to give an answer. Time has passed");
        ResponseTime.responseTimer.schedule(ResponseTime.task1, 4000);
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

    private static void generateSixDots() {
        System.out.println("Cube:");
        System.out.println("● ● ●");
        System.out.println("● ● ●");
    }

    private static void generateFiveDots() {
        System.out.println("Cube:");
        System.out.println("● ●");
        System.out.println(" ●");
        System.out.println("● ●");
    }

    private static void generateFourDots() {
        System.out.println("Cube:");
        System.out.println("● ●");
        System.out.println("● ●");
    }

    private static void generateThreeDots() {
        System.out.println("Cube:");
        System.out.println("● ● ●");
    }

    private static void generateTwoDots() {
        System.out.println("Cube:");
        System.out.println("● ●");
    }

    private static void generateOneDot() {
        System.out.println("Cube:");
        System.out.println("●");
    }

}
