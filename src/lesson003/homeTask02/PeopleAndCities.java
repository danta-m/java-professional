package lesson003.homeTask02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PeopleAndCities {
    public static void main(String[] args) throws Exception {
        Map<String, String> newMap = new HashMap<>();

        fillMap(newMap);

        for (Map.Entry entry : newMap.entrySet()) {
            System.out.println("City: " + entry.getKey() + " Surname: "
                    + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        String value = scanner.nextLine();


        if (newMap.containsKey(value)) {
            System.out.println(newMap.get(value));
        } else if (newMap.containsValue(value)) {
            for (Map.Entry<String, String> entry : newMap.entrySet()) {
                if (entry.getValue().equals(value)) {
                    System.out.println(entry.getKey());
                }
            }
        } else
            System.out.println("wrong value");
    }

    public  static Map<String, String> fillMap (Map<String, String> newMap) {
        newMap.put("Dnipro", "Lavrov");
        newMap.put("Sumy", "Diadenko");
        newMap.put( "Kharkiv", "Fomenko");
        newMap.put("Kiev", "Tovkus");
        newMap.put("Lviv", "Mirosh");
        newMap.put( "Odesa", "Shkarban");

        return  newMap;
    }

}


