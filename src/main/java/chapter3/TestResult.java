package chapter3;

import java.util.Scanner;

public class TestResult {
    public static void main(String arg[]) {
        // Get the score
        char grade;

        System.out.println("Enter your test score below ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        scanner.close();

        //Determine the grade
        if (score < 60) {
            grade = 'F';

        } else if (score < 70) {
            grade = 'D';

        } else if (score < 80) {
            grade = 'C';

        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}
