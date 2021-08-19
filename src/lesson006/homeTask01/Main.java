package lesson006.homeTask01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введит свой логин: ");
        Scanner scanner = new Scanner(System.in);

        String login = scanner.nextLine();
        System.out.println("Введит свой пароль: ");
        String password = scanner.nextLine();

        Verification verificationLogin = new Verification();
        Verification verificationPassword = new Verification();

        if (login == null || password == null) { //
            System.out.println("Введите логин и пароль");
        } else if (!verificationLogin.matchesLogin(login)) { //|| !matchersPassword
            System.out.println("Вы ввели неверно логин");
        } else if (!verificationPassword.matchesPassword(password)) {
            System.out.println("Вы ввели неверно пароль");
        } else {
            System.out.println("Добро пожаловать!");
        }

    }
}

class Verification {
    private final Pattern hasUpperCase = Pattern.compile("[A-Z]");
    private final Pattern hasLowerCase = Pattern.compile("[a-z]");
    private final Pattern hasNumber = Pattern.compile("[0-9]");
    private final Pattern hasChar = Pattern.compile("[^A-Za-z0-9]");
    private final Pattern hasLetter = Pattern.compile("[A-Za-z]");

    boolean matchesLogin(String login) {
        if (login.length() < 6) {
            System.out.println("Логин должен состоять из 6 и более символов");
            return false;
        } else if (!hasLetter.matcher(login).find()) {
            System.out.println("Логин должен иметь букву");
            return false;
        } else return true;
    }

    boolean matchesPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Пароль короткий");
            return false;
        } else if (!hasUpperCase.matcher(password).find()) {
            System.out.println("Пароль должен иметь большую букву");
            return false;
        } else if (!hasLowerCase.matcher(password).find()) {
            System.out.println("Пароль допжен иметь маленькую букву");
            return false;
        } else if (!hasChar.matcher(password).find()) {
            System.out.println("Пароль допжен иметь символ");
            return false;
        } else if (!hasNumber.matcher(password).find()) {
            System.out.println("Пароль допжен иметь число");
            return false;
        } else return true;
    }
}
