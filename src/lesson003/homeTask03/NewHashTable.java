package lesson003.homeTask03;

import java.util.HashMap;
import java.util.Map;


public class NewHashTable {
    public static void main(String[] args) {
        Map<String, String> newMap = create();

        for (Map.Entry entry : newMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
        System.out.println(newMap.size());
        System.out.println("--------");
        replace(newMap);
        delete(newMap);
    }

    public  static Map<String, String> create () {
        Map<String, String> newMap = new HashMap<>();

        newMap.put("cat", "Sonia");
        newMap.put("dog", "Nafania");
        newMap.put("pig", "Yasha");
        
        return newMap;
    }

    public static void replace (Map<String, String> newMap) {
        newMap.replace("cat", "Lapa");
        newMap.replace("pig", "Naf-naf");

        for (Map.Entry entry : newMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
        System.out.println(newMap.size());
    }

    public static void delete (Map<String, String> newMap) {
        newMap.remove("cat");

        for (Map.Entry entry : newMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
        System.out.println(newMap.size());

        newMap.clear();
        System.out.println(newMap.size());

    }
}
