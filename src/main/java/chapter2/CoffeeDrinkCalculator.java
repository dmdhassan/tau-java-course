package chapter2;

import java.util.Scanner;

public class CoffeeDrinkCalculator {
    public static void main(String arg[]) {
        // 1. Get the season of the year
        System.out.println("what season of the year are we? ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. Get a whole number
        System.out.println("Type a whole number ");
        int number = scanner.nextInt();

        // 3. Get an adjective
        System.out.println("What is your best adjective");
        String adjective = scanner.next();

        scanner.close();

        // 4. write a sentence with the adjective, season of the year and the whole number.
        System.out.println("on a " + adjective + " " + season + " day " + "I drink a mininum of " + number + " cups of coffee");
    }
}
