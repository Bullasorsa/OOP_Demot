	/* Toteuta Pankkitili luokka. Luokan tulee sisältää vähintään attribuutit saldo, tilinumero, tilinhaltija ja
korkoprosentti sekä metodit, joilla havainnoidaan ja muutetaan luokan tilaa (nosto, talletus, jne.).
Lisäksi luokan tulee sisältää metodi, jolla korko lisätään saldoon. (20 p) */
        /* Attribuutit, jotka on private */
import java.io.*;


public class Pankkitili {
			protected double saldo;
			protected long tilinumero;
			protected String tilinhaltija;
			protected double korkoprosentti;
			
		/* Konstruktorit */
		public Pankkitili(double saldo, long tilinumero, String tilinhaltija, double korkoprosentti){
			this.saldo = saldo;
			this.tilinumero = tilinumero;
			this.tilinhaltija = tilinhaltija;
			this.korkoprosentti = korkoprosentti;
		}
		
		/* Aksessorit */
		public double annaSaldo(){
			return saldo;
		}
		public void asetaSaldo(double saldo){
			this.saldo = saldo;
		}
		public long annaTilinumero(){
			return tilinumero;
		}
		public void asetaTilinumero(long tilinumero){
			this.tilinumero = tilinumero;
		}
		public String annaTilinhaltija(){
			return tilinhaltija;
		}
		public void asetaTilinhaltija(String tilinhaltija){
			this.tilinhaltija = tilinhaltija;
		}
		public double annaKorkoprosentti(){
			return korkoprosentti;
		}
		public void asetaKorkoprosentti(double korkoprosentti){
			this.korkoprosentti = korkoprosentti;
		}
		
		/* Muut metodit */
		public void nosto(double maara){
			saldo = saldo - maara;
		}
		public void talletus(double maara){
			saldo = saldo + maara;
		}
		public void tulosta(){
			System.out.println("Tilinhaltija:" + tilinhaltija+ " Saldo:" + saldo+ " Tilinumero:" + tilinumero+ " Korkoprosentti:" + korkoprosentti);
		}
		public void lisaaKorko(){
			saldo = saldo+saldo*(korkoprosentti/100);
		}
		
		public static class Kayttotili extends Pankkitili{
			
			protected int nostomaara;
			protected int panomaara;
			
		public Kayttotili(double saldo, long tilinumero, String tilinhaltija, double korkoprosentti, int nostomaara, int panomaara){
			
			super(saldo, tilinumero, tilinhaltija, korkoprosentti);
			this.nostomaara=nostomaara;
			this.panomaara=panomaara;
			
			
			
		}
		public void tulostaKaytto(){
			System.out.println("Tilinhaltija:" + tilinhaltija+ " Saldo:" + saldo+ " Tilinumero:" + tilinumero+ " Korkoprosentti:" + korkoprosentti+ " Nostot:" + nostomaara + " Panojen maara:"+ panomaara );
		}
			
		}
		
		public static class Saastotili extends Pankkitili{
			
			protected int maxNostoMaara;
			protected int maxPanoMaara;
			
			
			
			public Saastotili(double saldo, long tilinumero, String tilinhaltija, double korkoprosentti, int maxNostoMaara, int maxPanoMaara){
				
			
			super(saldo, tilinumero, tilinhaltija, korkoprosentti);
			this.maxNostoMaara=maxNostoMaara;
			this.maxPanoMaara=maxPanoMaara;
		}
			
			public void tulostaSaasto(){
				System.out.println("Tilinhaltija:" + tilinhaltija+ " Saldo:" + saldo+ " Tilinumero:" + tilinumero+ " Korkoprosentti:" + korkoprosentti+ " Nostot max:" + maxNostoMaara + " Panojen max maara:"+ maxPanoMaara );
			}
		
		}
		
		public static class Luottotili extends Pankkitili{
			
			protected int luottoraja;
			protected boolean onkoLuottoa;
			
			public Luottotili(double saldo, long tilinumero, String tilinhaltija, double korkoprosentti, int luottoraja, boolean onkoLuottoa){
			super(saldo, tilinumero, tilinhaltija, korkoprosentti);
			this.luottoraja=luottoraja;
			this.onkoLuottoa=onkoLuottoa;
		}
		
			public void tulostaLuotto(){
				System.out.println("Tilinhaltija:" + tilinhaltija+ " Saldo:" + saldo+ " Tilinumero:" + tilinumero+ " Korkoprosentti:" + korkoprosentti+ " Luottorajasi:"+luottoraja+"Onko sinulla luottoa?:"+onkoLuottoa);
			}
		
		
		
		}
		
		

		public void kirjoitaTiedostoon(String tiedosto){
			File file = new File(tiedosto);
			
		try{
			if(!file.exists())
				file.createNewFile();
		
		BufferedWriter ulos = new BufferedWriter(new FileWriter(file));
		
		ulos.write(tilinhaltija+",");
		ulos.write(String.valueOf(tilinumero) + ",");
		ulos.write(String.valueOf(saldo) + ",");
		ulos.write(String.valueOf(korkoprosentti) + ",");
		
		ulos.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		}
		
		public void lueTiedostosta(String tiedosto){
			File file= new File(tiedosto);
			
			 try{
				   
				    BufferedReader sisaan = new BufferedReader(new FileReader(file));
				    String mjono = sisaan.readLine();
				   
				    String[] tiedot = mjono.split(",");
				 
				    tilinhaltija = tiedot[0];
				    tilinumero = Long.parseLong(tiedot[1]);
				    saldo = Double.parseDouble(tiedot[2]);
				    korkoprosentti = Double.parseDouble(tiedot[3]);
				     
				    sisaan.close();
				    }
				 
				catch(IOException e){
				  e.printStackTrace();
				}
			
		}
			
		}
		
		


