import java.util.ArrayList;

public class PokerGame {
  private double stake;
  private ArrayList<PokerPlayer> players;
  private Korttipakka deck;
  
  public PokerGame() {
    stake = 0.0;
    deck = new Korttipakka();
    players = new ArrayList<PokerPlayer>();
  }
  
  public void addPlayer(String name, double credit) {
	players.add(new PokerPlayer(name, credit, this));
  }
  
  public void play() {
    // pelin aloitus
    deck.shuffle();
    dealCards();
    // pelin kulku toteutetaan myöhemmin
  }
  
  public void dealCards() {
	// Jaetaan viisi korttia jokaiselle pelaajalle
    for(int i=0; i < 5; i++) { 
      for(PokerPlayer player : players) {
        player.takeCard(deck.draw());
      }
    }
  }
     
  public Pelikortti getCard() {
    return deck.draw();
  }
  
  public void raiseStake(double amount) {
    stake = stake + amount;
  }
  
  public boolean playerRaise(PokerPlayer player, double amount) {
      return player.raiseStake(amount);
  }
  
  public boolean playerChangeCards(PokerPlayer player, int[] cardsToChange) {
      return player.changeCards(cardsToChange);
  }
  
  public String toString() {
    String gameStatus = "Panos: " + stake + "\n";
    for(PokerPlayer player : players) {
        gameStatus += player + "\n";
      }
    return gameStatus;
  }
}