package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public  static void main(String arg[]) {

        System.out.println("Enter your grade below ");
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh ooh! pretty bad";
                break;
            default:
                message = "invalid grade";
                break;
        }


        System.out.println(message);
    }
}
