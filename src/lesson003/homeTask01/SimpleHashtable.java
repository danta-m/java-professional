package lesson003.homeTask01;

import java.util.Hashtable;
import java.util.Scanner;

public class SimpleHashtable {
    public static void main(String[] args) {
        Hashtable<String, Integer> numbers = insert();

            System.out.println(numbers);
    }

    public  static Hashtable<String, Integer> insert () {
        Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значения: ");
        for (int i = 0; i < 3; i++) {
            numbers.put(scanner.nextLine(), i);
        }
        return numbers;
    }
}
