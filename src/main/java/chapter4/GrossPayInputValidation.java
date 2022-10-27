package chapter4;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {
    public static void main(String args[]) {
        // Initialize with known values
        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work this week");
        Scanner scanner = new Scanner(System.in);

        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 0) {
            System.out.println("invalid number of hours, the value should be between 1 and 40");
            hoursWorked = scanner.nextDouble();
        }

        double grossPay = hoursWorked * rate;

        System.out.println("Your gross pay is $" + grossPay);
    }
}
