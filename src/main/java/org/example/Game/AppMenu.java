package org.example.Game;

import org.example.Interface.GameInterface;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppMenu {
    public static void start() {
        System.out.println("Welcome to the game!");
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
            case 2 -> GameInterface.startGame();
            case 3 -> closeGame();
            default -> {
                System.out.println("An incorrect selection was entered." + " Please, try again.");
                showMenu();
            }
        }
}

private static void readRules() {
    System.out.println("Game rules:");
    System.out.println("Please wait, the rules will be written soon");
    System.out.println("1 - Back");
    openMenu(stepBack());


}

private static void openMenu(int stepBack) {
  switch (stepBack) {
     case 1 -> {
         start();
     }
       default -> {
            System.out.println("Please choise number 1");
       }
    }
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

    private static int stepBack() {
        var choice = 0;
        try {
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please choice number 1. Try again.");
            return stepBack();
        }
        return choice;
    }






}
