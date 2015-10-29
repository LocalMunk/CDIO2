package spil;

public class Spiller {

	private String navn ="";
	
	private int kontonr;
	
	public Spiller(String a, int b){
		navn = a;
		kontonr = b;
	}
	
	public getNavn(){
		return navn;
	}
}
