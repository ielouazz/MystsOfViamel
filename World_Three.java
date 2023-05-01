package adventureGame;
import java.util.*;

public class World_Three {
	
	public static void main(Role role) throws Exception{
		System.out.println("World 3");

		//get scanner for question/answer portion
		role.setLocation(role.getLocation()+"3");
		Scanner var = new Scanner(System.in);
		System.out.println("You enter a cave");
		if (role.getRace().contains("human")) {
			System.out.println("  O \n"
		            + " /|\\ ~(*)~\n"
						+ " /\\   /-\\");}
		else if (role.getRace().contains("elf")) {
			System.out.println(" 'O' \n"
			           + " /|\\ ~(*)~\n"
						  + " /\\   /-\\");}
		else {
			System.out.println(" _o_ ~(*)~\n"
					+ " /\\   /-\\");
		}
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
				if (guess.contains("cat") && guess.contains("magic")) {
					System.out.println("The cat is not magical");}
				else if ((guess.contains("man") || guess.contains("driver")) && guess.contains("magic")) {
					System.out.println("The driver is not magical");}
				else if (guess.contains("time") || guess.contains("day") || guess.contains("night") || guess.contains("sun")) {
					System.out.println("It is daytime");}
				else{
					System.out.println("Your question is not relivant");}
			}
			else if (guess.charAt(guess.length() - 1) == '.') {
				if (guess.contains("day") || guess.contains("sun")) {
					correct = 1;}
				else {
					count -= 1;
					System.out.println("You are incorrect.");}
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
		driver.die(role);

	}
}
