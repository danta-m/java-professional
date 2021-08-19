package lesson005.practice;

import java.util.Arrays;
import java.util.Comparator;

public class practice01 {
    public static void main(String[] args) {
        String str = "Кроме метода equals, который выполняет детальное сравнение всех полей обоих объектов, " +
                "есть еще один метод, который может использоваться для неточного, но очень быстрого сравнения — hashCode()."
                + "Представьте, что вы сортируете в алфавитном порядке список из тысяч слов, и вам нужно постоянно попарно сравнивать слова. " +
                "А слова длинные, и букв в них много. В общем, такое сравнение будет идти очень долго.";
        String[] sentences = str.split("\\.");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }

        System.out.println("--------");

        Arrays.sort(sentences, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.split("\\s").length - o2.split("\\s").length;
            }
        });

        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }
}

