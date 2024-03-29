package lesson006.homeTask02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decryptor {
    public static void main(String[] args) {

        final Pattern hasPrepositions = Pattern.compile("\\b(в|без|до|для|за|через|над|по|из|у|около|под|" +
                "о|про|на|к|перед|при|с|между)\\b", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);

        String text = "Рассмотрим основные, на наш взгляд, направления работы по изучению предлогов русского " +
                "языка в иноязычной аудитории.\n" +
                "1. Осознание учащимися роли (функции) предлога в речи. Это очень важное условие для формирования " +
                "понятия о предлогах, поскольку этой служебной части речи может просто не быть в грамматике\n" +
                "родного языка учащихся.\n" +
                "Как известно, предлог служит для выражения различных отношений имени существительного с другими " +
                "словами. Поэтому учащиеся должны усвоить, что предлог тесно связан с формой косвенного падежа " +
                "существительного, вернее, с его окончанием, а для выражения необходимого смыслового отношения два " +
                "этих средства используются в комплексе. Ср.: идти полем – идти по полю, идти с поля, идти на поле, " +
                "идти в поле; пойти за дом – находиться за домом.";

        String replacementWord = "java";

        String result = text.replaceAll(hasPrepositions.pattern(), replacementWord);
        System.out.println(result);
    }
}
