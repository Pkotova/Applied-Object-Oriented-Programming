package code;
/*
	A company wants to transmit data over the telephone, 
	but they are concerned that their phones may be tapped. 
	All their data is transmitted as four-digit Integers. 
	They have asked you to write a program that encrypts
	their data so that it may be transmitted more securely. 
	Your program should read a four-digit Integer entered 
	by the user and encrypt it as follows: Replace each digit by 
	(the sum of that digit plus 7) modulo 10. Then swap the 
	first digit with the third, and swap the second digit with the fourth. 
	Print the encrypted Integer. Write a separate program that 
	inputs an encrypted four-digit Integer and decrypts it to form the original number.
*/
import java.util.Scanner;

public class Encrypt {

    public static void main(String[] args) {

        int number, encrypNumber;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        int digit1 = number % 1000 / 10;
        int digit2 = number % 100 / 10;
        int digit3 = number % 10 / 10;
        int digit4 = number % 10;

        int newDigit1 = (digit1 + 7) % 10;
        int newDigit2 = (digit2+ 7) % 10;
        int newDigit3 = (digit3 + 7) % 10;
        int newDigit4 = (digit4 + 7) % 10;

        encrypNumber = (newDigit3 * 1000) + (newDigit4 * 100) + (newDigit1 * 10) + newDigit2;
        System.out.print("Your number " + number + " encrypted is: ");
        System.out.println(encrypNumber);

    }
}
