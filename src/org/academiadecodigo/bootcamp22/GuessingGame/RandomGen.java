package org.academiadecodigo.bootcamp22.GuessingGame;

public class RandomGen {

    public static int genRandomNumber(int n) {

        return (int) Math.floor(Math.random() * n);

    }
}
