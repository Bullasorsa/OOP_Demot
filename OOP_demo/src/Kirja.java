public class Kirja {

	private String tekija;
	private String nimi;
	private String julkaisija;
	private int julkaisuVuosi;

	public Kirja(String tekija, String nimi, String julkaisija,
			int julkaisuVuosi) {
		this.tekija = tekija;
		this.nimi = nimi;
		this.julkaisija = julkaisija;
		this.julkaisuVuosi = julkaisuVuosi;
	}

	public String annaTekija() {
		return tekija;
	}

	public void asetaTekija(String tekija) {
		this.tekija = tekija;
	}

	public String annaNimi() {
		return nimi;
	}

	public void asetaNimi(String nimi) {
		this.nimi = nimi;
	}

	public String annaJulkaisija() {
		return julkaisija;
	}

	public void asetaJulkaisija(String julkaisija) {
		this.julkaisija = julkaisija;
	}

	public int annaJulkaisuVuosi() {
		return julkaisuVuosi;
	}

	public void asetaJulkaisuVuosi(int julkaisuVuosi) {
		this.julkaisuVuosi = julkaisuVuosi;
	}

}