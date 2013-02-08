
public class kadenTestaus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokerikasi po = new Pokerikasi();
		Pelikortti ko1 = new Pelikortti("H",1);
		Pelikortti ko2 = new Pelikortti("H",2);
		Pelikortti ko3 = new Pelikortti("H",3);
		Pelikortti ko4 = new Pelikortti("H",4);
		Pelikortti ko5 = new Pelikortti("C",5);
		po.lisaaKortti(ko1);
		po.lisaaKortti(ko2);
		po.lisaaKortti(ko3);
		po.lisaaKortti(ko4);
		po.lisaaKortti(ko5);
		
		int tulos=po.kadenArvo();
		System.out.println(tulos);
		
		
	}

}
