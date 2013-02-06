import java.util.ArrayList;
import java.util.Collections;

//Uusi luokka Korttipakka
public class Korttipakka {

	//Luodaan ArrayList kortit
	private ArrayList<Pelikortti> kortit;
	
	//Luodaan itse pakka
	public Korttipakka(){
		kortit = new ArrayList<Pelikortti>();
		
		String[] maat = {"H", "S", "C", "D"};
		for(int i=0; i<4; i++){
			for(int j=1; j<14;j++){
				kortit.add(new Pelikortti(maat[i],j)); //LisŠtŠŠn ArrayListin perŠŠn aina uusi kortti
			}											// Pelikortti-luokasta
		}
	}
	
	public void tulosta(){
		for(int k=0; k<kortit.size(); k++){
			System.out.print(kortit.get(k).annaMaa()+kortit.get(k).annaArvo()+" | ");
		}
	}
	
	public void shuffle(){
		Collections.shuffle(kortit);
		//Collections-kirjaston shuffle
	}
	public void nosta(int nosto){
		for (int n=0;n<nosto;n++){
			System.out.println(kortit.get(n).annaMaa() + kortit.get(n).annaArvo());
		}
	}
	
	public Pelikortti draw(){
		return kortit.remove(0);
	}
	
	
	public void uusiPakka(){

		//Sama kuin uuden pakan luonti alussa
		kortit = new ArrayList<Pelikortti>();
		
		String[] maat = {"H", "S", "C", "D"};
		for(int l=0; l<4; l++){
			for(int m=1; m<14; m++){
				kortit.add(new Pelikortti(maat[l],m));
			}
		}
	}
	}
	
	
	

