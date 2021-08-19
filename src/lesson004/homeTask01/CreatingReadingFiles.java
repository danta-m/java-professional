package lesson004.homeTask01;

import java.io.*;

public class CreatingReadingFiles {
    public static void main(String[] args) throws IOException {
        String filesName = "D:\\IT\\java-professional\\src\\lesson004\\files\\files\\creatingNewFile.txt";
        String[] filesValue = {"This file", "was creating", "by CretingReadingFile"};

        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            bw = new BufferedWriter(new FileWriter(filesName));

            for (String value : filesValue) {
                bw.write(value + " ");
            }
            bw.close();
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            bw.close();
        }

        try {
           br = new BufferedReader(new FileReader(filesName));

           String line;
           while ((line = br.readLine()) != null) {
               System.out.println(line);
           }
            br.close();

        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            br.close();
        }
    }
}
