public class Nide extends Kirja {
	// Tätä ei tarvinnut toteuttaa, mutta kirjan esiintymät periaatteessa niteitä
	// Mahdollisia attribuutteja mm. painos ja isbn

	private int painos;
	private String isbn;

	public Nide(String tekija, String nimi, String julkaisija,
			int julkaisuVuosi, int painos, String isbn) {
		super(tekija, nimi, julkaisija, julkaisuVuosi);
		this.painos = painos;
		this.isbn = isbn;
	}
 
	public int annaPainos() {
		return painos;
	}

	public void asetaPainos(int painos) {
		this.painos = painos;
	}

	public String annaIsbn() {
		return isbn;
	}

	public void asetaIsbn(String isbn) {
		this.isbn = isbn;
	}

}