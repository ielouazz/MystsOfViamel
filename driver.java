package adventureGame;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class driver {
	public static Role loadRole() throws Exception{Scanner scanner = new Scanner(System.in);
    String st = scanner.nextLine();
    String read = FileUtils.read(st + ".txt");
    String[] split = read.split("\\|");
    Role role = new Role(split[0], split[1], split[2], split[3], split[4], split[5], Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]));
    System.out.println("Welcome back " + role.getName() + "!");
    System.out.println("health: " + role.getHealth());
    System.out.println("gold: " + role.getGold());
    System.out.println("xp: " + role.getXp());
    return role;
}
	
		public static void main(String[] args) throws Exception{
			MusicUtils.PlayMusic("src/adventureGame/LordOfTheRings.wav");
			intro.main(args);
			//tutorialRoom.main();
			//die.main(role);
		}
		
		// Exit Game
	    public static void exitGame(Role role) throws Exception{
	    	//intro.loadRole();
	        FileUtils.write(role.getName() + ".txt", role.toString());
	        System.out.println("\n> Do you want to continue on with the game?");
	        Scanner scanner = new Scanner(System.in);
	        String meep = "";
	        while (!meep.equals("yes") && !meep.equals("no")) {
	        	System.out.println("\n> Please answer with yes or no: ");
	        	meep = scanner.nextLine();
	        	if(meep.equals("no")) {
	        		System.out.println("> Loading...");
	                TimeUnit.SECONDS.sleep(1);
	        		System.out.println("> Game over");
	                TimeUnit.SECONDS.sleep(1);
		        	System.exit(0);
		        	} else if (meep.equals("yes")) {
	                	System.out.println("> Loading...");
		        		//die(role);
		        	}
	        	
	        }
	        //Using the write function in FIleUtils to save the data to the text file

	        //Could be edit or connect or loop in to other world
	    }
	    public static void die(Role role) throws Exception {
	    	//Role role = loadRole();
	    	int die = (int) (Math.random() * 3 + 1);
	    	if (die == 1 && !role.getLocation().contains("1")) {
            System.out.println("\n> You are being transported by the myst off to....");
            TimeUnit.SECONDS.sleep(2);
            World_One.main(role);
        } else if (die == 2 && !role.getLocation().contains("2")) {
            //Make a function that would say " you are being transported by the myst off to..." and then also print out all of the character stats (xp, gold, health etc)
            System.out.println("\n> You are being transported by the myst off to....");
            TimeUnit.SECONDS.sleep(2);
            World_Two.main(role);
        } else if (die == 3 && !role.getLocation().contains("3")) {
            System.out.println("\n> You are being transported by the myst off to....");
            TimeUnit.SECONDS.sleep(2);
            World_Three.main(role);
		} else if (role.getLocation().contains("1") && role.getLocation().contains("2") && role.getLocation().contains("3")){
        	System.out.println("Good job! you finished the game!");
		} else {
			die(role);
        }
	}

}
