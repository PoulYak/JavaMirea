package Practice14.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task {
    public static void main(String[] args) {
        String regex = "\\d *\\+";
        String s = "(1 + 8) – 9 / 4 ";
        //Сначала удаляем цифры, за которыми следует +, а потом просто ищем цифры

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        s = m.replaceAll("");
        if (Pattern.compile("\\d").matcher(s).find()){
            System.out.println("Есть");
        }
        else
            System.out.println("Нет");



    }
}
