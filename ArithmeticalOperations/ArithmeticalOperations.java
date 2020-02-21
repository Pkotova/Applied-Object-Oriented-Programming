package com.company;
import java.util.Scanner;

public class ArithmeticalOperations {
    public static void main(String[] args) {
//declaration variables, initialize
	    int num1 = 4, num2 = -100, num3 = 23;
	    int sum = 0;
// declaration of constants, we cant change their value
	     final double pi = 3.14;
// basic operations with integers
	    sum = num1 + num2;
	    num3++;
	    num3 += sum;
//standard output
        System.out.println(num3);
        System.out.println(sum);
        System.out.println(!(num3 < num2));
//declaration accumulators
        int product, average;
// here we have 3 things
//1) declaration, 2) initialize, 3) create instance, reference of type Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");         // UI   println = cout + endl, print = cout
        num2 = input.nextInt();                     // cin

        product = num2 * num1 * sum;                // calculations
        average = (num1 + num2 + num3) / 3;

        System.out.println("The product is: " + product);       // User friendly output
        System.out.println(("The average is: " + average));
//basic arithmetical operations
        System.out.println(5 * 2);      //multiplication
        System.out.println(12 / 3);     //devide
        System.out.println(15 % 4);     // module
        System.out.println(10293 - 233);    //substraction
        System.out.println(true && false || true);  //logical operators
    }
}
