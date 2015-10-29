package spil;

public class Felt {

	private int[] feltVærdi = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
	private String[] feltTekst = {
			"You reach the doors to a giant tower and by its entrance is a troll. The troll is sleeping and you sneak past it and steal some of its loot.",
			"In your state of sleepiness you step over an edge and fall into a crater. A man offers to help you up for 100 gold.",
			"You see a shady person lurking around and you report it to a guard. You're given a reward for helping catch a wanted man",
			"You stumble across a house with a nice lady and she offers you shelter from the cold and to dry your clothes for a small sum of gold.",
			"You take it upon yourself to hunt a monster and you're given a bag of coins to help you on your quest.",
			"You come across some wandering munks who take you with them to their Monastery, grant you shelter and food for nothing in return.",
			"You've entered the cave and it's pitch black. You fall and hit your head dropping your purse into the water.",
			"You come across some scattered huts in the mountains. You look around for supplies and find some coins.",
			"It's night and the moon is full. You hear screams nearby and you quickly buy a horse and ride away, thus giving you an extra round.",
			"You wake up only to find yourself in chains with a bunch of gladiators. Since you're clearly not a gladiator you bribe the guard and escape",
			"What sorcery is this? One moment you're walking in a cave chased by gnomes, the next you're surrounded by gold. you fill your pockets with gold and a bit more gold."};
	
	public int getFeltVærdi(int a){
		return feltVærdi[a];
	}
	
	public String getFeltTekst(int a){
		return feltTekst[a];
	}
	
	
}
