package code;

public class MonetaryCoinTest {
    public static int getSum(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }

    public static void main(String[] args) {
        MonetaryCoin coin1 = new MonetaryCoin(Face.HEAD, 10);
        MonetaryCoin coin2 = new MonetaryCoin(Face.TAIL, 200);
        MonetaryCoin coin3 = new MonetaryCoin(Face.HEAD, 50);

        System.out.println("The sum is: " + getSum(coin1.getValue(), coin2.getValue(), coin3.getValue()));

        for (int i = 0; i < 10; i++) {
            coin1.flip();
            System.out.print(coin1);
            System.out.println( " " + coin1.isHeads());
        }
    }
}
