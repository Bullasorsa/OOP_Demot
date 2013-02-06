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
		return 0;
	}
	 boolean onkoPari(){
		for(int i=0;i<kasi.size();i++){
		if (kasi.get(i).annaArvo() == kasi.get(i+1).annaArvo()){
			return true;
		}
		}
		
		return false;
	}
	
	 boolean onkoKolmoset(){
		for(int i=0;i<kasi.size();i++){
			if (kasi.get(i).annaArvo() == kasi.get(i+1).annaArvo()){
				if(kasi.get(i+1).annaArvo() == kasi.get(i+2).annaArvo()){
				return true;
				}
			}
			}
			
			return false;
		}	
	
	boolean  onkoNeloset(){
		for(int k=0;k<kasi.size();k++){
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
			for(int o=1;o<kasi.size();o++){
				if(kasi.get(o).annaMaa().equals(kasi.get(o-1).annaMaa())){
					return true;
				}
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
		 for(int m=0;m<kasi.size();m++){
				if (kasi.get(m).annaArvo() == kasi.get(m+1).annaArvo()){
					parienmaara=parienmaara+1;
				}
		 }
		 return true;
	 }
	
	

	@Override
	public int compareTo(Pokerikasi o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
	

}
