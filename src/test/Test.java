package test;

import spil.Spiller;
import spil.Konto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spiller Jens = new Spiller("Jens", 1111);
		Konto Jens1111 = new Konto(1000);
		
		for(int i = -1; i < 2; i++){
			System.out.println(" Deposit attempt:" + i);
			Jens1111.deposit(i);	
		}
		
		for(int i = -1; i < 2; i++){
			System.out.println(" Withdraw attempt:" + i);
			Jens1111.withdraw(i);	
		}
		
		System.out.println(" Withdraw attempt:" + 100000);
		Jens1111.withdraw(100000);
	}

}
