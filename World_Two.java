package adventureGame;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class World_Two {
	public static Role loadRole() throws Exception{Scanner scanner = new Scanner(System.in);
    String st = scanner.nextLine();
    String read = FileUtils.read(st + ".txt");
    String[] split = read.split("\\|");
    Role role = new Role(split[0], split[1], Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]));
    System.out.println("Welcome back " + role.getName() + "!");
    System.out.println("health: " + role.getHealth());
    System.out.println("gold: " + role.getGold());
    System.out.println("xp: " + role.getXp());
    return role;
	}

	public static void main() throws Exception{
		//get scanner for question/answer portions
		Scanner var = new Scanner(System.in);
		//printing setting stuff
		System.out.println("You appear in a lush meadow, flowers cover the ground and a circles of trees shades you and conceals what you can only assume to be the rest of the forest. \n"
				+"What would you like to do?");
		//They gave to get the keyword "look"
		String choice_one = ""; // variable for player's choice
		String choice_two = "";
		String choice_three = "";
		Role role = loadRole();
		//riddle #1
		while ("look".equals(choice_one.toLowerCase())) {
			System.out.println("You look to the ground and see a series of runes on the ground");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("You take a few steps back and see that it actully spells out something...");
			
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Loading...");
			TimeUnit.SECONDS.sleep(1);

			System.out.println("'What goes up and down but does not move?'");
			if(choice_two.contains("staircase") && choice_two.contains("stair case")){
				System.out.println("The runes beging to move across the grass, making way for a tunnel that contains a staircase");
				TimeUnit.SECONDS.sleep(1);
			}
			System.out.println("What would you like to do?");
			TimeUnit.SECONDS.sleep(1);
			
			if(choice_three.contains("take")) {
				role.setGold(role.getGold() + 20);
				System.out.println("You got 20 gold!");
				TimeUnit.SECONDS.sleep(1);
			} else if(choice_three.contains("look")){
				System.out.println("You see more runes on the wall that read");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Loading...");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("'I do not wish to hoard my gold, I only wish to hold what I love. /n"
						+ "~ Viamel");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You recognize that name...");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("It is what people have been calling the mist.");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("But surely mist cannot write anything");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Right?");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Loading...");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("The myst surrounds you once more, no extra moment to contemplate what you have found out.");
				// wee want to add a save progress or go to next room option around here or make a function and inherit it in the main..?
			}
	}
		System.out.println("That is not quite it");
		intro.exitGame(null);
		
		
		//riddle #2
		

	}

}
