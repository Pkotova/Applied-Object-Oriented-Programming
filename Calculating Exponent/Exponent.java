package code;

public class Exponent {
    public static double calculateConst(){
        double e = 1;
        int i = 1;
        while (true){
            e += (1.0 / (factoriel(i)));
            i++;
            if (i == 35){ //
                return e;
            }
        }

    }
    public static int factoriel(int number){
        int factoriel = 1;
        for (int i = 1; i < number;i++){
            factoriel *= i;
        }
        return factoriel;
    }
    public static void main(String[] args) {
        System.out.printf("e = '%.002f'",calculateConst());
    }
}
