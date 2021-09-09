package deckofcard.com;

 public class UC1 {
	 /*
	  * @purpose: To create deck of card
	  * @return: No retun value
	  * @input: Deck of card name
	  * @output: Set card 
	  */
	 
	public static void main(String[] args) {
		String[] suits = {"Diamond", "Heart", "Spades", "Club"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[][] cardCombo = new String[4][13];
       
          for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
              cardCombo[i][j] = suits[i] + rank[j];
            }
        }
            
      }
 }	


