package Practice10.task2;

import Practice10.task1.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA {
    public SortingStudentsByGPA(ArrayList<Student> iDNumber) {
        this.iDNumber = iDNumber;
    }

    ArrayList<Student> iDNumber;
    Comparator<Student> comparatorScore = (student, t1) -> {
        if (student.getAvgScore() > t1.getAvgScore())
            return -1;
        else if (student.getAvgScore() < t1.getAvgScore())
            return 1;
        return 0;
    };

    public Comparator<Student> getComparatorScore() {
        return comparatorScore;
    }

    public Comparator<Student> getComparatorGroup() {
        return comparatorGroup;
    }

    public ArrayList<Student> getiDNumber() {
        return iDNumber;
    }
    Comparator<Student> comparatorGroup = (student, t1) -> {
        if (student.getCourseNumber() > t1.getCourseNumber())
            return 1;
        else if (student.getCourseNumber() < t1.getCourseNumber())
            return -1;
        return 0;
    };

    public SortingStudentsByGPA() {
        this.iDNumber = new ArrayList<>();
    }

    public void quickSort(){
        this.iDNumber.sort(comparatorScore.thenComparing(comparatorGroup));
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorting = new SortingStudentsByGPA();
        sorting.setArray();
        sorting.outArray();
        sorting.quickSort(); // сортирует сначала по убыванию балла, потом по возрастанию номера курса
        sorting.outArray();


    }

    public void outArray() {
        System.out.println("Students");
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public void setArray() {
        for (int i = 0; i < 10; i++) {
            int courseNumber = (int) (Math.random() * 4 + 1);
            String group = String.format("ИКБО-%1$02d-%2$02d", (int) (Math.random() * 30), (int) (Math.random() * 4) + 20);
            iDNumber.add(new Student("Name" + i, "Surname" + i, "ФКН", courseNumber,
                    group, (int) (Math.random() * 60 + 40)));

        }
    }
}
