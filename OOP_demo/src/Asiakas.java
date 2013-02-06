public class Asiakas {

	private String nimi;
	private String osoite;
	private String kortinNro;

	public Asiakas(String nimi, String osoite, String kortinNro) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.kortinNro = kortinNro;
	}

	public String annaNimi() {
		return nimi;
	}

	public void asetaNimi(String nimi) {
		this.nimi = nimi;
	}

	public String annaOsoite() {
		return osoite;
	}

	public void asetaOsoite(String osoite) {
		this.osoite = osoite;
	}

	public String annaKortinNro() {
		return kortinNro;
	}

	public void asetaKortinNro(String kortinNro) {
		this.kortinNro = kortinNro;
	}

}