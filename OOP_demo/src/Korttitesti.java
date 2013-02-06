
public class Korttitesti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korttipakka k = new Korttipakka();
		k.tulosta();
		System.out.print("\n");
		k.shuffle();
		k.tulosta();
		System.out.print("\n");
		k.uusiPakka();
		k.tulosta();
		k.nosta(5);
		
		PokerGame p = new PokerGame();
		p.addPlayer("Perttu", 23);
		p.play();
		System.out.print(p);
	}

}
