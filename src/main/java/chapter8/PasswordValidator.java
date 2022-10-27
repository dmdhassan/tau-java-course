package chapter8;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you user name");
        String userName = scanner.next();

        System.out.println("Enter you old password");
        String oldPassword = scanner.next();

        System.out.println("Enter you new password");
        String password = scanner.next();
        validatePassword(password, oldPassword, userName);
        checkUpperCase(password);
        checkSpecialChar(password);
    }

    public static void validatePassword(String password, String oldpassword, String userName) {
        if (password == oldpassword) {
            System.out.println("new password cannot thesame as old password");
        }
        if (userName == password) {
            System.out.println("password cannot be the same as username");
        }
        if (password.length() < 8) {
            System.out.println("password cannot be the less than 8 characters");
        }
    }

    public static void checkUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return;
            }
        }

        System.out.println("password must contain an uppercase character");
    }

    public static void checkSpecialChar(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isAlphabetic(password.charAt(i))) {
                return;
            }
        }

        System.out.println("password must contain a special character");
    }
}
