package adventureGame;
import java.util.*;
import java.util.concurrent.TimeUnit;
//import printLogo;
import java.util.ArrayList;
public class intro {
	//printing out logo
	public static void logo() throws Exception{
		System.out.println("You see it coming for you..");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\nYou had managed to avoid it these past 5 years, but no longer.");
		TimeUnit.SECONDS.sleep(2);
	    System.out.println("\nAs the fog rolls in...you accept your fate.");
	    TimeUnit.SECONDS.sleep(2);
		System.out.println("\nThe magic mists surround you,");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\nand transport you to…");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("||           ||             \n   "
						+ "\n|| \\\\      //||                 \n"
						+ "\n||    \\\\//   ||  Y S T S   \n"
						+ "\n||           ||                \n"
						+ "\n||           ||    \n"
						+ "");
				
		TimeUnit.SECONDS.sleep(1);
		System.out.println("//=========\\\\ \n"
						+ "\n||         ||     \n"
						+ "\n||         ||  F  \n"
						+ "\n||         ||        \n"
						+ "\n\\\\========//       \n"
						+ "");
				
		TimeUnit.SECONDS.sleep(1);
		System.out.println("\\\\           //\n"
						+ "\n \\\\        //\n"
						+ "\n  \\\\      //  I A M E L\n"
						+ "\n    \\\\  //\n"
						+ "\n     \\\\//\n"
						+ "");
	}
	public static void main(String[] args) throws Exception{
		//setting variables of experience, money, and health as well as name
		
		logo();
		Scanner var = new Scanner(System.in);
		
		System.out.println("Enter your name : " );
		String st = var.nextLine();
	
		int xp = 0;
		int health = 20;
		int gold = 5;
		//int life = 0;
		List<String> items = new ArrayList<>();
		
		

		//arrayIdentity
		ArrayList<String> Class = new ArrayList<String>(); 
		Class.add("Wizard");
	    Class.add("Knight");
	    Class.add("Archer");
	    
	    System.out.println("\n" +Class);
	    String cl = "\n";
	    while(!cl.equals("wizard")&& !cl.equals("knight") && !cl.equals("archer")) {
	    	System.out.println("Choose a Class: ");
	    	cl = (var.nextLine()).toLowerCase();
	    	
	    }
	    if (cl.equals("wizard")) {
	    	items.add("wand");
	    	System.out.println("\nYou have gained a wand!");
	    	} else if (cl.equals("knight")) {
	    		items.add("sword");
	    		System.out.println("\nYou have gained a sword!");
	    	} else {
	    		items.add("archer bow + 10 arrows");
	    		System.out.println("\nYou have gained a archer bow and 10 arrows!");
	    	}
		
		
			
		ArrayList<String> Race = new ArrayList<String>(); 
		Race.add("Elf");
	    Race.add("Human");
	    Race.add("Dwarf");

	    System.out.println("\n" + Race);
	 
	    String ra = "";
	    while(!ra.equals("elf")&& !ra.equals("human") && !ra.equals("dwarf")) {
	    	System.out.println("Choose a Race: ");
	    	ra = (var.nextLine()).toLowerCase();
	    	
	    }
	    if (ra.equals("elf")) {
	    	health = 25;
	    	System.out.println("\nYou gained + 5 life!");
	    	} else if (ra.equals("human")) {
	    		xp = 5;
	    		System.out.println("\nYou gained + 5 experience!");
	    	} else {
	    		gold = 10;
	    		System.out.println("\nYou have gained + 10 gold!");
	    	}
		
		
		
		ArrayList<String> Pronouns = new ArrayList<String>(); 
		Pronouns.add("She");
	    Pronouns.add("He");
	    Pronouns.add("They");
	 
	    System.out.println("\n" +Pronouns);
	    String pro = "";
	    while(!pro.equals("she")&& !pro.equals("he") && !pro.equals("they")) {
	    	System.out.println("Choose your pronoun: ");
	    	pro = (var.nextLine()).toLowerCase();
	    	
	    }
		
	    // printing out what they chose from both array and variables
		System.out.println("\nHello "+st);
		TimeUnit.SECONDS.sleep(1);
		System.out.println("\nYour health is at: " + health);
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\nYour experience is at: " + xp);
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\nYou're at " + gold + " gold so far!");
		TimeUnit.SECONDS.sleep(2);
		
	    System.out.println("\nYour class is: "+ cl);
		TimeUnit.SECONDS.sleep(2);
	    // hey you got certain amount of life, gold, or exp based on ur class
	    System.out.println("\nYour race is: "+ ra);
		TimeUnit.SECONDS.sleep(2);
	    // hey you got certain item based on ur race
	    System.out.println("\nInside your inventory is " +items);
		TimeUnit.SECONDS.sleep(2);
	    System.out.println("\nYour pronoun is: "+ pro);
		TimeUnit.SECONDS.sleep(2);


	
	}

}
