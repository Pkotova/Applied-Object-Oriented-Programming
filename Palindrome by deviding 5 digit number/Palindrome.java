package code;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        int number;
        String resultString;
        Scanner input = new Scanner(System.in);

        number = input.nextInt();
        int originalNumber = number;

        int digit0 = number / 10000 % 10;
        int digit1 = number / 1000 % 10;
        int digit2 = number / 100 % 10;
        int digit3 = number / 10 % 10;
        int digit4 = number % 10;

        if ((digit0 == digit4) && (digit1 == digit3)) {
            resultString = "It is Palindrome";
        }
        else{
            resultString = "It is NOT palindrome";
        }

        System.out.println(resultString);
    }
}
