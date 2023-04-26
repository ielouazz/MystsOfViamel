package adventureGame;


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class MusicUtils {

    private static Clip clip = null;

    public static void PlayMusic(String location) {
        if (clip != null) {
            clip.close();
        }

        try {
            if (clip == null){
                clip = AudioSystem.getClip();
            }
            File musicPath = new File(location);
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);

                clip.open(audioInput); // pressing the play button on your CD Player
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            else {
                System.out.println("can't find file!");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
