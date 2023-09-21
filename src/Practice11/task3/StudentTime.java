package Practice11.task3;

import Practice10.task1.Student;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class StudentTime extends Student {

    public static void main(String[] args) {
        StudentTime s = new StudentTime("Poul", "Yakovlev", "Software Ingenering", 2, "ИКБО-04-22", 22, new GregorianCalendar(2004, 3, 23).getTime());
        s.printDate(1);
    }
    Date birthday;
    public StudentTime(String firstName, String lastName, String speciality, int courseNumber, String group, double avgScore, Date birthday) {
        super(firstName, lastName, speciality, courseNumber, group, avgScore);
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }
    public void printDate(int type){
        SimpleDateFormat dateFormatter1 = new SimpleDateFormat("E, d.M.y 'at' h:m:s a z");
        SimpleDateFormat dateFormatter2 = new SimpleDateFormat("d.M.y");
        SimpleDateFormat dateFormatter3 = new SimpleDateFormat("h:m:s d.M.y");
        if (type==1)
            System.out.println(dateFormatter1.format(birthday));
        else if (type==2)
            System.out.println(dateFormatter2.format(birthday));
        else
            System.out.println(dateFormatter3.format(birthday));
    }
}
