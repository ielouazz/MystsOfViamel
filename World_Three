package adventureGame;
import java.util.*;

public class World_Three {
	public static Role loadRole() throws Exception{Scanner scanner = new Scanner(System.in);
    String st = scanner.nextLine();
    String read = FileUtils.read(st + ".txt");
    String[] split = read.split("\\|");
    Role role = new Role(split[0], split[1], split[2], split[3], split[4], split[5], split[6], Integer.parseInt(split[7]), Integer.parseInt(split[8]), Integer.parseInt(split[9]))
    		System.out.println("Welcome back " + role.getName() + "!");
    System.out.println("health: " + role.getHealth());
    System.out.println("gold: " + role.getGold());
    System.out.println("xp: " + role.getXp());
    return role;}
	
	public static void main() throws Exception{
		System.out.println("This is world 3");
		//get scanner for question/answer portion
		Scanner var = new Scanner(System.in);
		System.out.println("You enter a cave");
		Role role = loadRole();
		System.out.println("A crystal ball rises up behind the mist, an unusual ethereal voice reverberates through the cave:");
		System.out.println("Dear stranger, welcome to my carriage. You are automatically a participant in my game,  and I will present mysterious situations to you. Find out the truth behind the veil that I did not tell you by asking further questions. I will only answer \"yes\" or \"no\" to your questions.");
		System.out.println("A black cat is hiding in a the middle of a road where there is an unlit street lamp. A man is driving his vehicle with no lights to speak of. Despite all of this, he is able to see and avoid harming the cat. How did he do this?");
		//Answer Riddle Loop
		int count = 3;
		String guess = "";
		int correct = 0;
		while (count > 0 && correct ==0) {
			System.out.println("Hint: end with a ? to ask a yes or no question for more information. End with a . to enter your guess. You have " + count + " guesses left");
			guess = (var.nextLine()).toLowerCase();
			if (guess.charAt(guess.length() - 1) == '?') {
				System.out.println("Your question is not relivant");
			}
			else if (guess.charAt(guess.length() - 1) == '.') {
				if (guess.contains("day") || guess.contains("sun")) {
					correct = 1;
				}
				else {
					count -= 1;
					System.out.println("You are incorrect.");
				}
			}
			else {
				System.out.println("make sure to end your statement with either a ? or .");
			}
		}
		//if player guessed right
		if (correct == 1) {
			System.out.println("crystal ball shines a warm light across the cave, as though that same sunshine were spreading across your skin");
			System.out.println("You have earned 10 gold");
			role.setGold(10);
		}
		else {
			System.out.println("The crystal’s voice lets out a harsh laugh, but something about it sounds wrong… but why?");
			System.out.println("You believe the crystal has lied about something… perhaps if you say what, it will let you go");
			//Second Riddle
			guess = "";
			while (!guess.contains("cave") || !guess.contains("carriage")) {
				System.out.println("Hint: remember everything the crystal has said, what was wrong");
				guess = (var.nextLine()).toLowerCase();
			}
			System.out.println("The crystal stops laughing abruptly, and it’s ball shows in image of an older wizard throwing the crystal out of the carriage.\n"
					+ "It then shines a warm light across the cave, thanking you for reminding it the truth.\n"
					+ "You have earned 5 gold");
			role.setGold(5);
		}
		driver.exitGame(role);
	}
}
