package chapter4;

import java.util.Scanner;

public class CharacterSerch {
    public  static void  main(String args[]) {
        System.out.println("Enter some texts: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        boolean found = false;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter == 'A' || letter == 'a') {
                found = true;
                break;
            }

        }

        if (found) {
            System.out.println("this text contains A");
        } else {
            System.out.println("This text does not contain A");
        }
    }
}
