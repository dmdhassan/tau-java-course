package chapter6;

import java.util.Scanner;

public class PhoneBillCalculator {
    Scanner scanner = new Scanner(System.in);

    public static  void main(String args[]) {
        PhoneBillCalculator calculator = new PhoneBillCalculator();
        PhoneBill ibrahim = calculator.getBill();
        PhoneBill shola = calculator.getBill();

        double total = calculator.calculateTotal(ibrahim, shola);

        System.out.println("The total bill is: $" + total);
        calculator.scanner.close();
    }

    public PhoneBill getBill() {
        System.out.println("what is your user id");
        int id = scanner.nextInt();

        System.out.println("Enter your base fee: ");
        double baseFee = scanner.nextDouble();

        System.out.println("Enter your overage minutes: ");
        double overage = scanner.nextDouble();


        return new PhoneBill(id, baseFee, overage);
    }

    public double calculateTotal(PhoneBill user1, PhoneBill user2) {
        return user1.calculateTotal() + user2.calculateTotal();
    }
}
