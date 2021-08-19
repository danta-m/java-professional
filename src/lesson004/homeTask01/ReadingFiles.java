package lesson004.homeTask01;

import sun.security.pkcs11.Secmod;

import java.io.*;

public class ReadingFiles {
    public static void main(String[] args) {

            File file1 = new File("D:\\IT\\java-professional\\src\\lesson004\\firstFile.txt");
            File file2 = new File("D:\\IT\\java-professional\\src\\lesson004\\files\\files\\secondFile.txt");
            File file3 = new File("src\\lesson004\\files\\thirdFile.txt");
            File file4 = new File("fileFromFileWritter.txt");

            BufferedReader bf = null;
            BufferedReader bf1 = null;
            BufferedReader bf2 = null;
            BufferedReader bf3 = null;

        try {
                bf = new BufferedReader(new FileReader(file1)); // Как правильно выводить на экран несколько файлов? Каждый открывать и закрывать по отдельности?
                bf1 = new BufferedReader(new FileReader(file2));
                bf2 = new BufferedReader(new FileReader(file3));
                bf3 = new BufferedReader(new FileReader(file4));

                String temp;

                while ((temp = bf.readLine()) != null) {
                    System.out.println(temp);
                }
                bf.close();

                while ((temp = bf1.readLine()) != null) {
                    System.out.println(temp);
                }
                bf1.close();

                while ((temp = bf2.readLine()) != null) {
                    System.out.println(temp);
                }
                bf2.close();

                while ((temp = bf3.readLine()) != null) {
                    System.out.println(temp);
                }
                bf3.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}

