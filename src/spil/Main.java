package spil;
import desktop_resources.GUI;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_fields.*;
import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_fields.Street;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
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
				spilloop(spiller1, tern, felt, Sherlock1111, tur);
			else if(tur.getCheck()==2)
				spilloop(spiller2, tern, felt, Watson1112, tur);
		}
	}

	public static void spilloop(Spiller player, Terning tern, Felt felt, Konto konto, Tur tur){	
		if(GUI.getUserButtonPressed(player.getNavn() + "'s tur, tryk på knappen for at slå med terningerne", "Kast Terning").equals("Kast Terning")){
			GUI.removeAllCars(player.getNavn());
			GUI.setCar(tern.kast()-1, player.getNavn());
			GUI.showMessage("" + felt.getFeltTekst((tern.getVærdi()-2)));
			int feltværdi = felt.getFeltVærdi((tern.getVærdi()-2));
			if(feltværdi > 0){
				konto.deposit(feltværdi);
				GUI.setBalance(player.getNavn(), konto.getBeholdning());
				if(konto.getBeholdning() >= 3000){
					GUI.showMessage(player.getNavn() + " won the game");
					if(GUI.getUserButtonPressed("Want to play again?", "Yes", "No").equals("Yes")){
						GUI.showMessage("Then open the application again");
						System.exit(0);
					}
					else{
						System.exit(0);
					}
						
									
				}
			}
			else if(feltværdi < 0){
				konto.withdraw(-feltværdi);
				GUI.setBalance(player.getNavn(), konto.getBeholdning());
			}
			
			
			if(tern.getVærdi()-2 != 8)
				tur.skift();
			}
		}
	
	
	public static void init(){ // initialiserer Gui'en
		Field[] fields = new Field[11];
		fields[0] = new Street.Builder().setTitle("Tower").build();
		fields[1] = new Street.Builder().setTitle("Crater").build();
		fields[2] = new Street.Builder().setTitle("Palace Gates").build();
		fields[3] = new Street.Builder().setTitle("Cold Desert").build();
		fields[4] = new Street.Builder().setTitle("Walled City").build();
		fields[5] = new Street.Builder().setTitle("Monastery").build();
		fields[6] = new Street.Builder().setTitle("Black Cave").build();
		fields[7] = new Street.Builder().setTitle("Huts in the mountain").build();
		fields[8] = new Street.Builder().setTitle("The Werewall").build();
		fields[9] = new Street.Builder().setTitle("The pit").build();
		fields[10] = new Street.Builder().setTitle("Goldmine").build();
		GUI.create(fields);
		GUI.setDescriptionText(1, "");
		GUI.setDescriptionText(2, "");
		GUI.setDescriptionText(3, "");
		GUI.setDescriptionText(4, "");
		GUI.setDescriptionText(5, "");
		GUI.setDescriptionText(6, "");
		GUI.setDescriptionText(7, "");
		GUI.setDescriptionText(8, "");
		GUI.setDescriptionText(9, "You get an extra turn");
		GUI.setDescriptionText(10, "");
		GUI.setDescriptionText(11, "");
		GUI.setSubText(1, "Income: +250");
		GUI.setSubText(2, "Income: -100");
		GUI.setSubText(3, "Income: +100");
		GUI.setSubText(4, "Income: -20");
		GUI.setSubText(5, "Income: +180");
		GUI.setSubText(6, "Income: 0");
		GUI.setSubText(7, "Income: -70");
		GUI.setSubText(8, "Income: +60");
		GUI.setSubText(9, "Income: -80");
		GUI.setSubText(10, "Income: -50");
		GUI.setSubText(11, "Income: +650");
	}
	
	}
