package code;
import java.util.Random;

public class DeckOfCards
{
    private Card deck[];
    private int currentCard;
    private final int NUMBER_OF_CARDS = 52;
    private Random randomNumbers;

    //помощни масиви от конструктора
    private String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};


    public DeckOfCards()
    {
        deck = new Card[ NUMBER_OF_CARDS ];
        currentCard = 0;
        randomNumbers = new Random();


        for ( int count = 0; count < deck.length; count++ )
            deck[ count ] =
                    new Card( faces[ count % 13 ], suits[ count / 13 ] );
    }


    public void shuffle()
    {

        currentCard = 0;


        for ( int first = 0; first < deck.length; first++ )
        {

            int second =  randomNumbers.nextInt( NUMBER_OF_CARDS );


            Card temp = deck[ first ];
            deck[ first ] = deck[ second ];
            deck[ second ] = temp;
        }
    }


    public Card dealCard()
    {

        if ( currentCard < deck.length )
            return deck[ currentCard++ ];
        else
            return null;
    }

    //раздаване на 5 карти
    public Card[] dealHand(){
        Card[] hand = new Card[5];

        for (int i = 0; i < 5; i++) {
            hand[i] = dealCard();
        }
        return hand;
    }

    private int[] totalHand(Card hand[]) {
        int numbers[] = new int[faces.length];

        for (int i = 0; i < hand.length; i++) {
            for (int j = 0; j < 13; j++) {
                if (hand[i].getFace().equals(faces[j])) {
                    ++numbers[j];
                }
            }
        }

        return numbers;
    }


    public int pairs(Card hand[]) {
        int couples = 0;
        int numbers[] = totalHand(hand);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2) {
                ++couples;
            }
        }

        return couples;
    }


    public boolean pair(int couples) {
        if (couples == 1) {

            return true;
        }
        return false;
    }


    public boolean twoPairs(int couples) {
        if (couples == 2) {

            return true;
        }
        return false;
    }

    public int three(Card hand[]) {
        int numbers[] = totalHand(hand);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                return 1;
            }
        }

        return 0;
    }

    public boolean triple(int triples) {
        if (triples == 1) {
            return true;
        }
        return false;
    }


    public boolean four(Card hand[]) {
        int numbers[] = totalHand(hand);

        for (int i = 0; i < faces.length; i++) {
            if (numbers[i] == 4) {
                return true;
            }
        }
        return false;
    }

    //карти с еднаква боя
    public boolean flush(Card hand[]) {
        String suit = hand[0].getSuit();

        for (int i = 1; i < hand.length; i++) {
            if (!hand[i].getSuit().equals(suit)) {
                return false;
            }
        }
        return true;
    }

    public boolean straight(Card hand[]) {
        int locations[] = new int[5];

        int l = 0;
        int numbers[] = totalHand(hand);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                locations[l++] = i;
            }
            if (numbers[i] > 1) return false;
        }


        if (locations[0] + 4 == locations[4] ||
                (locations[0] == 0 && locations[4] == 12 &&
                        locations[1] + 3 == locations[4]))
            return true;
        return false;

    }

    public boolean fullHouse(int couples, int triples) {
        if (couples == 1 && triples == 1) {

            return true;
        }
        return false;
    }

}


