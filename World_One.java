package adventureGame;

//import printLogo;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class World_One {

	public static Role loadRole() throws Exception{
        Scanner scanner = new Scanner(System.in);
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

	public static void main () throws Exception {
	Role role = loadRole();
	//get scanner for question/answer portions
	Scanner var = new Scanner(System.in);
	//printing setting stuff
	System.out.println("You enter a cave and notice that there are skeletons holding torches; the men that have already gone down this path that you’re on but did not make it through. \n"
			+"Going through the cave you notice it is getting darker…");
	//let player choose how to see in the dark
	String choice_one = ""; //variable for player's choice
	System.out.println("What would you like to do?: ");
    while (!choice_one.contains("torch") && !choice_one.contains("fire") && !choice_one.contains("spell") && !choice_one.contains("magic")) { //only answers that contain these words will break the loop
        System.out.println("Hint: you need to be able to see: ");
        choice_one = (var.nextLine()).toLowerCase();
        if (choice_one.contains("magic") || choice_one.contains("spell")) {//check if the player is trying to use magic
        	if(!role.getInventory().contains("wand")) {
        		System.out.println("You cannot cast magic without a wand");
        		choice_one = "";}
        	}
        }
    //more printing for exposition
    System.out.println("So with that, the cave gets much brighter and you continue to walk through with stealthiness and notice that there are noises being made. \n"
    		+"It sounds like slithering… You hear the walls shifting and hissing beginning to occur.\n"
    		+"A shredded skin of a giant serpent is blocking the path.");
    //let player choose how to get past the skin
    String choice_two = ""; //variable for player's choice
	System.out.println("What would you like to do?: ");
    while (!choice_two.contains("cut") && !choice_two.contains("burn")) { //only answers that contain these words will break the loop
        System.out.println("Hint: you need to get past the obstical: ");
        choice_two = (var.nextLine()).toLowerCase();
        if (choice_two.contains("cut")) {//check if the player is trying to cut it
        	if (!role.getInventory().contains("sword") || !role.getInventory().contains("arrow")) {
        		System.out.println("You have nothing to cut the skin with");
        		choice_two = "";}
        	}
        }
    System.out.println("You successfully get past the serpant skin.\n"
    		+ "When going farther into the cave you notice that your fire is about to be lit out.. \n"
    		+ "air is coming from somewhere.. \n"
    		+ "this is good that means there is a way out of here. \n"
    		+ "Further in you go and you see that there is a skeleton with a notebook in one hand and his other is around a chest. ");
	//let player choose what to look at
    String choice_three = ""; //variable for player's choice
	System.out.println("What would you like to do?: ");
    while (!choice_three.contains("book") && !choice_three.contains("chest")) { //only answers that contain these words will break the loop
        System.out.println("Hint: which item would you like to get?: ");
        choice_three = (var.nextLine()).toLowerCase();
        }
    //if/else depending on if they look at the book or the chest
    if (choice_three.contains("book")){
    	System.out.println("You pick up the notebook and observe the dusty cover.\n"
    			+ "NOTEBOOK has been added to your inventory");
    	/*add the notebook to the inventory*/}
    else {
    	System.out.println("You open the chest and find a dagger with an inscription on the side.\n"
    			+ "You don't recognize the language."
    			+ "INSCRIPTED DAGGER has been added to your inventory");
    	/*add the special dagger to the inventory*/}
    //explanation before combat starts
    System.out.println("Suddenly you hear a hissing noise getting louder and louder.\n"
    		+ "A giant serpent slithers out from the cave.\n"
    		+ "COMBAT");
    }
}
