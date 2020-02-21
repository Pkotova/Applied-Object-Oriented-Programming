package code;
/*
Write code that inputs a five-digit number .
Display an error message if the number is not five digits.
Write code that separates the digits in the five digit number.
Store the original value of number in variable originalNumber
before performing calculations. Write code that determines
whether the first and last digits are identical and the second and
fourth digits are identical. Assign resultString a string indicating
whether or not the original string is a palindrome.:
 */

//different way
import java.util.Scanner;

public class FiveDigitsPalindrome {     // returns true if the number has 5 digits

    static boolean isFiveDigits(int number)
    {
        return (number >= 10000 && number <=99999); //range of 5 digit numbers
    }

    static int reverseNumber(int number)    //reverse the number
    {
        int reverse = 0;
        while(number != 0)                  // while the number is different from 0
        {
            reverse *= 10;                   //
            reverse = reverse + number % 10; // here we take the value of last digit
            number = number / 10;           //here we remove it
        }
        return reverse;                     // return the returned number
    }

    static String isPalindrome(int number){   // if the number is equals to its reversed number
                                              // so its palindrome
       if (number == reverseNumber(number)){  // the method returns message (String)
           return "It is palindrome!";        // it is possible to be boolean type
       }
       else{
           return "It is NOT a palindrome!";
       }
     }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // using scanner

        System.out.print("Input five digit number!: "); //user interface
        int number = input.nextInt();

        String resultString = isPalindrome(number);     // the result from method (isPalindrome)

        if (isFiveDigits(number))
            System.out.println(resultString);
         else
            System.out.println( "ERROR! INVALID INPUT!"); // display error if the number is not 5 digit
    }
}
