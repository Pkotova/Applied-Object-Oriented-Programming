package code;

import java.util.Scanner;

public class Decrypt {
    public static boolean isLargerThan7(int number)
    {
        return (number >= 7);
    }
    public static void main(String[] args) {

        int number, decryptNumber;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        int digit1 = number / 1000 % 10;
        int digit2 = number / 100 % 10;
        int digit3 = number / 10 % 10;
        int digit4 = number % 10;

        int newDigit1;
        int newDigit2;
        int newDigit3;
        int newDigit4;

        if (!isLargerThan7(digit1)){
            newDigit1 = digit1 + 10 - 7;
        }
        else{
            newDigit1 = digit1 - 7;
        }

        if (!isLargerThan7(digit2)){
            newDigit2 = digit2 + 10 - 7;
        }
        else{
            newDigit2 = digit2 - 7;
        }

        if (!isLargerThan7(digit3)){
            newDigit3 = digit3 + 10 - 7;
        }
        else{
            newDigit3 = digit3 - 7;
        }

        if (!isLargerThan7(digit4)){
            newDigit4 = digit4 + 10 - 7;
        }
        else{
            newDigit4 = digit4 - 7;
        }

        decryptNumber = (newDigit3 * 1000) + (newDigit4 * 100) + (newDigit1 * 10) + newDigit2;
        System.out.print("Your ecrypted " + number + " decrypted is: ");
        System.out.println(decryptNumber);

    }
}
