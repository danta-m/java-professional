package lesson002.homeTask01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Введите 5 слов : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String tmp = reader.readLine();
            list.add(tmp);
        }

        System.out.println(list.size());
        System.out.println(list);

        ArrayList<String> result = doubleValues(list);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    private static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i = 0; i<list.size();i+=2){
            list.add(i,list.get(i));
        }
        return list;
    }
}
