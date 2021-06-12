/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) 
    {
        String[] ranks = {"two", "three", "four", "five", "six", "seven", "eight", 
                "nine", "ten", "jack", "queen", "king", "ace"};
        String[] suits = {"spades", "clubs", "diamonds", "hearts"};
        int[] pointValues = {2,3,4,5,6,7,8,9,10,10,10,10,11};
        Deck d = new Deck(ranks, suits, pointValues);        
        System.out.println("\n\n" + d.toString());
    }
}
