//import java.util.Date;

public class Varaus extends Tapahtuma {

	/** Koska varaus on tehty. */
	private String varausPvm;

	/** Miten monta päivää varaus on voimassa. */
	private int varausVoimassa;

	public Varaus(Asiakas asiakas, Nide nide, String varausPvm, int varausVoimassa) {
		super(asiakas, nide);
		this.varausPvm = varausPvm;
		this.varausVoimassa = varausVoimassa;
	}

	public String annaVarausPvm() {
		return varausPvm;
	}

	public void asetaVarausPvm(String varausPvm) {
		this.varausPvm = varausPvm;
	}

	public int annaVarausVoimassa() {
		return varausVoimassa;
	}

	public void asetaVarausVoimassa(int varausVoimassa) {
		this.varausVoimassa = varausVoimassa;
	}
	public String toString(){
		return asiakas.annaNimi()+" "+nide.annaNimi()+" "+ varausPvm + " "+varausVoimassa;
	}

}