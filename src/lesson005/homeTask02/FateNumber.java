package lesson005.homeTask02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FateNumber {
    public static void main(String[] args) {

        System.out.println("Введите дату своего рождения в формате dd.MM.yyyy : ");

        Scanner scanner = new Scanner(System.in);
        String birthday2 = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(?:(?:31(\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|" +
                "1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|" +
                "[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\.)" +
                "(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
        Matcher matcher = pattern.matcher(birthday2);
        boolean matchers = matcher.matches();
        int birthdayDate = 0;

        if (matchers) {
            String tempBirthday = birthday2.replace(".", "");
            birthdayDate = Integer.valueOf(tempBirthday);
        } else {
            System.out.println("Неизвестные данные");
        }

        while (birthdayDate >= 10) {
            birthdayDate = (birthdayDate / 10) + (birthdayDate % 10);
        }
        System.out.println("Число судьбы равно : " + birthdayDate);
    }
}