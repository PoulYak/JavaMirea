package Practice14.task6;

import java.util.regex.Pattern;

public class task {
    public static void main(String[] args) {
        String regex = "(\\w+)@(\\w+)(\\.\\w+)*";
        String s = "Julia String";
        if (Pattern.matches(regex, s))
            System.out.println("соответствует");
        else
            System.out.println("не соответствует");

    }
}
