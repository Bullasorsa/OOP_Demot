import java.util.ArrayList;

public class PokerPlayer {
  private String name;
  private double money;
  private PokerGame game;
  private Pokerikasi hand;
  
  public PokerPlayer(String playerName, double credit, PokerGame playes) {
    name = playerName;
    money = credit;
    game = playes;
    hand = new Pokerikasi();
  }
  
  public String getName() {
    return name;
  }
  
  public void takeCard(Pelikortti card) {
    
      hand.lisaaKortti(card);
      
  }
  
  public boolean raiseStake(double amount) {
    if( amount <= money ) { 
      money = money - amount;
      game.raiseStake(amount);
      return true;
    }
    else
      return false;
  }
  
 /* public boolean changeCards(int[] cardsToChange) {
    if( cardsToChange.length > 0 && cardsToChange.length < 6 ) {
      for( int i=0; i < cardsToChange.length; i++ ) {
    	  Pelikortti card = game.getCard();
        hand.set(cardsToChange[i], card);
      }
      return true;
    }
    else
      return false;
    
  }
  
  public String playersHand() {
    String playersHand = hand.get(0).toString();
    for( int i=1; i < hand.size(); i++ ) {
        playersHand = playersHand + "\n" + hand.get(i).toString();
      }
    return playersHand;
  }
  */
  public String toString() {
    String player = "Nimi: " + name + "\n";
    player = player + "Rahaa: " + money + "\n";
    player = player + "Kortit:\n" + hand;
    return player;
  }
}