package chapter8;

public class TextProcessor {
    public static void main(String args[]) {
        countWords("I love test automation university");
        reverseWords("Hello TAU!");
        addSpace("HeyThereIt'sHassan");
    }

    /**
     * split a string in to an array by tokenizing it.
     * count word and print them
     * @param
     */
    public static void countWords(String text) {
        var word = text.split(" ");
        int wordLength = word.length;

        String message = String.format("Your text contains %d words", wordLength);
        System.out.println(message);

        for (var i = 0; i < wordLength; i++) {
            System.out.println(word[i]);
        }
    }

    public static  void reverseWords(String text) {
        for (int i = text.length() - 1; i >= 0; i-- ) {
            System.out.print(text.charAt(i));
        }
    }

    /**
     *  add a white space before every capital letter
     */

    public static void addSpace(String text) {
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }
}
