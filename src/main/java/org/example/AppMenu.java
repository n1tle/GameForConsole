package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class AppMenu {
    public static void start() {
        System.out.println("Welcome to the game");
        System.out.println("1 - Read rules");
        System.out.println("2 - Star game");
        System.out.println("3 - Close the game");
        showMenu();
    }

public static void showMenu(){

    checkUserChoice(getUserChoice());

}

private static void checkUserChoice(int userChoise){
        switch (userChoise) {
            case 1 -> readRules();
            case 2 -> startGame();
            case 3 -> closeGame();
            default -> {
                System.out.println("An incorrect selection was entered." + " Please, try again later.");
                showMenu();
            }
        }
}

private static void readRules() {
    System.out.println("Game rules:");
    System.out.println("Soon");
}

private static void startGame() {

}


private static void closeGame() {
        System.exit(0);
}

    private static int getUserChoice() {
        var choice = 0;
        try {
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect menu entry type. Try again.");
            getUserChoice();
        }
        return choice;
    }








}