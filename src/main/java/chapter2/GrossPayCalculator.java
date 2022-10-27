package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static  void main(String arg[]) {

        //1. Get the number of hours worked
        System.out.println("Enter then number of hours the employee worked. ");
        Scanner  scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the amount paid per rate
        System.out.println("Enter the employee's pay per rate. ");
        double rate = scanner.nextDouble();
        scanner.close();

        // 3. Calculate the gross pay
        double grossPay = hours * rate;

        // 4. Display the result
        System.out.println("The gross pay is " + grossPay);


    }
}
