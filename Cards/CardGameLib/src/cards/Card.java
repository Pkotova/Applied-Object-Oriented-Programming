package cards;

public class Card {
    private FaceOfCard face;
    private SuitOfCard suitOfCard;

    public Card(){
        setFace(FaceOfCard.ACE);
        setSuitOfCard(SuitOfCard.CLUBS);
    }
    public Card(FaceOfCard face, SuitOfCard suitOfCard) {
        setFace(face);
        setSuitOfCard(suitOfCard);
    }

    public FaceOfCard getFace() {
        return face;
    }

    public void setFace(FaceOfCard face) {
        this.face = face == null ? FaceOfCard.ACE : face;
    }

    public SuitOfCard getSuitOfCard() {
        return suitOfCard;
    }

    public void setSuitOfCard(SuitOfCard suitOfCard) {
        this.suitOfCard = suitOfCard == null ? SuitOfCard.CLUBS : suitOfCard;
    }

    @Override
    public String toString() {
        return (face.toString()+ " of "+ suitOfCard.toString());
    }
}
