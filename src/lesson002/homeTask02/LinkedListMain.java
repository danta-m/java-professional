package lesson002.homeTask02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) throws Exception {
        List<Integer> list = getIntegerList();

        System.out.println("Вы ввели такие числа : " + list);
        System.out.println("Минимальное значение : " + getMinimum(list));
    }

    public static List<Integer> getIntegerList() throws Exception {
        List<Integer> list = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество чисел, которое вы хотите указать: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Введите " + n + " целых чисел: ");

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        return list;
    }


    public static int getMinimum(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer integer : list) {
            if (integer < min)
                min = integer;
        }
        return min;
    }
}
