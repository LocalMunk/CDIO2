package spil;

public class Strings {

	private String buttonPress = "'s turn, press the button to roll the dice";
	private String buttonPressAnswer = "Throw Dice";
	private String winText = " won the game";
	
	private String newGameText = "Want to play again?";
	private String newGameTextPositive = "Yes";
	private String newGameTextNegative = "No";
	private String exitMessage = "Then open the application again";
	
	private String extraTurnMessage = "You get an extra turn";
	private String incomeText = "income";
	
	private String felt1 = "Tower";
	private String felt2 = "Crater";
	private String felt3 = "Palace Gates";
	private String felt4 = "Cold Desert";
	private String felt5 = "Walled City";
	private String felt6 = "Monastery";
	private String felt7 = "Black Cave";
	private String felt8 = "Huts in the mountain";
	private String felt9 = "The Werewall";
	private String felt10 = "The pit";
	private String felt11 = "Goldmine";
	
	private String felt1Desc = "You reach the doors to a giant tower and by its entrance is a troll. The troll is sleeping and you sneak past it and steal some of its loot.";
	private String felt2Desc = "In your state of sleepiness you step over an edge and fall into a crater. A man offers to help you up for 100 gold.";
	private String felt3Desc = "You see a shady person lurking around and you report it to a guard. You're given a reward for helping catch a wanted man";
	private String felt4Desc = "You stumble across a house with a nice lady and she offers you shelter from the cold and to dry your clothes for a small sum of gold.";
	private String felt5Desc = "You take it upon yourself to hunt a monster and you're given a bag of coins to help you on your quest.";
	private String felt6Desc = "You come across some wandering munks who take you with them to their Monastery, grant you shelter and food for nothing in return.";
	private String felt7Desc = "You've entered the cave and it's pitch black. You fall and hit your head dropping your purse into the water.";
	private String felt8Desc = "You come across some scattered huts in the mountains. You look around for supplies and find some coins.";
	private String felt9Desc = "It's night and the moon is full. You hear screams nearby and you quickly buy a horse and ride away, thus giving you an extra round.";
	private String felt10Desc = "You wake up only to find yourself in chains with a bunch of gladiators. Since you're clearly not a gladiator you bribe the guard and escape";
	private String felt11Desc = "What sorcery is this? One moment you're walking in a cave chased by gnomes, the next you're surrounded by gold. you fill your pockets with gold and a bit more gold.";

	public String getButtonPress(){
		return buttonPress;
	}
	
	public String getButtonPressAnswer(){
		return buttonPressAnswer;
	}
	
	public String getWinText(){
		return winText;
	}
	
	public String getNewGameText(){
		return newGameText;
	}
	
	public String getNewGameTextPositive(){
		return newGameTextPositive;
	}
	
	public String getNewGameTextNegative(){
		return newGameTextNegative;
	}
	
	public String getExitMessage(){
		return exitMessage;
	}
	
	public String getExtraTurnMessage(){
		return extraTurnMessage;
	}
	
	public String getIncomeText(){
		return incomeText;
	}
	
	public String getFelt1(){
		return felt1;
	}
	
	public String getFelt2(){
		return felt2;
	}
	
	public String getFelt3(){
		return felt3;
	}
	
	public String getFelt4(){
		return felt4;
	}
	
	public String getFelt5(){
		return felt5;
	}
	
	public String getFelt6(){
		return felt6;
	}
	
	public String getFelt7(){
		return felt7;
	}
	
	public String getFelt8(){
		return felt8;
	}
	
	public String getFelt9(){
		return felt9;
	}
	
	public String getFelt10(){
		return felt10;
	}
	
	public String getFelt11(){
		return felt11;
	}
	
	public String getFeltDesc(int a){
		String desc = "";
		switch(a){
		case 1: desc = felt1Desc;
		break;
		case 2: desc = felt2Desc;
		break;
		case 3: desc = felt3Desc;
		break;
		case 4: desc = felt4Desc;
		break;
		case 5: desc = felt5Desc;
		break;
		case 6: desc = felt6Desc;
		break;
		case 7: desc = felt7Desc;
		break;
		case 8: desc = felt8Desc;
		break;
		case 9: desc = felt9Desc;
		break;
		case 10: desc = felt10Desc;
		break;
		case 11: desc = felt11Desc;
		break;
		
		}
		return desc;
	}

	
}
