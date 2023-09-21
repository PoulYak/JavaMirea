package Practice11.task1;

import java.util.Date;

public class Developer {
    String name;
    String surname;
    Date timeTaskStart;
    Date timeTaskEnd;



    public static void main(String[] args) {
        Developer d = new Developer("Poul", "Yakovlev", new Date(System.currentTimeMillis()-10000), new Date(System.currentTimeMillis()));
        System.out.println(d);
    }

    @Override
    public String toString() {


        return "Developer "+ name+" "+surname+"\n"+"Задача получена: "+timeTaskStart+"\n"+"Задача решена: "+timeTaskEnd+"\n";

    }

    public Developer(String name, String surname, Date timeTaskStart, Date timeTaskEnd) {
        this.name = name;
        this.surname = surname;
        this.timeTaskStart = timeTaskStart;
        this.timeTaskEnd = timeTaskEnd;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getTimeTaskStart() {
        return timeTaskStart;
    }

    public Date getTimeTaskEnd() {
        return timeTaskEnd;
    }
}
