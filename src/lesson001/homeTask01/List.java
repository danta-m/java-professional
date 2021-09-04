package lesson001.homeTask01;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<String> cosmeticsBrands = new ArrayList<>(10);

        cosmeticsBrands.add("Bourjois");
        cosmeticsBrands.add("Chanel");
        cosmeticsBrands.add("Christina");
        cosmeticsBrands.add("L`Oreal");
        cosmeticsBrands.add("Dior");
        cosmeticsBrands.add("NYX");
        cosmeticsBrands.add("David Mallett");
        cosmeticsBrands.add("Mixa");
        cosmeticsBrands.add("Lancome");
        cosmeticsBrands.add("Yves Saint Laurent");

        Iterator iterator = cosmeticsBrands.iterator();

        while (iterator.hasNext()) {
            String tmp = (String) iterator.next();
            System.out.println(tmp);
        }
    }
}