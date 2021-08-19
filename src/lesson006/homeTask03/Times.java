package lesson006.homeTask03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Times {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println("Сегодня: " + calendar.get(Calendar.DAY_OF_MONTH) + " число, " + calendar.get(Calendar.MONTH)+ " месяц, " + calendar.get(Calendar.YEAR) + " год");

        DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm:ss", Locale.ENGLISH);
        Date date = calendar.getTime();
        System.out.println(dateFormat.format(date));

        String birthday = "05 08 1992 14:15:10:000";
        String nextBirthday = "05 08 2021 14:15:10:000";

        DateTimeFormatter dtFormater = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm:ss");

        LocalDate startDate = LocalDate.parse(birthday, dtFormater);
        LocalDate endDate = LocalDate.parse(dateFormat.format(date), dtFormater);
        Period period = Period.between(startDate, endDate);
        System.out.println("Вам исполнилось " + period.getYears() + " лет, " + period.getMonths() + " месяцев, " +
                period.getDays() + " дней, ");


//        Duration duration = Duration.between(startDate, endDate);
//
//        System.out.println(duration.toDays() + "days");


        // попытка арифметическая
//        Date dateOfBirth = null;
//        Date dateMyNextBirthday = null;
//        try{
//            dateOfBirth = dateFormat.parse(birthday);
//            dateMyNextBirthday = dateFormat.parse(nextBirthday);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        long secLived = (date.getTime() - dateOfBirth.getTime())/(1000);
//        System.out.println(secLived);
////
//        long millis = ((dateMyNextBirthday.getTime() - date.getTime()))/(1000);
//        long diffYears = period.getYears();
//        long diffMonth = period.getMonths();
//        long diffDays = period.getDays();
//
//        long diffHours = (millis % period.getDays()) / (60 * 60);
//        long diffMinutes = (millis % period.getDays()) / (60);
//        long diffSeconds = millis / 1000 % 60;
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(diffYears + " лет, ");
//        sb.append(diffMonth + " месяцев, ");
//        sb.append(diffDays + " дней, ");
//        sb.append(diffHours + " часов, ");
//        sb.append(diffMinutes + " минут, ");
//        sb.append(diffSeconds + " секунд, ");
//
//        System.out.println("Вы прожили: " + sb.toString());
//
//
//        int daysBeforeBirthday = (int)((dateMyNextBirthday.getTime() - date.getTime()) / (24 * 60 * 60 * 1000)) ;
//        System.out.println("До дня рождения осталось: " + daysBeforeBirthday + " дней");
        }
}

//Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
//С помощью этого методы выведите в консоль, сколько времени прошло с вашего дня рождения в удобном
//для восприятия виде, например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд».