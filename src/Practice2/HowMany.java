package Practice2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HowMany {
public static void main(String[] args) {
    String regexp = "[а-яА-Я0-9A-Za-z]+";
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите предложение в сторку");
    String text = sc.nextLine();
    Matcher m = Pattern.compile(regexp).matcher(text);
    int count = 0;
    while (m.find()){
//        System.out.println(m.group());
        count++;
    }
    System.out.println(count);

}
}
