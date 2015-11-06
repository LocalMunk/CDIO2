package spil;
import desktop_resources.GUI;
import desktop_fields.Field;
import desktop_fields.Street;
public class Main {

	public static void main(String[] args) {
		Strings string = new Strings();
		init(string);
		Spiller spiller1 = new Spiller("Sherlock", 1111);
		Spiller spiller2 = new Spiller("Watson", 1112);
		Konto Sherlock1111 = new Konto(1000);
		Konto Watson1112 = new Konto(1000);
		Terning tern = new Terning(6);
		Tur tur = new Tur();
		Felt felt = new Felt();
		
		GUI.addPlayer(spiller1.getNavn(), 1000);
		GUI.addPlayer(spiller2.getNavn(), 1000);
		while(true){
			if(tur.getCheck()==1)
				spilloop(spiller1, tern, felt, Sherlock1111, tur, string);
			else if(tur.getCheck()==2)
				spilloop(spiller2, tern, felt, Watson1112, tur, string);
		}
	}

	public static void spilloop(Spiller player, Terning tern, Felt felt, Konto konto, Tur tur, Strings string){	
		if(GUI.getUserButtonPressed(player.getNavn() + string.getButtonPress(), string.getButtonPressAnswer()).equals(string.getButtonPressAnswer())){
			GUI.removeAllCars(player.getNavn());
			GUI.setCar(tern.kast()-1, player.getNavn());
			GUI.showMessage("" + string.getFeltDesc((tern.getVærdi()-1)));
			int feltværdi = felt.getFeltVærdi((tern.getVærdi()-2), string);
			if(feltværdi > 0){
				konto.deposit(feltværdi);
				GUI.setBalance(player.getNavn(), konto.getBeholdning());
				if(konto.getBeholdning() >= 3000){
					GUI.showMessage(player.getNavn() + string.getWinText());
					if(GUI.getUserButtonPressed(string.getNewGameText(), string.getNewGameTextPositive(), string.getNewGameTextNegative()).equals(string.getNewGameTextPositive())){
						GUI.showMessage(string.getExitMessage());
						System.exit(0);
					}
					else{
						System.exit(0);
					}
						
									
				}
			}
			else if(feltværdi < 0){
				if(feltværdi < konto.getBeholdning()){
					konto.withdraw(-feltværdi);
					GUI.setBalance(player.getNavn(), konto.getBeholdning());
				}
				else{
					konto.withdraw(konto.getBeholdning());
				}
			}
			
			
			if(tern.getVærdi()-2 != 8)
				tur.skift();
			}
		}
	
	
	public static void init(Strings string){ // initialiserer Gui'en
		Field[] fields = new Field[11];
		fields[0] = new Street.Builder().setTitle(string.getFelt1()).build();
		fields[1] = new Street.Builder().setTitle(string.getFelt2()).build();
		fields[2] = new Street.Builder().setTitle(string.getFelt3()).build();
		fields[3] = new Street.Builder().setTitle(string.getFelt4()).build();
		fields[4] = new Street.Builder().setTitle(string.getFelt5()).build();
		fields[5] = new Street.Builder().setTitle(string.getFelt6()).build();
		fields[6] = new Street.Builder().setTitle(string.getFelt7()).build();
		fields[7] = new Street.Builder().setTitle(string.getFelt8()).build();
		fields[8] = new Street.Builder().setTitle(string.getFelt9()).build();
		fields[9] = new Street.Builder().setTitle(string.getFelt10()).build();
		fields[10] = new Street.Builder().setTitle(string.getFelt11()).build();
		GUI.create(fields);
		GUI.setDescriptionText(9, string.getExtraTurnMessage());
		GUI.setSubText(1, string.getIncomeText() + ": +250");
		GUI.setSubText(2, string.getIncomeText() + ": -100");
		GUI.setSubText(3, string.getIncomeText() + ": +100");
		GUI.setSubText(4, string.getIncomeText() + ": -20");
		GUI.setSubText(5, string.getIncomeText() + ": +180");
		GUI.setSubText(6, string.getIncomeText() + ": 0");
		GUI.setSubText(7, string.getIncomeText() + ": -70");
		GUI.setSubText(8, string.getIncomeText() + ": +60");
		GUI.setSubText(9, string.getIncomeText() + ": -80");
		GUI.setSubText(10, string.getIncomeText() + ": -50");
		GUI.setSubText(11, string.getIncomeText() + ": +650");
	}
	
	}
