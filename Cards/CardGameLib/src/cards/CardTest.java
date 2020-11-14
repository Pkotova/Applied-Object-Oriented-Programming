package cards;

public class CardTest {

    public static void main(String[] args) {

        Card defaultCard = new Card();
        Card nineOfHearts = new Card(FaceOfCard.NINE, SuitOfCard.HEARTS);
        System.out.println("Default: " + defaultCard.toString());
        System.out.println(">> Face: " + defaultCard.getFace() + ", Suit: " + defaultCard.getSuitOfCard());
        System.out.println("Custom: " + nineOfHearts.toString());
        System.out.println(">> Face: " + defaultCard.getFace() + ", Suit: " + defaultCard.getSuitOfCard());
    }
}
