package chapter3;

import java.util.Scanner;

/*
    NESTED IFS
    To qualify for a loan, a person must make at least $30,000
    and have been working at their current job for at least 2 years
 */
public class LoanQualifier {

    public static void main(String arg[]) {
    // Initialize with what we know
        double requiredSalary = 30000;
        double requiredYears = 2;
    // Find out what we don't know
        System.out.println("Enter your salary below ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter your number of years with current employer ");
        double years = scanner.nextDouble();

        scanner.close();

    // Make Our decision
        if (salary >= requiredSalary) {
            if (years >=  requiredYears) {
                System.out.println("congrats! you are qualified for the loan");
            } else {
                System.out.println("Oh Sorry! You must have worked for your current employer fot " + requiredYears + " years");
            }
        } else {
          System.out.println("Oh Sorry! you must be earning up to " + requiredSalary);
        }



    }
}
