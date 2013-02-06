import java.util.Date;


public class KIrjasto_testi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Asiakas a1 = new Asiakas("Pepe", "KatuKatu23", "209");
		Nide n1 = new Nide("Hedelson", "Parhaat piirakkani", "Tapio", 1988, 3, "2832932");
		Tapahtuma t = new Tapahtuma(a1, n1);
		Laina l = new Laina(a1, n1, "2012.1.12", 30, 5);
		System.out.println(l);
		Varaus v = new Varaus(a1,n1, "2014.2.12", 32);
		System.out.println(v);
		
		
	}

}
