package spil;

public class Konto {

	private int beholdning;
	
	public Konto(){
		beholdning = 1000;
	}
	public void setBeholdning(int a){
		beholdning += a;
		if(beholdning < 0)
			beholdning = 0;
	}
	
	public int getBeholdning(){
		return beholdning;
	}
	
	
	
	public String toString(){
		return(" har " + beholdning + " kroner");
	}
}
