package Practice10.task3;

import Practice10.task1.Student;
import Practice10.task2.SortingStudentsByGPA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CombineArrays {
    public static void main(String[] args) {
        SortingStudentsByGPA sorting1 = new SortingStudentsByGPA();
        SortingStudentsByGPA sorting2 = new SortingStudentsByGPA();
        sorting1.setArray();
        sorting2.setArray();

        SortingStudentsByGPA sortedBoth = new SortingStudentsByGPA(combine(sorting1.getiDNumber(), sorting2.getiDNumber(), sorting2.getComparatorScore(), sorting2.getComparatorGroup()));

        sortedBoth.outArray();


    }

    public static ArrayList<Student> combine(ArrayList<Student> arr1, ArrayList<Student> arr2, Comparator<Student> comp1, Comparator<Student> comp2){
        ArrayList<Student> students = new ArrayList<>(arr1);
        students.addAll(arr2);
        students.sort(comp1.thenComparing(comp2));
        return students;
    }


}
