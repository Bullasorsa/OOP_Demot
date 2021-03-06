import java.util.ArrayList;
import java.util.Collections;



public class Pokerikasi implements Comparable<Pokerikasi> {
	
	protected ArrayList<Pelikortti> kasi;
	
	public Pokerikasi(){
		kasi = new ArrayList<Pelikortti>();
	}
	
	 void lisaaKortti(Pelikortti p){
		kasi.add(p);
		Collections.sort(kasi);
	}
	 Pelikortti poistaKortti(Pelikortti p){
		kasi.remove(p);
		Collections.sort(kasi);
		return p;
	}
	
	 int kadenArvo(){
		if (onkoVariSuora()){
			return 9;
		}
		if(onkoNeloset())
			return 8;
		if(onkoTayskasi())
			return 7;
		if(onkoVari())
			return 6;
		if(onkoSuora())
			return 5;
		if(onkoKolmoset())
			return 4;
		if(onkoKaksiparia())
			return 3;
		if(onkoPari())
			return 2;
		else
			return 1;
	}
	 
	 
	 
	 
	 
	 
	 boolean onkoPari(){
		for(int i=0;i<kasi.size()-1;i++){
		if (kasi.get(i).annaArvo() == kasi.get(i+1).annaArvo()){
			return true;
		}
		}
		
		return false;
	}
	
	 boolean onkoKolmoset(){
		for(int i=0;i<kasi.size()-2;i++){
			if (kasi.get(i).annaArvo() == kasi.get(i+1).annaArvo()){
				if(kasi.get(i+1).annaArvo() == kasi.get(i+2).annaArvo()){
				return true;
				}
			}
			}
			
			return false;
		}	
	
	boolean  onkoNeloset(){
		for(int k=0;k<kasi.size()-2;k++){
			if (kasi.get(k).annaArvo() == kasi.get(k+1).annaArvo()){
				if(kasi.get(k+1).annaArvo() == kasi.get(k+2).annaArvo()){
					if(kasi.get(k+2).annaArvo()==kasi.get(k+3).annaArvo()){
				return true;
				}
				}
			}
			}
			
			return false;
		}	
	
	 boolean onkoSuora(){
		for(int j=1;j<kasi.size();j++){
			if(kasi.get(j).annaArvo() - kasi.get(j-1).annaArvo() != 1){
				return false;
			}
		}
		return true;
	}
	 
	 boolean onkoVari(){
		 String onkoVari=kasi.get(0).annaMaa();
			for(int o=1;o<kasi.size();o++){
				if(!kasi.get(o).annaMaa().equals(onkoVari)){
					return false;
				}
			}
			return true;
		}
	 
	 boolean onkoVariSuora(){
		 if (onkoVari() && onkoSuora()){
			 return true;
		 }
		 return false;
	 }
	 
	 boolean onkoTayskasi(){
		 if(kasi.get(0).annaArvo() == kasi.get(1).annaArvo() && kasi.get(2).annaArvo() == kasi.get(3).annaArvo() && kasi.get(3).annaArvo() == kasi.get(4).annaArvo() 
			|| kasi.get(0).annaArvo() == kasi.get(1).annaArvo() && kasi.get(1).annaArvo() == kasi.get(2).annaArvo() && kasi.get(3).annaArvo() == kasi.get(4).annaArvo()  ){
			 return true;
	 }
		 return false;
	 }
	
	 boolean onkoKaksiparia(){
		 int parienmaara =0;
		 for(int m=0;m<kasi.size()-1;m++){
				if (kasi.get(m).annaArvo() == kasi.get(m+1).annaArvo()){
					parienmaara=parienmaara+1;
				}
				
		 }
		 if(parienmaara==2){
				return true;
			}
		 return false;
	 }
	
	

	@Override
	public int compareTo(Pokerikasi o) {
			
		
		return this.kadenArvo()-o.kadenArvo();
	}
	
	
	
	
	
	
	
	
	

}
