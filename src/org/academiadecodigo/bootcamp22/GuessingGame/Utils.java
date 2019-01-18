package org.academiadecodigo.bootcamp22.GuessingGame;

public class Utils {

    private static boolean debuggingMode = false;

    public static void setDebuggingMode(boolean mode) {
        debuggingMode = mode;

        if(mode) {
            System.out.println("Debugging mode ON");
        }
    }

    public static void log(String text) {

        if(debuggingMode) {
            System.out.println(text);
        }

    }
}
