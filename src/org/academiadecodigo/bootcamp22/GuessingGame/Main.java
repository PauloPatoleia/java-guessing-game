package org.academiadecodigo.bootcamp22.GuessingGame;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Utils.setDebuggingMode(true);

        Players playersList[] = new Players[2];

        playersList[0] = new Players("mahira");
        playersList[1] = new Players("henrique");

        Game game10 = new Game(10, playersList);
        game10.start();
        Game game20 = new Game(20, playersList);
        game20.start();

    }
}
