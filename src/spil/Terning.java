package spil;
import java.util.Random;

import desktop_resources.GUI;;

public class Terning {

	private int værdi, sider;
	
	public Terning(int sides){
		sider = sides;
	}
	
	public int kast(){
		int a, b;
		a = (int)(Math.random() * sider +1);
		b = (int)(Math.random() * sider +1);		
		GUI.setDice(a, b);
		return a+b;
	}
}
