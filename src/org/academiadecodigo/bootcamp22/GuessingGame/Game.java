package org.academiadecodigo.bootcamp22.GuessingGame;

public class Game {

    private int max;
    private Players[] playersList;

    public Game(int max, Players[] players) {
        this.max = max;
        this.playersList = players;
    }

    public void start() {

        Utils.log("Game started!");

        int chosenNumber = RandomGen.genRandomNumber(this.max);
        boolean RightGuess = false;

        Utils.log("I chose the number " + chosenNumber);

        while (!RightGuess) {

            for (int i = 0; i < playersList.length; i++) {

                int playerGuess = playersList[i].chooseNumber(this.max);

                Utils.log("Player " + playersList[i].getName() + " guessed " + playerGuess);

                if (chosenNumber == playerGuess) {

                    System.out.println(playersList[i].getName() + " won!");
                    RightGuess = true;
                    break;

                }
            }
        }
    }


}
