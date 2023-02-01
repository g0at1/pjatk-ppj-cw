package cwiczenia.c27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String test = "4F";
        System.out.println(isHexa(test));

        String test1 = "D.c.B.A";
        System.out.println(isSame(test1));

        String date = "2023-01-30";
        System.out.println(date(date));

        String test2 = "wieś w Polsce położona " +
                "w województwie wielkopolskim, " +
                "w powieciekolskim, w gminie Olszówka. " +
                "W latach 1975-1998 miejscowość położona była w wo-jewództwie konińskim.";
        System.out.println(howMuch(test2));

    }

    public static boolean isHexa(String input) {
        String hexaPattern = "^[0-9a-fA-F]+$";
        Pattern compiledPattern = Pattern.compile(hexaPattern);
        Matcher matcher = compiledPattern.matcher(input);

        return matcher.matches();
    }

    public static boolean isSame(String input) {
        String samePatter = "[a-zA-Z]\\.[a-zA-Z]\\.[a-zA-Z]\\.[a-zA-Z]";
        Pattern compiledPattern = Pattern.compile(samePatter);
        Matcher matcher = compiledPattern.matcher(input);

        return matcher.matches();
    }

    public static boolean date(String date) {
        String datePattern = "\\d{4}-\\d{1,2}-\\d{1,2}";
        Pattern compiledPattern = Pattern.compile(datePattern);
        Matcher matcher = compiledPattern.matcher(date);

        return matcher.matches();
    }

    public static boolean binary(String input) {
        String binaryPatter = "[01]([01] [01])*";
        Pattern compiledPattern = Pattern.compile(binaryPatter);
        Matcher matcher = compiledPattern.matcher(input);

        return matcher.matches();
    }

    public static int howMuch(String input) {
        String numberPattern = "\\b\\d+\\b";
        Pattern pattern = Pattern.compile(numberPattern);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return (count/2);
    }


}
