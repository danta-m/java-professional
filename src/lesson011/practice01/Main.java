package lesson011.practice01;


public class Main {

    public static void main(String[] args) {


        Сalculator add = (a, b) -> a + b;
        Сalculator sub = (a, b) -> a - b;
        Сalculator multiple = (a, b) -> a * b;
        Сalculator div =(a, b) -> {
            if (b != 0) {
                return a / b;
            } else { return  - 1;}
        };

        int addResult = add.calculate(10, 5);
        int subResult = sub.calculate(10, 5);
        int multipleResult = multiple.calculate(10, 5);
        int divResult = div.calculate(10, 5);

        System.out.println("a + b = " + addResult);
        System.out.println("a - b = " + subResult);
        System.out.println("a * b = " + multipleResult);
        System.out.println("a / b = " + divResult);


    }
}
