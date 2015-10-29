package spil;
import Math.random;

public class Terning {

	private int værdi, sider;
	
	public Terning(int sides){
		sider = sides;
	}
	
	public int kast(){
		int a, b;
		a = (int)Math.random() * sider +1;
		b = (int)Math.random() * sider +1;		
		return a+b;
	}
}
