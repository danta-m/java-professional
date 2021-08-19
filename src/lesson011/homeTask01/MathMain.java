package lesson011.homeTask01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MathMain {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(10) + 1);
        }

        System.out.println(numbers);

//        int sum = numbers.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
//        System.out.println(sum);


        numbers.stream()
                .map(i -> i * i)
                .forEach(numbers1 -> System.out.print(numbers1 + " "));
//                .reduce((x,y) -> x + y).get();

        System.out.println("\n-----");
        System.out.println(numbers.stream().map(i -> i * i).reduce((x, y) -> x + y).get()); // чтобы reduce()
        // сработал на числа в степени, нужно снова map() применять? Возможно ли как-то использовать map()  метода выше?

    }
}
