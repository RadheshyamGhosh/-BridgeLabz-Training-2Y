import java.util.Random;

public class CardGame {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        // Define suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Total number of cards in the deck
        int numOfCards = suits.length * ranks.length;
        
        // Initialize the deck
        String[] deck = new String[numOfCards];
        
        // Fill the deck with the combination of ranks and suits
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            // Generate a random card number to swap with
            int randomCardNumber = i + (int)(Math.random() * (deck.length - i));
            
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the cards to players
    public static String[][] distributeCards(String[] deck, int numOfPlayers, int cardsPerPlayer) {
        // Create a 2D array to store the cards for each player
        String[][] playersCards = new String[numOfPlayers][cardsPerPlayer];
        
        // Distribute the cards to players
        int cardIndex = 0;
        for (int player = 0; player < numOfPlayers; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                if (cardIndex < deck.length) {
                    playersCards[player][card] = deck[cardIndex++];
                }
            }
        }
        
        return playersCards;
    }

    // Method to print the cards of each player
    public static void printPlayerCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards: ");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.println(playersCards[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialize deck of cards
        String[] deck = initializeDeck();

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Define the number of players and cards per player
        int numOfPlayers = 4;  // Example: 4 players
        int cardsPerPlayer = 5;  // Example: each player gets 5 cards

        // Distribute the cards to the players
        String[][] playersCards = distributeCards(deck, numOfPlayers, cardsPerPlayer);

        // Print the players and their cards
        printPlayerCards(playersCards);
        }
}