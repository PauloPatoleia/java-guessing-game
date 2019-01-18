package org.academiadecodigo.bootcamp22.GuessingGame;

public class Players {

   private  String name;

   public Players(String name) {
       this.name = name;
   }

    public int chooseNumber(int max) {

        return RandomGen.genRandomNumber(max);

    }

    public String getName() {
        return this.name;
    }
}
