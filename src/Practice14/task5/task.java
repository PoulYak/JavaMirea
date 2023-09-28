package Practice14.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task {
    public static void main(String[] args) {
        String yan_mar_may_jul_aug_oct_dec = "(0[123456789]|[12]\\d|3[01])/(0[13578]|1[02])/(19\\d{2,2}|[2-9]\\d{3,3})";
        String apr_jun_sep_nov = "(0[123456789]|[12]\\d|30)/(0[469]|11)/(19\\d{2,2}|[2-9]\\d{3,3})";
        String feb_vis = "(0[123456789]|1\\d|2[0123456789])/(02)/(19([13579][26]|[02468][048])|[2-9]\\d([13579][26]|[02468][048]))";
        String feb_novis = "(0[123456789]|1\\d|2[012345678])/(02)/(19([13579][01345789]|[02468][1235679])|[2-9]\\d([13579][01345789]|[02468][1235679]))";
        String regex = String.format("((%1$s)|(%2$s)|(%3$s)|(%4$s))", yan_mar_may_jul_aug_oct_dec, apr_jun_sep_nov, feb_vis, feb_novis);
        String s = "1/1/1899";
        if (Pattern.matches(regex, s))
            System.out.println("соответствует");
        else
            System.out.println("не соответствует");

    }
}

