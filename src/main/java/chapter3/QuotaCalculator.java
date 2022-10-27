package chapter3;

import java.util.Scanner;

/*
    IF ELSE
    All salesperson are expected to make at least 10 sales each week
    For those who do they get a congratulatory message
    For those who don't they are informed of how many sales they short
 */
public class QuotaCalculator {
    public static void main (String arg[]) {
        //write out known values
        int quota = 10;
        String message = "congatulations, you achieved your sales goal of the week";

        //get unknown values
        System.out.println("How many sales was made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        scanner.close();

        //make a decision on the path to take

        if (sales >= quota) {
            System.out.println(message);
        } else {
            int salesShort = quota - sales;
            System.out.println("you are short of " + salesShort + " sales");
        }
    }
}
