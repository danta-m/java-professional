package lesson005.homeTask01;

public class Task01 {
    public static void main(String[] args) {
        

    String text = "Один доллар восемьдесят семь центов. " +
            "Это было все. Из них шестьдесят центов монетками по одному центу. " +
            "За каждую из этих монеток пришлось торговаться с бакалейщиком, зеленщиком, " +
            "мясником так, что даже уши горели от безмолвного неодобрения, которое вызывала подобная бережливость. ";

    String[] sentences = text.split("\\.");

        for (int i = 0; i < sentences.length-1; i++) {
            int firstSpaceIndex = sentences[i].indexOf(" ", 1);
            int lastSpaceIndex = sentences[i].lastIndexOf(" ");

            String firstWord = sentences[i].substring(0, firstSpaceIndex).trim();
            String lastWord = sentences[i].substring(lastSpaceIndex).trim();

            sentences[i] = sentences[i].substring(firstSpaceIndex,lastSpaceIndex).trim();
            sentences[i] = lastWord + " " + sentences[i] + " " + firstWord;
            System.out.println(sentences[i]);

        }
    }
}
