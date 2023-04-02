package adventureGame;
import java.util.concurrent.TimeUnit;


public class driver {
		public static void tutorialRoom() throws Exception{
			//tutorialRoom goes here
		}
		public static void main(String[] args) throws Exception{
			int die = (int)(Math.random()*3+1);
			tutorialRoom();
			TimeUnit.SECONDS.sleep(2);
			System.out.println("\nYou are being transported by the myst off to....");
			TimeUnit.SECONDS.sleep(2);
			if (die == 1) {
				World_One.main();
				} else if (die == 2){
					World_Two.main();
				}else if (die ==3) {
					World_Three.main();
				} else {
				intro.exitGame(null);
		}
		}

	}
