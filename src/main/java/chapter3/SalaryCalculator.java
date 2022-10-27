package chapter3;

import java.util.Scanner;

/*
    if statement
    All salesperson get $1000 a week
    Sales people who exceeds 10 sales in a week gets additional $250
 */
public class SalaryCalculator {
    public static void main(String arg[]) {
        // 1. write down known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // 2. get the number of sales
        System.out.println("How many sales does this salesperson make this weeek? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        // 3. check if the salesperson exceed quota
        if (sales > quota) {
            salary = salary + bonus;
        }


        // 4. calculate the final output
        System.out.println("The employee's pay is $" + salary);

    }
}
