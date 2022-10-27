package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is  the plan fee? ");

        double planFee = scanner.nextDouble();

        System.out.println("What is  overage minutes ");
        double overage = scanner.nextDouble();
        scanner.close();

        double overageFee = calculateOverageFees(overage);
        double subtotal = planFee + overageFee;
        double taxFee = calculateTax(subtotal);


        finalTotal(planFee, overageFee, taxFee);
    }

    public static void finalTotal(double planFee, double overageFee, double taxFee) {
        double total = planFee + overageFee + taxFee;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan fee: $" + planFee);
        System.out.println("Overage: $" + overageFee);
        System.out.println("Tax: $" + taxFee);
        System.out.println("Total: $" + total);
    }

    public static double calculateOverageFees(double overage){
        return 0.25 * overage;
    }

    public static double calculateTax(double subtotal){

        return 0.15 * subtotal;
    }
}
