
public class Pelikortti implements Comparable<Pelikortti> {

	private String maa;
	private int arvo;
	
	
	public Pelikortti(String maa, int arvo){
		this.maa = maa;
		this.arvo = arvo;
	}
	
	public String annaMaa(){
		return maa;
	}
	
	public int annaArvo(){
		return arvo;
	}
	
	public String toString() {
		return maa+arvo;
	}

	@Override
	public int compareTo(Pelikortti pelikortti) {
		if (arvo < pelikortti.annaArvo()){
			return -1;
			} else if (arvo == pelikortti.annaArvo()){
			return 0;
			}
			return 1;
		
	}
	
	
	
}
