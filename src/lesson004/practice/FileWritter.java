package lesson004.practice;

import java.io.*;

public class FileWritter {
    public static void main(String[] args) {
        String fileName = "fileFromFileWritter.txt";
        String[] array = {"one", "two", "three", "four"};

        try (BufferedReader reader = new BufferedReader((new FileReader(fileName)))){
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(fileName))) {
                for (String value : array) {
                    writter.write(value + "\n");
                }
            } catch (IOException e) {
                System.out.println("FirstCatch");
                e.printStackTrace();
            }

            String line;
            while ((line = reader.readLine()) != null ) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("SecondCatch");
            e.printStackTrace();
        }
    }
}
