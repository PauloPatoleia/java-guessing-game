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
        tellPlayerMaxNumber(this.max);

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

                shareGuess(playersList[i], playerGuess);
            }
        }
    }

    public void shareGuess(Players player, int guess) {

        for (int i = 0; i < playersList.length ; i++) {

            if(playersList[i] != player) {
                playersList[i].guessNotify(guess);
            }

        }

    }

    public void tellPlayerMaxNumber(int max) {
        for (int i = 0; i < playersList.length ; i++) {
            playersList[i].setGuessedNumbers(max);
        }
    }


}
