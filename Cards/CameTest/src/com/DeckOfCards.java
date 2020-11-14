package com;

import cards.Card;
import cards.FaceOfCard;
import cards.SuitOfCard;
import java.util.*;


public class DeckOfCards {

    private ArrayList<Card> cards;
    private int currentCard;

    public DeckOfCards() {
        this.cards = new ArrayList<Card>();
        for (int faceIndex = 0; faceIndex < FaceOfCard.values().length; faceIndex++) {
            for (int suitIndex = 0; suitIndex < SuitOfCard.values().length; suitIndex++) {
                this.cards.add(new Card(FaceOfCard.values()[faceIndex], SuitOfCard.values()[suitIndex]));
            }
        }
        setCurrentCard(0);
    }

    //belote deck
    public DeckOfCards(int currentCard) {
        this.cards = new ArrayList<Card>();
        for (int faceIndex = 5; faceIndex < FaceOfCard.values().length; faceIndex++) {
            for (int suitIndex = 0; suitIndex < SuitOfCard.values().length; suitIndex++) {
                this.cards.add(new Card(FaceOfCard.values()[faceIndex], SuitOfCard.values()[suitIndex]));
            }
        }
        setCurrentCard(currentCard);
    }

    public DeckOfCards(ArrayList<Card> cards, int currentCard) {
        this.cards = cards;
        setCurrentCard(currentCard);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int allCardsInDeck() {
        return cards.size();
    }

    public int getCurrentCard() {
        return currentCard;
    }

    public Card getCurrentCardFromTheDeck() {
        return this.cards.get(currentCard);
    }

    public void setCurrentCard(int currentCard) {
        this.currentCard = (currentCard >= 0) ? currentCard : 0;
    }

    public void shuffleCards() {
        setCurrentCard(0);
        Random random = new Random();
        int allCards = cards.size();
        for (int position = 0; position < allCards; position++) {
            Card currentElement = cards.get(position);
            int randomIndex = position + random.nextInt(allCards - position);
            cards.set(position, cards.get(randomIndex));
            cards.set(randomIndex, currentElement);
        }
    }

    public Card[] dealFive() {

        Card[] fives = new Card[5];
        int allCards = cards.size();
        int current = this.currentCard;
        int last = this.currentCard + 5;
        int index = 0;

        for (int i = current; i < last; i++) {
            if (i > allCards) {
                fives[index] = null;
            } else {
                fives[index] = cards.get(i - 1);
                index++;
            }

        }
        return fives;
    }

    public void sortByFaceCards() {
        for (int i = 0; i < cards.size() - 1; i++) {
            int m = i;
            for (int j = i + 1; j < cards.size(); j++) {
                if (cards.get(m).getFace().ordinal() < cards.get(j).getFace().ordinal())
                    m = j;
            }
            Card temp = cards.get(i);
            cards.set(i, cards.get(m));
            cards.set(m, temp);
        }

        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void printBySuits() {
        List<SuitOfCard> suits = this.getDistinctSuits();
        for (SuitOfCard suit : suits) {
            System.out.println(">> " + suit);
            for (Card card : cards) {
                if (card.getSuitOfCard() == suit) {
                    System.out.println("> " + card);
                }

            }
            System.out.println();
        }
    }

    private List<SuitOfCard> getDistinctSuits() {
        List<SuitOfCard> suits = new ArrayList<>();
        for (int i = 0; i < this.cards.size(); i++) {
            int j;
            for (j = 0; j < i; j++)
                if (this.cards.get(i).getSuitOfCard() == this.cards.get(j).getSuitOfCard()) {
                    break;
                }
            if (i == j)
                suits.add(this.cards.get(i).getSuitOfCard());
        }
        return suits;
    }

    public List<FaceOfCard> getDistinctFaces() {
        List<FaceOfCard> faces = new ArrayList<FaceOfCard>();
        for (int i = 0; i < this.cards.size(); i++) {
            int j;
            for (j = 0; j < i; j++)
                if (this.cards.get(i).getFace() == this.cards.get(j).getFace()) {
                    break;
                }
            if (i == j)
                faces.add(this.cards.get(i).getFace());
        }
        return faces;
    }
}
