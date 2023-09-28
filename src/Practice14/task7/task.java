package Practice14.task7;

import java.util.regex.Pattern;

public class task {
    public static void main(String[] args) {
        String regex = "((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9_]{8,8})";
        String password = "AaaA0000";
        if (Pattern.matches(regex, password))
            System.out.println("Надежно");
        else
            System.out.println("Не надежно");

    }
}