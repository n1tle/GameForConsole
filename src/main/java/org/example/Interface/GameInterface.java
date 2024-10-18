package org.example.Interface;

import org.example.Cubes.Cube;
import org.example.Players.RealPlayer;

import java.util.Scanner;

public class GameInterface {

    private static Cube cubeGame;


    public static void startGame() {
        System.out.println("Enter the player's name or generated random name");
        System.out.println("1 - Enter name");
        System.out.println("2 - Generate random name");


        RealPlayer.playerName = getScannerData("Enter the player's name or generated random name");

        cubeGame = new Cube();
        showTurn();
    }

    private static void showTurn() {
        cubeGame.getCubeDots();
        System.out.println("Your cubes:");
        generateCubes(cubeGame.getFirstCubeDots());
        generateCubes(cubeGame.getSecondCubeDots());
        getPlayerChoice();
    }

    private static void getPlayerChoice() {
        String answer = getScannerData("Сумма кубиков с компьютером больше 15? да/нет");
        if (answer.equals("да")) {
            checkTurnResult(true);
        } else if (answer.equals("нет")) {
            checkTurnResult(false);
        } else {
            System.out.println("Неккоректный ответ. попробуйте ещё раз.");
            getPlayerChoice();
        }
    }

    private static void checkTurnResult(boolean choice) {
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

    private static String getScannerData(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }
}
