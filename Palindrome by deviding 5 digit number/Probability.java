package code;

public class Probability {

    public static void calculatingProbability() {
        int number, counterCoincidences = 0;
// the possible digits are 10 [0,9], so for the first digit we have 7 possible exits, so the probability is 7/10; analogically for the other four digits
        double forDigit1 = 7.0 / 10;
        double forDigit2 = 7.0 / 10;
        double forDigit3 = 6.0 / 10;
        double forDigit4 = 6.0 / 10;
        double forDigit5 = 4.0 / 10;
        double probability = forDigit1 * forDigit2 * forDigit3 * forDigit4 * forDigit5; // we need to all of the possible exits for each number to be 'true' are the same time, so we use multiplication
//out five digits number will be (i j t m m)
//first digit
        for (int i = 0; i <= 10; i++) {

            if (i >= 3 && i <= 9) {     // interval [3;6]
//second digit
                for (int j = 0; j <= 10; j++) {

                    if (j >= 2 && j <= 8) {     //interval [2;8]
//third digit
                        for (int t = 0; t <= 10; t++) {

                            if (t >= 4 && t <= 9) {     //interval [4,9]
//fourth digit
                                for (int m = 0; m <= 10; m++) {

                                    if (m >= 1 && m <= 6) {    // interval [1;6]
//fifth digit
                                        for (int n = 0; n <= 10; n++) {

                                            if (n >= 6 && n <= 9) {     // interval [6;9]

                                                number = i * 10000 + j * 1000 + t * 100 + m * 10 + n;

                                               if (number % 12 == 0) {          //condition for the number, it should divide by 12
                                                    // System.out.println(number);      //if you want to see all of the numbers, just uncomment this line
                                                    counterCoincidences++;
                                                }

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //the loops are nested because they depends to each other, and it helps us to create the number
        String calculatedProbability = String.format("The probability for this event  '%.02f'", probability); //we use format for two digits after the floating point, otherwise we will have 0.07055999999999998
        System.out.println("is " + calculatedProbability + "%");
        System.out.println("All of the numbers are: " + counterCoincidences);
    }

    public static void main(String[] args) {
        calculatingProbability();
    }
}
