package spil;

public class Konto {

	private int beholdning;
	
	public Konto(int a){
		beholdning = a;
	}
		
	public int getBeholdning(){
		return beholdning;
	}
	
	public void withdraw(int take){
		if(take < beholdning && take > 0){
			beholdning = beholdning - take;
			System.out.println("Withdraw Successful");
		}
		else{
			System.out.println("Withdraw failed");
		}
	}
	
	public void deposit(int give){
		if(give > 0){
			beholdning += give;
			System.out.println("Deposit successful");
		}
		else{
			System.out.println("Deposit failed");
		}
	}
	
	
	public String toString(Spiller player){
		return(player + " har " + beholdning + " kroner");
	}
}
