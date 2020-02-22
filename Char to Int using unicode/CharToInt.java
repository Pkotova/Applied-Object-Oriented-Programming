package code;

public class CharToInt {

    public static int charToInteger(char symbol)
    {
        return (int)(symbol);
    }

    public static void main(String[] args) {
        System.out.print("A to Int: ");
        System.out.println(charToInteger('A'));

        System.out.print("B to Int: ");
        System.out.println(charToInteger('B'));

        System.out.print("C to Int: ");
        System.out.println(charToInteger('C'));

        System.out.print("a to Int: ");
        System.out.println(charToInteger('a'));

        System.out.print("b to Int: ");
        System.out.println(charToInteger('b'));

        System.out.print("c to Int: ");
        System.out.println(charToInteger('c'));

        System.out.print("0 to Int: ");
        System.out.println(charToInteger('0'));

        System.out.print("1 to Int: ");
        System.out.println(charToInteger('1'));

        System.out.print("2 to Int: ");
        System.out.println(charToInteger('2'));

        System.out.print("$ to Int: ");
        System.out.println(charToInteger('$'));

        System.out.print("* to Int: ");
        System.out.println(charToInteger('*'));

        System.out.print("+ to Int: ");
        System.out.println(charToInteger('+'));

        System.out.print("/ to Int: ");
        System.out.println(charToInteger('/'));

        System.out.print("Blank space to Int: ");
        System.out.println(charToInteger(' '));
    }
}
