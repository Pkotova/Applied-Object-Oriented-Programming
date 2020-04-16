package code;

import java.util.Scanner;

public class HammingDistance {
    private static int calculateHammingDistance(int numberA, int numberB) {
        int bits = 0;
//exclusive OR (^) operator
        int value = numberA ^ numberB;
// while the value is less than 0
        while (value > 0) {
// bits = bits + value & 1
// & (AND) operator
            bits += value & 1;
// signed right shift operator
            value >>= 1;
        }
//finally we return the distance
        return bits;

    }

    private static String toBinary(int number, int bits) {
// print correctly binary numbers
        if (bits > 0) {
            return String.format("%" + bits + "s",
                    Integer.toBinaryString(number)).replaceAll(" ", "0");
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberA, numberB;
// if a number has 8 bits, this means in should fit in (0000 0000)
// the largest number which can fit in 8 bits is 255, the smallest is 0
        do {
            System.out.println("Your numbers has to be in range [0.255]");
            System.out.print("Number A: ");
            numberA = input.nextInt();

        } while (numberA > 255);

        do {
            System.out.println("Your number has to be in range [0.255]");
            System.out.print("Number B: ");
            numberB = input.nextInt();

        } while (numberB > 255);

        int distance = calculateHammingDistance(numberA, numberB);
        System.out.println("Result");
        System.out.println("----------------");
        System.out.println("The Hamming distance between numbers ");
        System.out.println(numberA  + "(dec): "  + toBinary(numberA,8) + "(bin)");
        System.out.println(numberB + "(dec): " + toBinary(numberB,8) + "(bin)");
        System.out.println("is: " + distance);
    }
}
