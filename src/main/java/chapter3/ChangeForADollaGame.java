package chapter3;

import java.util.Scanner;

public class ChangeForADollaGame {
    public static void main(String arg[]) {
        // get the values for each denomination
        double pennies, nickels, dimes, quarters;

        System.out.println("How many pennies do you have ");
        Scanner scanner = new Scanner(System.in);
        pennies = scanner.nextDouble() / 100;

        System.out.println("How many nickels do you have ");
        nickels = scanner.nextDouble() / 20;

        System.out.println("How many dimes do you have ");
        dimes = scanner.nextDouble() / 10;

        System.out.println("How many quarter do you have ");
        quarters = scanner.nextDouble() / 4;

        double sum = pennies + nickels + dimes + quarters;

        if (sum == 1) {
            System.out.println("You win");
        } else if (sum > 1) {

            double diff = sum - 1;
            System.out.println("You went over by $" + diff);
        } else  {

            double diff = 1 - sum;
            System.out.println("You went under by $" + diff);
        }

        // add them up

        // check if the sum is up to $1
    }

    }
