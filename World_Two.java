package adventureGame;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class World_Two {

	public static void main(Role role) throws Exception{
		System.out.println("> Welcome to World 2!");
		role.setLocation(role.getLocation() + "2");
		//get scanner for question/answer portions
		Scanner var = new Scanner(System.in);
		//printing setting stuff
		if (role.getRace().contains("human")) {
			System.out.println("     O\n"
		            + "    /|\\\n"
		            + "^^^^/\\^^^^");}
		else if (role.getRace().contains("elf")) {
		     System.out.println("    'O'\n"
		            + "    /|\\\n"
		            + "^^^^/\\^^^^");}
		else {
		     System.out.println("    _o_\n"
		            + "^^^^/\\^^^^");
		}
		System.out.println("> You appear in a lush meadow, flowers cover the ground and a circles of trees shades you and conceals what you can only assume to be the rest of the forest. \n"
				+"> What would you like to do?");
		//They gave to get the keyword "look"
		String choice_one = ""; // variable for player's choice
		String choice_two = "";
		String choice_three = "";
		//wait until the player looks around
		while (!choice_one.contains("look")) {
			System.out.println("> [Hint: do something with your eyes.]");
			choice_one = (var.nextLine()).toLowerCase();}
		//just talk a lil bit
		System.out.println("> You look to the ground and see a series of runes on the ground");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("> You take a few steps back and see that it actully spells out something...");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("> 'What goes up and down but does not move?'");
		//second riddle, wait until they say stair
		while(!choice_two.contains("stair")){
			System.out.println("> Keep guessing til you get it right");
			choice_two = (var.nextLine()).toLowerCase();}
		//talk a little bit
		System.out.println("> The runes beging to move across the grass, making way for a tunnel that contains a staircase");
		TimeUnit.SECONDS.sleep(1);
		if (role.getRace().contains("human")) {
			System.out.println(" O\n"
		            + "/|\\     _\\\n"
		            + "/\\     |_|");}
		else if (role.getRace().contains("elf")) {
			System.out.println("'O'\n"
		            + "/|\\     _\\\n"
		            + "/\\     |_|");}
		else {
			System.out.println("_o_     _\\\n"
		            + "/\\     |_|");
		}
		System.out.println("> You go down the stairs to a room covered in more runes with a small treasure chest in the corner");
		TimeUnit.SECONDS.sleep(1);
		//wait until player says treasure, chest, or runes
		while (!choice_three.contains("treasure") && !choice_three.contains("chest") && !choice_three.contains("runes")) {
			System.out.println("> What would you like to do?");
			choice_three = (var.nextLine()).toLowerCase();
			if(choice_three.contains("treasure") || choice_three.contains("chest")) {
				role.setGold(role.getGold() + 20);
				System.out.println("> You got 20 gold!");
				TimeUnit.SECONDS.sleep(1);
			} else if(choice_three.contains("runes")){
				System.out.println("> You see more runes on the wall that read");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("> 'I do not wish to hoard my gold, I only wish to hold what I love. /n"
						+ "~ Viamel");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("> You recognize that name...");
				System.out.println("> It is what people have been calling the mist.");
				System.out.println("> But surely mist cannot write anything");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("> Right?");}
			else {
				System.out.println("> You could do that, but perhaps there's something more relevant to be done...");}}
			//add world 2 to role
			TimeUnit.SECONDS.sleep(1);
			System.out.println("> The myst surrounds you once more, no extra moment to contemplate what you have found out.");
				// wee want to add a save progress or go to next room option around here or make a function and inherit it in the main..?
		System.out.println("> That is not quite it...");
		driver.exitGame(role);
		driver.die(role);
}
		
		//riddle #2
		

	}
