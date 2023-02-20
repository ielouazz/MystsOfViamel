package adventureGame;
import java.util.Scanner;
//import java.util.*;
import java.util.concurrent.TimeUnit;

public class basicRoom {
	public static void tutorialRoom() throws Exception{
		System.out.println("Your are thrown into a tutorial room with a monster that has 10 health."); // i would change this to say hello (name) you are in a tutorial room and I will help you learn how to use your weapons
		System.out.println("MONSTER 1: YOU CANNOT DEFEAT ME!"); // figure out how to get name from intro file into this file
		int monHealth = 10;
		Scanner answer = new Scanner(System.in);
		System.out.println("What item in your kit would you like to use?"); 
		//would like to print out the choices like we did in the intro file over here so they know what they have to choose from
		String choice = answer.nextLine();
		System.out.println("You have chosen " + choice);
		
		
	}
	public static void room1() throws Exception{
		System.out.println("\nRoom #1");
		// kill a monster A
	}
	public static void room2() throws Exception{
		System.out.println("\nRoom #2");
		// console a child
	}
	public static void room3() throws Exception{
		System.out.println("\nRoom #3");
		// solve a riddle
	}
	public static void room4() throws Exception{
		System.out.println("\nRoom #4");
		// buy supplies
	}
	public static void room5() throws Exception{
		System.out.println("\nRoom #5");
		//kill monster B
	}
	public static void room6() throws Exception{
		System.out.println("\nRoom #6");
		// kill monster C
	}
	public static void finalBoss() throws Exception{
		System.out.println("\nRoom #6");
		// kill finalBoss
		// creating 3 and randomize 2 out of the 3
	}

	public static void main(String[] args) throws Exception{
		int die = (int)(Math.random()*6+1);
		tutorialRoom();
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\nYou are being transported by the myst off to....");
		TimeUnit.SECONDS.sleep(2);
		if (die == 1) {
			room1();
		} else if (die == 2){
			room2();
		} else if (die == 3) {
			room3();
		} else if(die == 4) {
			room4();
		} else if (die == 5) {
			room5();
		} else {
			room6();
		}
	}

}
