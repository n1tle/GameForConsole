package org.example.Cubes;

import org.example.Interface.GameInterface;
import org.example.Players.RealPlayer;

public class FirstMove {

    public static int getRandomMove() {
        System.out.println(RealPlayer.getPlayerName() + ", your cube for first move:");

        int index = (int) (Math.random() * 7);
        switch (index) {
            case 1 -> GameInterface.generateOneDot();
            case 2 -> GameInterface.generateTwoDots();
            case 3 -> GameInterface.generateThreeDots();
            case 4 -> GameInterface.generateFourDots();
            case 5 -> GameInterface.generateFiveDots();
            case 6 -> GameInterface.generateSixDots();
            default -> System.out.println("The cube stood on an edge");
        }
        return index;
    }

}
