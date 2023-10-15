package Practice14.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        String regex = "(\\d+)\\.\\d{0,2} ?(RUB|EU|USD)";
        String s = "44 ERR, 0.004 EU, 25.98 USD";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }

    }
}