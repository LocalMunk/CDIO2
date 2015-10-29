package spil;

public class Spiller {

	private String navn ="";
	
	private String kontonr;
	
	public Spiller(String a, int b){
		navn = a;
		kontonr = a + " " + b;
	}
	
	public String getNavn(){
		return navn;
	}
	
	public String getKonto(){
		return kontonr;
	}
}
