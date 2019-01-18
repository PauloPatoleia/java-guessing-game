package org.academiadecodigo.bootcamp22.GuessingGame;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Utils.setDebuggingMode(true);

        Players playersList[] = new Players[3];

        playersList[0] = new Players("mahira");
        playersList[1] = new Players("henrique");
        playersList[2] = new Players("filipe");



        Game game10 = new Game(5, playersList);
        game10.start();

    }

}
