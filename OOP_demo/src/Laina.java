//import java.util.Date;

public class Laina extends Tapahtuma {

	/** Päivämäärä ja kellonaika, koska lainaus tapahtui. */
	private String lainausPvm;

	/** Laina-aika päivissä. */
	private int lainaAika;

	/** Lainan myöhästymisestä kertyvä sakko. */
	private double sakko;

	public Laina(Asiakas asiakas, Nide nide, String lainausPvm, int lainaAika,
			double sakko) {
		super(asiakas, nide);
		this.lainausPvm = lainausPvm;
		this.lainaAika = lainaAika;
		this.sakko = sakko;
	}

	public String annaLainausPvm() {
		return lainausPvm;
	}

	public void asetaLainausPvm(String lainausPvm) {
		this.lainausPvm = lainausPvm;
	}

	public int annaLainaAika() {
		return lainaAika;
	}

	public void asetaLainaAika(int lainaAika) {
		this.lainaAika = lainaAika;
	}

	public double annaSakko() {
		return sakko;
	}

	public void asetaSakko(double sakko) {
		this.sakko = sakko;
	}

	public void kasvataSakko(double sakko) {
		this.sakko = this.sakko + sakko;
	}
	public String toString(){
		return asiakas.annaNimi()+" " + nide.annaNimi() + " " + lainausPvm + " " + lainaAika;
	}

}