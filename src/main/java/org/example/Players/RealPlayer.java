package org.example.Players;

import java.util.Random;

public class RealPlayer {
    public static String playerName;

    public static String[] names = {"King", "Genius", "Mosquito", "Skoof", "Pablo Escobar", "Vladimirskiy central"};

    public static void getRandomName() {
        Random random = new Random();
        int index = random.nextInt(names.length);
        playerName = names[index];
    }


    public static void setPlayerName(String playerName) {
        RealPlayer.playerName = playerName;
    }

    public static String getPlayerName() {
        return playerName;
    }

}
