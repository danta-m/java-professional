package lesson004.practice;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file1 = new File("D:\\IT\\java-professional\\src\\lesson004\\firstFile.txt");
        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader(file1));

            String temp;

            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }

            br.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } finally {
            br.close();
        }
    }
}

