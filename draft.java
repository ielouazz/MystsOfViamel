package adventureGame;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class draft {
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

	public static void draftRoom() throws Exception{ 
		/*This is meant to be the tutorial Room*/
         Role role = loadRole();
		 Scanner var_answer = new Scanner(System.in);
		 String answer = var_answer.next();
		System.out.println("Enter the Draft" + " Room!\n ");
		
		System.out.println("With a tail but not a mouse");
		
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("With the wings but not a bird");
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println("From every myth and with the horns");
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Born from fire wake with wrath");
		
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("What am I?");
		
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("\nEnter your answer: ");        

		if ("dragon".equals(answer.toLowerCase())) {
			System.out.println("You are right!");
			TimeUnit.SECONDS.sleep(1);
			role.setGold(role.getGold() + 5);
			System.out.println("You got 5 gold!");
			TimeUnit.SECONDS.sleep(1);
			} else {
				System.out.println("You are wrong!");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("I am a dragon!");
				role.setHealth(role.getHealth() - 5);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You lost 5 health!");
				TimeUnit.SECONDS.sleep(1);
				}
		System.out.println("leave the room");
		intro.exitGame(role);
	}
	}
