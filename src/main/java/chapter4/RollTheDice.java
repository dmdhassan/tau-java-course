package chapter4;

import java.util.Random;

public class RollTheDice {
    public static void main(String args[]) {
        int spaces = 20;
        int rolls = 5;
        int userSpace = 0;
        int diff = 0;
        boolean win = false;


        for (int i = 0; i < rolls; i++) {
            Random random = new Random();
            int die = random.nextInt(6) + 1;

            userSpace = userSpace + die;

            if (userSpace < spaces) {
                diff = spaces - userSpace;
            } else if (spaces < userSpace) {
                diff = userSpace - spaces;
            }


            if (userSpace == spaces) {
                win = true;
                System.out.println("Congrats, you win!");
                break;
            } else {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are now on space " + userSpace + " and have " + diff + " more to go.");
            }


        }

        if (!win){
            System.out.println("you loose");
        }


    }
}
