package adventureGame;

import java.util.concurrent.TimeUnit;

public class die {

	public static void main(String[] args) throws Exception{
		
		int die = (int) (Math.random() * 3 + 1);
        if (die == 1) {
            System.out.println("\nYou are being transported by the myst off to....");
            TimeUnit.SECONDS.sleep(2);
            World_One.main();
        } else if (die == 2) {
            //Make a function that would say " you are being transported by the myst off to..." and then also print out all of the character stats (xp, gold, health etc)
            System.out.println("\nYou are being transported by the myst off to....");
            TimeUnit.SECONDS.sleep(2);
            World_Two.main();
        } else if (die == 3) {
            System.out.println("\nYou are being transported by the myst off to....");
            TimeUnit.SECONDS.sleep(2);
            World_Three.main();
        } 
	}
}


