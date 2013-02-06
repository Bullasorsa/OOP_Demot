

public class Pankkitesti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Luodaan uusi pankkitili-olio nimeltŠŠn p
		Pankkitili p = new Pankkitili(100, 2312313, "Perttu", 2);
		p.tulosta();
		//p.talletus(12);
		p.lisaaKorko();
		p.lisaaKorko();
		p.lisaaKorko();
		p.tulosta();
		//p.nosto(3);
		//p.tulosta();
		
		Pankkitili.Kayttotili k = new Pankkitili.Kayttotili(300, 2312313, "Perttu", 2, 2, 3);
		k.tulostaKaytto();
		
		Pankkitili.Saastotili s = new Pankkitili.Saastotili(200, 2312313, "Perttu", 2, 100, 300);
		s.tulostaSaasto();
		
		Pankkitili.Luottotili l = new Pankkitili.Luottotili(1000, 213123123, "Perttu",2 ,700, true);
		l.tulostaLuotto();
	}

}
