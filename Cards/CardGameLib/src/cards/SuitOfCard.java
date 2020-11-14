package cards;

public enum SuitOfCard {
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades");

    private final String value;

    SuitOfCard(String newValue) {
        this.value = newValue == null ? "Clubs" : newValue;
    }

    String getSuit() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s", value);
    }
}
