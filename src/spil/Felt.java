package spil;

public class Felt {

	private int[] feltVærdi = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
	private String[] feltTekst = {"","","","","","","","","","",""};
	
	public int getFeltVærdi(int a){
		return feltVærdi[a];
	}
	
	public String getFeltTekst(int a){
		return feltTekst[a];
	}
	
	
}
