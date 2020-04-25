package code;

public class ReverseString {
/*
5a
Write a recursive method that displays a string reversely on the console using the following
header:
public static void reverseDisplay(String value)
 */
    public static void reverseDisplay(String value){
        if(value.length() < 1) return;

        System.out.print(value.charAt(value.length() - 1));
        reverseDisplay(value.substring(0, value.length() - 1));
    }
/*
    Rewrite Programming problem 5a using a helper method to pass the substring high index to
    the method. The helper method header is:
 */

    public static void main(String[] args) {
            String name = "Applied OOP";
            reverseDisplay(name);
    }
}
