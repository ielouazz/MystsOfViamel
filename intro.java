package adventureGame;
// TIME TO IMPORT EVERYTHING WOO //

//import draft.java;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;


public class intro { // INTRO CLASS THAT BASICALLY SPITS OUT INTRO AT YOU.
    //printing out logo
    public static void logo() throws Exception {
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
        //basicRoom.tutorialRoom();
    }

    public static void main(String[] args) throws Exception {
        //setting variables of experience, money, and health as well as name
        //////////////////////////////////////////////////////////
        System.out.println("Welcome to the game!");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Loading...");
        // Start a new game or Continue
        TimeUnit.SECONDS.sleep(1);

        Scanner var = new Scanner(System.in);
        String choice = "";
        while (!choice.equals("1") && !choice.equals("2")) {
        	System.out.println("1. New Game");
            System.out.println("2. Continue");
            System.out.println("Select number 1 or 2");
            choice = var.nextLine();
            if (choice.equals("1")) {
            	System.out.println("Starting new game...");
                TimeUnit.SECONDS.sleep(1);
                newGame();
                } else if (choice.equals("2")) {
                	System.out.println("Loading...");
                	TimeUnit.SECONDS.sleep(1);
                   // loadGame();
                	System.out.println("Enter your name : ");

               try {
                   Role role = loadRole();
                   //Synthesize the file path according to the input name
                    //Read the corresponding file
                    //Function below
                   //draft.draftRoom();
                   driver.exitGame(role);
                   // Exiting game to save the data to text file with FileUtils 
                    // Function listed below
               } catch (Exception e) {
                   System.out.println("User name does not exist.");
                   System.out.println("Starting new game...");
               }

           } else {
               System.out.println("Invalid input");
               System.out.println("Make the right choice");
           }

       }


    }


    /**
     * Load game
     */
    public static Role loadRole() throws Exception{
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        String read = FileUtils.read(st + ".txt");
        String[] split = read.split("\\|");
        Role role = new Role(split[0], split[1], split[2], split[3], split[4], split[5], split[6], Integer.parseInt(split[7]), Integer.parseInt(split[8]), Integer.parseInt(split[9]));
        System.out.println("Welcome back " + role.getName() + "!");
        System.out.println("health: " + role.getHealth());
        System.out.println("gold: " + role.getGold());
        System.out.println("xp: " + role.getXp());
        return role;
    }

    // New Game
    public static void newGame() {
    	//PLAYER SPRITES
    	// String X_lined prints all the sprites of that category next to each other
    	// List<String> X is an array of the sprites so that they can be printed individually
    	String race_lined = " O    'O'\n/|\\   /|\\   _o_\n/\\    /\\    /\\";
        List<String> hu = Collections.unmodifiableList(
           Arrays.asList(" O  *\n/|\\/\n/\\"," O |\n/|\\T\n/\\"," O |\\\n/|\\|/\n/\\"));
        String hu_lined = " O *   O |   O |\\\n/|\\/  /|\\T  /|\\|/\n/\\    /\\    /\\";
        List<String> elf = Collections.unmodifiableList(
           Arrays.asList(" 'O' *\n /|\\/\n /\\"," 'O'|\n /|\\T\n /\\"," 'O'|\\\n /|\\|/\n /\\"));
        String elf_lined = " 'O' *   'O'|     'O'|\\\n /|\\/    /|\\T     /|\\|/\n /\\      /\\       /\\";
        List<String> dwa = Collections.unmodifiableList(
           Arrays.asList("    *\n_o_/\n/\\","   |\n_o_T\n/\\","_o_|\\\n/\\ |/"));
        String dwa_lined = "    *      |\n_o_/    _o_T    _o_|\\\n/\\      /\\      /\\ |/";
        try {
            logo();
            //print logo

            System.out.println("Enter your name : ");
            Scanner var = new Scanner(System.in);
            String st = var.nextLine();
            Role role = createNewUser(st);
            //int life = 0;
            String items = "";

            ArrayList<String> Race = new ArrayList<String>();
            Race.add("Human");
            Race.add("Elf");
            Race.add("Dwarf");

            System.out.println(race_lined);
            System.out.println("\n" + Race);

            String ra = "";
            
            while (!ra.equals("elf") && !ra.equals("human") && !ra.equals("dwarf")) {
                System.out.println("Choose a Race: ");
                ra = (var.nextLine()).toLowerCase();

            }
            if (ra.equals("elf")) {
                role.setHealth(25);
                role.setRace("elf");
                System.out.println("\nYou gained + 5 life!");
            } else if (ra.equals("human")) {
                role.setXp(5);
                role.setRace("human");
                System.out.println("\nYou gained + 5 experience!");
            } else {
                role.setGold(10);
                role.setRace("dwarf");
                System.out.println("\nYou have gained + 10 gold!");
            }
            
            ArrayList<String> Class = new ArrayList<String>();
            Class.add("Wizard");
            Class.add("Knight");
            Class.add("Archer");
            
            //Prints correct array of classes based on the chosen race
            if (ra.equals("elf")){
            	System.out.println(elf_lined);}
            else if (ra.equals("human")){
            	System.out.println(hu_lined);}
            else {
            	System.out.println(dwa_lined);}
            System.out.println("\n" + Class);
            String cl = "\n";
            while (!cl.equals("wizard") && !cl.equals("knight") && !cl.equals("archer")) {
                System.out.println("Choose a Class: ");
                cl = (var.nextLine()).toLowerCase();

            }
            if (cl.equals("wizard")) {
                items += "wand, ";
                role.setp_Class("wizard");
                System.out.println("\nYou have gained a wand!");
            } else if (cl.equals("knight")) {
            	items += "sword, ";
                role.setp_Class("knight");
                System.out.println("\nYou have gained a sword!");
            } else {
            	items += "archer bow, 10 arrows, ";
                role.setp_Class("archer");
                System.out.println("\nYou have gained a archer bow and 10 arrows!");
            }
            role.setInventory(items);
            
          //Sets the player's sprite to the correct race and class
            String player_sprite = "";
            if (ra.equals("human")){
                if (cl.equals("wizard")){
                   player_sprite = hu.get(0);}
                else if (cl.equals("knight")){
                   player_sprite = hu.get(1);}
                else{
                   player_sprite = hu.get(2);}}
             else if (ra.equals("elf")){
                if (cl.equals("wizard")){
                   player_sprite = elf.get(0);}
                else if (cl.equals("knight")){
                   player_sprite = elf.get(1);}
                else{
                   player_sprite = elf.get(2);}}
             else{
                if (cl.equals("wizard")){
                   player_sprite = dwa.get(0);}
                else if (cl.equals("knight")){
                   player_sprite = dwa.get(1);}
                else{
                   player_sprite = dwa.get(2);}}
            role.setSprite(player_sprite);




            ArrayList<String> Pronouns = new ArrayList<String>();
            Pronouns.add("She");
            Pronouns.add("He");
            Pronouns.add("They");

            System.out.println("\n" + Pronouns);
            String pro = "";
            while (!pro.equals("she") && !pro.equals("he") && !pro.equals("they")) {
                System.out.println("Choose your pronoun: ");
                pro = (var.nextLine()).toLowerCase();

            }
            role.setPronouns(pro);
            // printing out what they chose from both array and variables
            System.out.println("\nHello " + role.getName());
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\nThis is you:\n" + player_sprite);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\nYour health is at: " + role.getHealth());
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\nYour experience is at: " + role.getXp());
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\nYou're at " + role.getGold() + " gold so far!");
            TimeUnit.SECONDS.sleep(2);

            System.out.println("\nYour race is: " + ra);
            TimeUnit.SECONDS.sleep(2);
            // hey you got certain amount of life, gold, or exp based on ur class
            System.out.println("\nYour class is: " + cl);
            TimeUnit.SECONDS.sleep(2);
            // hey you got certain item based on ur race
            System.out.println("\nYour inventory: " + items);
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\nYour pronoun is: " + role.getPronouns());
            TimeUnit.SECONDS.sleep(2);
            driver.exitGame(role);
            //driver.tutorialRoom();
            //draft.draftRoom();
        } catch (Exception e) {
            System.out.println("Error" );
        }
        
    }

    // Create a new user
    public static Role createNewUser(String st) {
        Role role = new Role();
        role.setPronouns("they");
        role.setName(st);
        role.setRace("X");
        role.setp_Class("X");
        role.setSprite("X");
        role.setInventory("X");
        role.setLocation("tutorial, ");
        role.setGold(5);
        role.setHealth(20);
        role.setXp(0);
        FileUtils.write(st + ".txt", role.toString());
        return role;
        //draft.draftRoom();
    }
    
    /*private static void exitGame(Role role) {
        FileUtils.write(role.getName() + ".txt", role.toString());
        System.out.println("Game Over");
        System.exit(0);
        }*/

}
