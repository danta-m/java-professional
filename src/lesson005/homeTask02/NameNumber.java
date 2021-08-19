package lesson005.homeTask02;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameNumber {
    public static void main(String[] args) {
//        String name = "Bogdana".toLowerCase(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя латинскими буквами: ");
        String name = scanner.nextLine().toLowerCase(Locale.ROOT);

        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(name);
        boolean match = matcher.matches();

        if (match) {
            char[] nameToArray = name.toCharArray();
            int sum = 0;

            for (int i = 0; i < nameToArray.length; i++) {
                sum += alphabet(nameToArray[i]);

            }
            while (sum >= 10) {
                sum = (sum / 10) + (sum % 10);
            }
            System.out.println("Число вашего имени : " + sum);
        } else {
            System.out.println("Введите имя в правильном формате");
        }
    }

    public static int alphabet(char nameChar) {
        int number = 0;
        String name = (String.valueOf(nameChar));

        switch (name) {
            case "a": {
                number = 1;
                break;
            }
            case "b": {
                number = 2;
                break;
            }
            case "c": {
                number = 3;
                break;
            }
            case "d": {
                number = 4;
                break;
            }
            case "e": {
                number = 5;
                break;
            }
            case "f": {
                number = 6;
                break;
            }
            case "g": {
                number = 7;
                break;
            }
            case "h": {
                number = 8;
                break;
            }
            case "i": {
                number = 9;
                break;
            }
            case "j": {
                number = 10;
                break;
            }
            case "k": {
                number = 11;
                break;
            }
            case "l": {
                number = 12;
                break;
            }
            case "m": {
                number = 13;
                break;
            }
            case "n": {
                number = 14;
                break;
            }
            case "o": {
                number = 15;
                break;
            }
            case "p": {
                number = 16;
                break;
            }
            case "q": {
                number = 17;
                break;
            }
            case "r": {
                number = 18;
                break;
            }
            case "s": {
                number = 19;
                break;
            }
            case "t": {
                number = 20;
                break;
            }
            case "u": {
                number = 21;
                break;
            }
            case "v": {
                number = 22;
                break;
            }
            case "w": {
                number = 23;
                break;
            }
            case "x": {
                number = 24;
                break;
            }
            case "y": {
                number = 25;
                break;
            }
            case "z": {
                number = 27;
                break;
            }
        }
        return number;
    }
}
