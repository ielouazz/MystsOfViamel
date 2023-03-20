package adventureGame;

import java.io.*;


public class FileUtils {
    public static String read(String pathName)  throws IOException {
        String path = "src/user/" +  pathName;
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
        String path = "src/user/" +  pathName;
        File writeFile = null;
        try {
            writeFile = new File(path);
        } catch (Exception e) {
            System.out.println("文件路径异常");
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

}
