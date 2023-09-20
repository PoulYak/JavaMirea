package Practice9.task2;

import Practice9.task3.Student;

import java.util.Arrays;

public class SortingStudentsByGPA {
    Student[] students;

    public SortingStudentsByGPA() {
        students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Name" + i, (int) (Math.random() * 100), (int) (Math.random() * 100));
        }
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorting = new SortingStudentsByGPA();
        System.out.println(sorting);
        sorting.QuickSort(0, 19);
        System.out.println(sorting);



    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Students\n");
        for (Student student: students){
            s.append(student.toString()).append("\n");
        }
        return s.toString();
    }

    public void QuickSort(int l, int r){
        if (l<r){
            int q = Partition(l, r);
//            System.out.println(this);
//            System.out.println(q);
            QuickSort(l, q-1);
            QuickSort(q+1, r);
        }
    }

    public int Partition(int l, int r){
        Student x = students[r];
        int i = l-1;
        Student temp;
        for (int j=l; j<r; j++){
            if (students[j].compareTo(x)<=0){
                i++;
                temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        temp = students[i+1];
        students[i+1] = students[r];
        students[r] = temp;
        return i+1;
    }
}
