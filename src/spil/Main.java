package spil;
import desktop_resources.GUI;
import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_fields.Street;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		Spiller spiller1 = new Spiller("Jens", 1111);
		Spiller spiller2 = new Spiller("Jakob", 1112);
		Konto Jens1111 = new Konto(1000);
		Konto Jakob1112 = new Konto(1000);
		Terning tern = new Terning(6);
		GUI.addPlayer(spiller1.getNavn(), 1000);
		GUI.addPlayer(spiller2.getNavn(), 1000);
		
		tern.kast();
	}

	public static void init(){
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
