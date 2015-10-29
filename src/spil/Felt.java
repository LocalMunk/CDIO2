package spil;

public class Felt {

	private int[] feltVærdi = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
	private String[] feltTekst = {"","","","","","","","","","You wake up","What sorcery is this? One moment you're walking in a cave chased by gnomes, the next you're surrounded by gold. you fill your pockets with gold and a bit more gold"};
	
	public int getFeltVærdi(int a){
		return feltVærdi[a];
	}
	
	public String getFeltTekst(int a){
		return feltTekst[a];
	}
	
	
}
