package Practice11.task4;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split("[<>]+");
        int year = Integer.parseInt(s[1]);
        int month = Integer.parseInt(s[2]);
        int day = Integer.parseInt(s[3]);
        line = sc.nextLine();
        s = line.split("[<>]+");
        int hours = Integer.parseInt(s[1]);
        int minutes = Integer.parseInt(s[2]);
        Date date = new GregorianCalendar(year, month-1, day, hours, minutes).getTime();
        System.out.println(date);

    }
}
