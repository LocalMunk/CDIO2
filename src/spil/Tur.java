package spil;

public class Tur {

	private int check;
	
	public Tur(){
		check = 1;
	}
	
	public void skift(){
		if(check == 1)
			check = 2;
		else
			check = 1;
	}
	
	public int getCheck(){
		return check;
	}
}
