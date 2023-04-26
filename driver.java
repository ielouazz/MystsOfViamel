package adventureGame;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class driver {

    public static void tutorialRoom(Role role) throws Exception {
        //tutorialRoom goes here
//        Scanner var_answer = new Scanner(System.in);
//        String answer = var_answer.next();
        System.out.println("\n> Enter the Draft" + " Room...\n ");

        System.out.println("\n> With a tail but not a mouse");

        TimeUnit.SECONDS.sleep(3);

        System.out.println("\n> With the wings but not a bird");

        TimeUnit.SECONDS.sleep(3);
        System.out.println("\n> From every myth and with the horns");

        TimeUnit.SECONDS.sleep(3);
        System.out.println("\n> Born from fire wake with wrath");

        TimeUnit.SECONDS.sleep(3);

        System.out.println("\n> What am I?");

        TimeUnit.SECONDS.sleep(3);

        System.out.println("\n> Enter your answer: ");

        String answer = new Scanner(System.in).nextLine();
        if ("dragon".equals(answer.toLowerCase())) {
            System.out.println("\n> You are right!");
            TimeUnit.SECONDS.sleep(1);
            role.setGold(role.getGold() + 5);
            System.out.println("\n> You got 5 gold!");
            TimeUnit.SECONDS.sleep(1);
        } else {
            System.out.println("\n> You are wrong!");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\n> I am a dragon!");
            role.setHealth(role.getHealth() - 5);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\n> You lost 5 health!");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("\n> Moving on to the next stage...");
        FileUtils.write(role.getName() + ".txt", role.toString());
        System.out.println("\n> Do you want to continue on with the game?(yes/no)");
        Scanner scanner = new Scanner(System.in);
        String meep = scanner.nextLine();
        if (meep.equals("no")) {
            System.out.print("Loading...");
            System.out.println("Game over");
            System.exit(0);
        }
        escapeRoom(role);
    }

    public static void main(String[] args) throws Exception {
    	MusicUtils.PlayMusic("src/adventureGame/LordOfTheRings.wav");
        Role main = intro.main();
        tutorialRoom(main);
/*        TimeUnit.SECONDS.sleep(2);
        int die = (int) (Math.random() * 3 + 1);
        if (die == 1) {
            System.out.println("\nYou are being transported by the myst off to....");
            TimeUnit.SECONDS.sleep(2);
//            World_One.main();
        } else if (die == 2) {
            //Make a function that would say " you are being transported by the myst off to..." and then also print out all of the character stats (xp, gold, health etc)
            System.out.println("\nYou are being transported by the myst off to....");
            TimeUnit.SECONDS.sleep(2);
            World_Two.main();
        } else if (die == 3) {
            System.out.println("\nYou are being transported by the myst off to....");
            TimeUnit.SECONDS.sleep(2);
//            World_Three.main();
        } else {
            exitGame(null);
        }*/
    }

    // Exit Game
    public static void exitGame(Role role) {
        try {
            FileUtils.write(role.getName() + ".txt", role.toString());
            System.out.println("Do you want to continue on with the game?(yes/no)");
            Scanner scanner = new Scanner(System.in);
            String meep = scanner.nextLine();
            if (meep.equals("no")) {
                System.out.print("Loading...");
                System.out.println("Game over");
                System.exit(0);
            }
            ChooseRoom(role);
        } catch (Exception e) {
            System.exit(0);
        }
    }

    public static void ChooseRoom(Role role) throws Exception {
        System.out.println("Choose a room to enter");
        System.out.println("1. Draft Room");
        System.out.println("2. Escape Room");
        System.out.println("3. Fighting game");
        System.out.println("4. Exit Game");
        Scanner scanner = new Scanner(System.in);
        String meep = scanner.nextLine();
        if (meep.equals("1")) {
            tutorialRoom(role);
        } else if (meep.equals("2")) {
            escapeRoom(role);
        } else if (meep.equals("3")) {
            game.startGame(role);
        }else if (meep.equals("4")) {
            System.out.print("Loading...");
            System.out.println("Game over");
            System.exit(0);
        } else {
            System.out.println("Invalid input");
            ChooseRoom(role);
        }
    }

    // new class
//    Escape Room
    public static void escapeRoom(Role role) throws Exception {
        /*Now it looks like an empty cave with no monster here. (Type Enter)

        The gate shuts down the second you walk in. Something shinny buried in the mound. (Hint: where do you want to check )

        Type: check mound [to proceed. Else: OK]

        There is the key! Staring at the gate, what do you want to do next? (Hint: escape)

        Type: Open the gate [to proceed Else: OK]*/
//        System.out.println("Now it looks like an empty cave with no monster here. (Type Enter)");

//        TimeUnit.SECONDS.sleep(1);
        System.out.println("\n> Now it looks like an empty cave with no monster here. [Hint: Type \"Enter\"]");
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
        boolean flag = true;
        while (flag) {
            if ("enter".equalsIgnoreCase(enter)) {
                flag = false;
            } else {
                System.out.println("\n> OK");
                System.out.println("\n> Now it looks like an empty cave with no monster here. [Hint: Type \"Enter\"]");
                enter = scanner.nextLine();
            }
        }

        System.out.println("\n> The gate shuts down the second you walk in. Something shinny buried in the mound.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\n> (Hint: where do you want to check )");
        String mound = scanner.nextLine();
        flag = true;
        while (flag) {
            if ("check mound".equalsIgnoreCase(mound) || "mound".equalsIgnoreCase(mound)) {
                flag = false;
            } else {
                System.out.println("\n> OK");
                System.out.println("\n> (Hint: where do you want to check )");
                mound = scanner.nextLine();
            }
        }

        System.out.println("\n> There is the key! Staring at the gate, what do you want to do next?");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\n> (Hint: escape)");
        String escape = scanner.nextLine();
        flag = true;
        while (flag) {
            if ("open the gate".equalsIgnoreCase(escape) || escape.contains("open the gate")) {
                flag = false;
                System.out.println("\n> You escaped the room!");
                role.setGold(role.getGold() + 5);
                System.out.println("\n> You got 5 gold!");
                TimeUnit.SECONDS.sleep(1);
            }else {
                System.out.println("\n> OK");
                System.out.println("\n> (Hint: escape)");
                escape = scanner.nextLine();
            }
        }
        System.out.println("\n> Moving on...");
        FileUtils.write(role.getName() + ".txt", role.toString());
        System.out.println("\n> Do you want to continue on with the game?(yes/no)");
        String meep = scanner.nextLine();
        if (meep.equals("no")) {
            System.out.print("\n> Loading...");
            System.out.println("\n> Game over");
            System.exit(0);
        }
        game.startGame(role);
    }


}
