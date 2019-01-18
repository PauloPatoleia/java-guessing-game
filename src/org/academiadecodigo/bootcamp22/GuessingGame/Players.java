package org.academiadecodigo.bootcamp22.GuessingGame;

public class Players {

   private String name;
   private int[] guessedNumbers;
   private int guesses;

   public Players(String name) {
       this.name = name;
       guesses = 0;
   }

    public int chooseNumber(int max) {

        while(true) {

            int guess = RandomGen.genRandomNumber(max);

            if(!isRepeatedGuess(guess)) {

                return guess;

            }
        }
    }

    private boolean isRepeatedGuess(int guess) {

        for (int i = 0; i < guessedNumbers.length; i++) {
            if(guess == guessedNumbers[i]) {
                return true;
            }
        }

        guessedNumbers[guesses] = guess;
        guesses++;
        return false;
    }

    public String getName() {
        return this.name;
    }

    public void guessNotify(int guess) {
        guessedNumbers[guesses] = guess;
        guesses ++;
    }

    public void setGuessedNumbers(int n) {
        this.guessedNumbers = new int[n];
    }
}
