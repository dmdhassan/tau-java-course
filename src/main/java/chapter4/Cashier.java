package chapter4;

import java.util.Scanner;

/*
    FOR LOOP
    write a cashier program that will scan a given number of items and tally the cost
 */
public class Cashier {
    public static void main(String args[]) {
        System.out.println("How many items did you purchase ");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        double sumTotal = 0;
        for (int i = 0; i < quantity; i++) {
            int num = i + 1;
            System.out.println("What is the cost of item " + num);
            double price = scanner.nextDouble();
            sumTotal = sumTotal + price;
        }

        System.out.println("Your total amount is $" + sumTotal);
    }
}
