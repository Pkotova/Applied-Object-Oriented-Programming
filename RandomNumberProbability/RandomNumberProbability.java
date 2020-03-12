package code;

import java.text.NumberFormat;
import java.util.Random;

public class RandomNumberProbability {

    public static int drawRandomNumber() {
        Random random = new Random();       //we use the Java's number random generator
        final int randomGenerated = random.nextInt(100);
        // we have P(1) = 0.2, P(2) = O.3, P(3) = 0.5 => we have
        // 20% to be 1, 30% to be 2, and 50% to be 3
        // so we have 100%

        if (randomGenerated > 50) { // because we have 50% chance to be 3

            return 3;

        } else if (randomGenerated > 20) { //because we have 30% chance to be 2

            return 2;

        } else {

            return 1;           //and the rest 20% are chance for 1

        }
    }

    public static void probabilityFor(int tries) {
        int generatedNumber;
        double counter1 = 0, counter2 = 0, counter3 = 0; // we initialize counters for each number
        double probabilityFor1, probabilityFor2, probabilityFor3; // variables for probabilities

        for (int i = 0; i < tries; i++) {               // we generate number (tries) times
            generatedNumber = drawRandomNumber();

            if (generatedNumber == 1) {     // we count the coincidences for 1
                counter1++;
            }
            else if (generatedNumber == 2) {     // we count the coincidences for 2
                counter2++;
            }
            else  {                             // the only option left is 3
                counter3++;
            }
        }
// to calculate the probability we use (goodOutput) / allOutputs
// and because we need accurate result we need to divide doubles
//so that's why the counters are doubles
        probabilityFor1 = (counter1) / tries ;
        probabilityFor2 = (counter2) / tries ;
        probabilityFor3 = (counter3) / tries ;

        System.out.println("For your " + tries + " tries you have:");
        NumberFormat format = NumberFormat.getPercentInstance();
        String percentage1 = format.format(probabilityFor1);
        System.out.println("For 1: " + probabilityFor1 + percentage1);

        String percentage2 = format.format(probabilityFor2);
        System.out.println("For 2: " + probabilityFor2 + percentage2);

        String percentage3 = format.format(probabilityFor3);
        System.out.println("For 3: " + probabilityFor3 + percentage3);

    }

    public static void main(String[] args) {
//you can use the function with as much as you want tries
//but actually the tries should fit in integer(2_147_483_647)
        probabilityFor(10000);
        probabilityFor(60000);
    }
}
