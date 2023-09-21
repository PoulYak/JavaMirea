package Practice11.task2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        System.out.println("Введите дату в вормате 01.01.2021:");
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("\\.");
        int date = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int year = Integer.parseInt(s[2]);


        Calendar calendar = new GregorianCalendar(year, month-1, date);
        Date timeNow = new Date(System.currentTimeMillis());
        if (calendar.getTimeInMillis()/(60*60*24000)+1 == timeNow.getTime()/(60*60*24000))
            System.out.println("Даты равны");
        else if (calendar.getTime().after(timeNow))
            System.out.println("Введенная дата позже");
        else
            System.out.println("Введенная дата раньше");
    }
}
