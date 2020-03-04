package code;

public class Main {

    public static void pattern1(int number) {
        for (int i = 1; i <= number; i++) {

            for (int j = number - i; j >= 1; j--) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int number) {
        for (int i = 1; i <= number; i++) {

            for (int j = number - i; j >= 1; j--) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4 ( int number){
        for (int i = 1; i <= number; i++)
        {
            for (int j = number; j > i; j--)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(9);
        pattern2(9);
        pattern3(9);
        pattern4(9);
    }
}
