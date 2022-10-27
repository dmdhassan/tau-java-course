package chapter4;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String args[]) {

        boolean again;

        do {
            System.out.println("what is your first number? ");
            Scanner scanner = new Scanner(System.in);
            double num1 = scanner.nextDouble();

            System.out.println("What is your second number? ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is " + sum);
            System.out.println("Do you wanna go again");

            again = scanner.nextBoolean();

        } while(again);
    }
}
