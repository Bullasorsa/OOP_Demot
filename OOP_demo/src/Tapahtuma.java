public class Tapahtuma {

	protected final Asiakas asiakas;
	protected final Nide nide;

	public Tapahtuma(Asiakas asiakas, Nide nide) {
		this.asiakas = asiakas;
		this.nide = nide;
	}

	public Asiakas annaAsiakas() {
		return asiakas;
	}

	public Nide annaNide() {
		return nide;
	}

}
	