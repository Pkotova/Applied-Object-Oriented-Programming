package code;

import java.util.Scanner;

public class CountCapitalLetters {

    public static int countUpperCase(String str) {
        if (str.length() == 0) return 0;
        int capitalLetters = Character.isUpperCase(str.charAt(0)) ? 1 : 0;
        return countUpperCase(str.substring(1)) + capitalLetters;
    }

    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        System.out.print("Input your text: ");
        text = input.nextLine();
        
        System.out.println("In your text there is/are " +
                countUpperCase(text) +
                " Capital letters");


    }
}
