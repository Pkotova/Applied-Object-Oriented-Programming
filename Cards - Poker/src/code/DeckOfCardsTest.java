package code;

public class DeckOfCardsTest
{

    public static void main( String args[] )
    {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();


        Card[] leftHand = myDeckOfCards.dealHand();
        Card[] rightHand = myDeckOfCards.dealHand();
        System.out.printf( "%-20s%-20s\n", "Left hand:", "Right hand:");
        for (int i = 0; i < leftHand.length; i++) {
            System.out.printf( "%-20s%-20s\n", leftHand[i], rightHand[i]);
        }

        System.out.printf( "\n%-20s\n", "Hand values:");
        int leftHandStrength [] = strengths(leftHand, myDeckOfCards);
        int rightHandStrength [] = strengths(rightHand, myDeckOfCards);


        for (int i = 0; i < leftHandStrength.length; i++){
            if (leftHandStrength[i] > rightHandStrength[i]){
                System.out.printf( "\n\nResult: left hand is better");
                System.exit(0);
            }
            if (leftHandStrength[i] < rightHandStrength[i]){
                System.out.printf( "\n\nResult: right hand is better");
                System.exit(0);
            }
        }

        System.out.printf("\n\nResult: both hands are equal");

    }
    public static int[] strengths(Card[] hand, DeckOfCards myDeckOfCards){
        int[] strengths = new int[7];

        int couples = myDeckOfCards.pairs(hand);
        int triples = myDeckOfCards.three(hand);
        if(myDeckOfCards.four(hand)){
            strengths[0] = 1;
            System.out.printf("%-20s", "Four of a kind");
            return strengths;
        }
        if(myDeckOfCards.fullHouse(couples, triples)){
            strengths[1] = 1;
            System.out.printf("%-20s", "Full house");
            return strengths;
        }
        if(myDeckOfCards.flush(hand)){
            strengths[2] = 1;
            System.out.printf("%-20s", "Flush");
            return strengths;
        }
        if(myDeckOfCards.straight(hand)){
            strengths[3] = 1;
            System.out.printf("%-20s", "Straight");
            return strengths;
        }
        if(myDeckOfCards.triple(triples)){
            strengths[4] = 1;
            System.out.printf("%-20s", "Three of a kind");
            return strengths;
        }
        if(myDeckOfCards.twoPairs(couples)){
            strengths[5] = 1;
            System.out.printf("%-20s", "Two pairs");
            return strengths;
        }
        if(myDeckOfCards.pair(couples)){
            strengths[6] = 1;
            System.out.printf("%-20s", "One pair");
            return strengths;
        }

        System.out.printf("%-20s", "None");

        return strengths;
    }
}

