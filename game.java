package adventureGame;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void startGame(Role role) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //enemies
        String[] enemies = {"Dragon", "Devil"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        //player
        int health = role.getHealth(); // health char starts with
        // advice ： Randomly generate attack power values
        int attackDamage = 50;
        // If you add attack power attributes to the character later on
        // int attackDamage = role.getAttackPower();
        int numHealthPotions = 3; // character starts out with
        int healthPotionHealAmount = 30; // health potion heals for 30
        int healthPotionDropChance = 50; // percentage chance of enemy to drop health potion


        boolean running = true;

        System.out.println("\nWelcome to the dungeon");

        GAME: // labeled the while loop
        while(running) {
            System.out.println("\nLOADING...");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println( enemy + " appeared! \n");

            while(enemyHealth > 0) {
                System.out.println("Your HP: " + health);
                System.out.println( enemy + "'s HP: "+ enemyHealth);
                System.out.println("\nWhat would you like to do?");
                System.out.println("1. Attack");
                System.out.println("2. Restore Health");
                System.out.println("3. Run!");
                System.out.println("4. Exit game NOW!\n");

                String input = in.nextLine();
                if (input.equals("1")) {
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("> You strike the " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("> You receive " + damageTaken + " in retaliation!!");

                    if (health <1) {
                        System.out.println("> You have taken too much damage, you are too weak to go on!");
                        break;
                    }
                }
                else if(input.equals("2")) {
                    if(numHealthPotions > 0) {
                        health += healthPotionHealAmount;
                        numHealthPotions --;
                        System.out.println("> You drink a health potion, healing yourself for " + healthPotionHealAmount + "."
                                + "\n> You now have " +  health + " HP."
                                +"\n> You have " + numHealthPotions + " health potions left.\n.");
                    }
                    else {
                        System.out.println("> You have no health potions left. Defeat enemy for a chance to get one");

                    }
                }
                else if(input.equals("3")) {
                    System.out.println("> You run away from " + enemy + "!");
                    running = false;
                    break GAME;
                }
                else if(input.equals("4")) {
                    System.out.println("> You leave the current game!");
                    break GAME;
                }
                else {
                    System.out.println("> Invalid Command. Try agin!!");

                }
            }
            if(health < 1) {
                System.out.println("You limp out of the dungeon, too weak to continue the battle.");
                break;
            }
            System.out.println("\n--------------------------------------\n");
            System.out.println( "##  " + enemy + "was defeated  ##");
            System.out.println("##  You have "  + health + " HP left.  ##");
            if(rand.nextInt(100) < healthPotionDropChance) {
                numHealthPotions++;
                System.out.println("##  The " + enemy + " dropped a health potion!  ##");
                System.out.println("##  You now have " + numHealthPotions + "health potions.  ##");
            }
            System.out.println("\n--------------------------------------\n");
            System.out.println("What would you like to do?\n");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit dungeon");

            String input = in.nextLine();


            while(!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command! Try Again!");
                input = in.nextLine();
            }
            if(input.equals("1")) {
                System.out.println("\nYou continue on your adventure.\n");
            }
            else if(input.equals("2")){
                System.out.println("\nYou exit the dungeon successful from your adventures");
                break;

            }
        }
        System.out.println("###############################");
        System.out.println("You are done with tutorial room! Great job!");
        System.out.println("###############################");
        role.setHealth(health);
        driver.exitGame(role);
    }
}
