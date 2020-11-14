package com;

import java.util.Arrays;
import java.util.Scanner;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DeckOfCards defaultDeck = new DeckOfCards();
        System.out.println("My default for belote: ");
        System.out.println(defaultDeck.getCards());

        DeckOfCards customBeloteDeck = new DeckOfCards(0);
        System.out.println("My deck for belote: ");
        System.out.println(customBeloteDeck.getCards());

        System.out.print("How many seconds you will shuffle your deck: ");
        int inputNumber = input.nextInt();
        for (int i = 0; i < inputNumber; i++) {
            customBeloteDeck.shuffleCards();
        }
        System.out.println("You deck was shuffled for " + inputNumber + " seconds! ");
        System.out.println("This is your shuffled deck: ");
        System.out.println(customBeloteDeck.getCards());

        System.out.println("You can pick a card: ");
        System.out.print("Which card you want to pick: >> ");
        inputNumber = input.nextInt();
        if (inputNumber > customBeloteDeck.allCardsInDeck()) {
            System.out.println("You have only " + customBeloteDeck.allCardsInDeck() + " cards");
        } else {
            customBeloteDeck.setCurrentCard(inputNumber);
            System.out.println("You picked: " + customBeloteDeck.getCurrentCardFromTheDeck());
        }

        System.out.print("Give 5 cards to a player (input where you start [index]) >>  ");
        inputNumber = input.nextInt();
        if (inputNumber > customBeloteDeck.allCardsInDeck()) {
            System.out.println("You have only " + customBeloteDeck.allCardsInDeck() + " cards");
        }else{
            customBeloteDeck.setCurrentCard(inputNumber);
            System.out.println(Arrays.toString(customBeloteDeck.dealFive()));
        }

        System.out.println("Your deck sorted by face: ");
        customBeloteDeck.sortByFaceCards();

        System.out.println("Your deck printed by suit");
        customBeloteDeck.printBySuits();

        System.out.println("All of the suits in your deck: ");
        System.out.println(customBeloteDeck.getDistinctFaces());
    }
}
