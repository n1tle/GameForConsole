package org.example.Players;

import java.util.Random;

public class Bot1 {
    public static String botName;
    public static String[] name = {"Jack Page", "Nuclear", "Car", "Junior", "Coach", "Boss"};
    public static int b1Index = (int) (Math.random() * 7);


    public static String RandomBotName() {
        Random random = new Random();
        int index = random.nextInt(name.length);
        botName = name[index];
        return botName;
    }


    public static String getBotName() {
        return botName;
    }

}
