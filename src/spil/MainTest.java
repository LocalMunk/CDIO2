package spil;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		
		
		
		
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
			assertTrue(Jens1111.getBeholdning() == 1000);
			assertFalse(Jens1111.getBeholdning() <0);
		
		
		
		
	}

}
