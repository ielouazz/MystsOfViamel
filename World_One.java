package adventureGame;

//import printLogo;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class World_One {
	

	public static void main (Role role) throws Exception {
		System.out.println("World 1");

		role.setLocation(role.getLocation() + "1");
	//get scanner for question/answer portions
	Scanner var = new Scanner(System.in);

	//printing setting stuff
	if (role.getRace().contains("human")) {
		System.out.println("       .-.\n"
		         + "      (o.o) ~\n"
		         + " O     |=| ~\n"
		         + "/|\\    /|\\/\n"
		         + "/\\     /\\\n");}
	else if (role.getRace().contains("elf")) {
		System.out.println("       .-.\n"
		         + "      (o.o) ~\n"
		         + "'O'    |=| ~\n"
		         + "/|\\    /|\\/\n"
		         + "/\\     /\\\n");}
	else {
		System.out.println("       .-.\n"
		         + "      (o.o) ~\n"
		         + "       |=| ~\n"
		         + "_o_    /|\\/\n"
		         + "/\\     /\\\n");
	}
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
    		+"It sounds like slithering… You hear the walls shifting and hissing beginning to occur.");
    if (role.getRace().contains("human")) {
    	System.out.println("      __\n"
                + " O   <_x\\    _______\n"
                + "/|\\    \\ \\__/ _____ \\____\n"
                + "/\\      \\____/     \\____/");}
	else if (role.getRace().contains("elf")) {
		System.out.println("      __\n"
	            + "'O'  <_x\\    _______\n"
	            + "/|\\    \\ \\__/ _____ \\____\n"
	            + "/\\      \\____/     \\____/");}
	else {
		System.out.println("      __\n"
	            + "     <_x\\    _______\n"
	            + "_o_    \\ \\__/ _____ \\____\n"
	            + "/\\      \\____/     \\____/");
	}
    System.out.println("A shredded skin of a giant serpent is blocking the path.");
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
    		+ "this is good that means there is a way out of here. \n");
    if (role.getRace().contains("human")) {
		System.out.println("             .-.\n"
		         + "            (o.o) \n"
		         + " O           |=| \n"
		         + "/|\\   |\\/|   /|\\   _\\\n"
		         + "/\\    \\||/   /\\   |_|\n");}
	else if (role.getRace().contains("elf")) {
		System.out.println("             .-.\n"
		         + "            (o.o) \n"
		         + "'O'          |=| \n"
		         + "/|\\   |\\/|   /|\\   _\\\n"
		         + "/\\    \\||/   /\\   |_|\n");}
	else {
		System.out.println("             .-.\n"
		         + "            (o.o) \n"
		         + "             |=| \n"
		         + "_o_   |\\/|   /|\\   _\\\n"
		         + "/\\    \\||/   /\\   |_|\n");
	}
    System.out.println("Further in you go and you see that there is a skeleton with a notebook in one hand and his other is around a chest. ");
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
    		+ "A giant serpent slithers out from the cave.\n");
    
    game_two.startGame(role);

    }
}
