package adventureGame;

import java.io.*;


public class FileUtils {
	//This is fixed way of reading file 
    public static String read(String pathName)  throws IOException {
        String path = "src/user/" +  pathName;
    	//Only difference is different path of reading files
        File readFile = null;
        StringBuilder stringBuilder = null;
        readFile = new File(path);
        stringBuilder = new StringBuilder();
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(readFile));
        String tempString = null;
        int line = 1;
        while ((tempString = reader.readLine()) != null) {
            stringBuilder.append(tempString);
            line++;
        }
        reader.close();
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
            }
        }
        return stringBuilder.toString();
    }


    public static void write(String pathName, String text) {
    	//This is fixed way of writing on files
        String path = "src/user/" +  pathName;
      //Only difference is different path of writing files
        File writeFile = null;
        try {
            writeFile = new File(path);
        } catch (Exception e) {
            System.out.println("File Path Error!!");
        }
        OutputStream writer = null;
        try {
            writer = new FileOutputStream(writeFile);
            writer.write(text.getBytes());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public static boolean checkFile(String pathName) {
        String path = "src/user/" +  pathName;
        File file = new File(path);
        return file.exists();
    }
}
