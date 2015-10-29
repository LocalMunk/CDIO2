package spil;

import desktop_resources.GUI;

public class Terning {

	private int v�rdi, sider;
	
	public Terning(int sides){
		sider = sides;
	}
	
	public int kast(){
		int a, b;
		a = (int)(Math.random() * sider +1);
		b = (int)(Math.random() * sider +1);	
		GUI.setDice(a, b);
		v�rdi = a+b;
		return a+b;
	}
	
	public int getV�rdi(){
		return v�rdi;
	}
}
