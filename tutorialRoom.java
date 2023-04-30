package adventureGame;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class tutorialRoom {
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
				//TUTORIAL ROOM//
	public static void tutorialRoom(Role role) throws Exception {
        //tutorialRoom goes here
//        Scanner var_answer = new Scanner(System.in);
//        String answer = var_answer.next();
        System.out.println("Enter the Tutorial" + " Room!\n ");

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

        String answer = new Scanner(System.in).nextLine();
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
        FileUtils.write(role.getName() + ".txt", role.toString());
        System.out.println("Do you want to continue on with the game?(yes/no)");
        Scanner scanner = new Scanner(System.in);
        String meep = scanner.nextLine();
        if (meep.equals("no")) {
            System.out.print("Loading...");
            System.out.println("Game over");
            System.exit(0);
        }
        escapeRoom(role);
    }
	
							//ESCAPE ROOM//
	public static void escapeRoom(Role role) throws Exception {
        /*Now it looks like an empty cave with no monster here. (Type Enter)
        The gate shuts down the second you walk in. Something shinny buried in the mound. (Hint: where do you want to check )
        Type: check mound [to proceed. Else: OK]
        There is the key! Staring at the gate, what do you want to do next? (Hint: escape)
        Type: Open the gate [to proceed Else: OK]*/
//        System.out.println("Now it looks like an empty cave with no monster here. (Type Enter)");

//        TimeUnit.SECONDS.sleep(1);
        System.out.println("Now it looks like an empty cave with no monster here. [Hint: Type \"Enter\"]");
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
        boolean flag = true;
        while (flag) {
            if ("enter".equalsIgnoreCase(enter)) {
                flag = false;
            } else {
                System.out.println("OK");
                System.out.println("Now it looks like an empty cave with no monster here. [Hint: Type \"Enter\"]");
                enter = scanner.nextLine();
            }
        }

        System.out.println("The gate shuts down the second you walk in. Something shinny buried in the mound.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("(Hint: where do you want to check )");
        String mound = scanner.nextLine();
        flag = true;
        while (flag) {
            if ("check mound".equalsIgnoreCase(mound) || "mound".equalsIgnoreCase(mound)) {
                flag = false;
            } else {
                System.out.println("OK");
                System.out.println("(Hint: where do you want to check )");
                mound = scanner.nextLine();
            }
        }

        System.out.println("There is the key! Staring at the gate, what do you want to do next?");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("(Hint: escape)");
        String escape = scanner.nextLine();
        flag = true;
        while (flag) {
            if ("open".equals(escape) || escape.contains("open the gate")) {
                flag = false;
                System.out.println("You escaped the room!");
                role.setGold(role.getGold() + 5);
                System.out.println("You got 5 gold!");
                TimeUnit.SECONDS.sleep(1);
            }else {
                System.out.println("OK");
                System.out.println("(Hint: escape)");
                escape = scanner.nextLine();
            }
        }
        System.out.println("leave the room");
        FileUtils.write(role.getName() + ".txt", role.toString());
        System.out.println("Do you want to continue on with the game?(yes/no)");
        String meep = scanner.nextLine();
        if (meep.equals("no")) {
            System.out.print("Loading...");
            System.out.println("Game over");
            System.exit(0);
        }
        game.startGame(role);
    }

					//MAIN//
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
