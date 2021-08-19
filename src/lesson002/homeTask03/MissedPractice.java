package lesson002.homeTask03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MissedPractice {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите слова: ");
//
//        while (!bf.readLine().equals("end")) {
//            list.add(bf.readLine());
//        }


        // Подскажите, в чем проблема? Только 2 ячейки дает и все. size = 2.
        //Часто end вообще пропускает и дальше слова принимает

        while (true) {
            if (bf.readLine().equals("end")) {
                System.out.println("-------");
                break;
            } else
                list.add(bf.readLine());
        }


        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
