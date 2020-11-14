package cards;

public enum FaceOfCard {

    DEUCE("Deuce"),
    THREE("Three"),
    FOUR("Four"),
    FIVE("Five"),
    SIX("Six"),
    ACE("Ace"),
    SEVEN("Seven"),
    EIGHT("Eight"),
    NINE("Nine"),
    TEN("Ten"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King");

    private final String value;

    FaceOfCard(String newValue) {
        this.value = newValue == null ? "Ace" : newValue;
    }

    String getFace() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s",value);
    }
}
