package Practice9.task3;


import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] s1 = new Student[10];
        Student[] s2 = new Student[10];
        for (int i = 0; i < 10; i++) {
            s1[i] = new Student("Name0" + i, (int) (Math.random() * 100), (int) (Math.random() * 100));
            s2[i] = new Student("Name1" + i, (int) (Math.random() * 100), (int) (Math.random() * 100));
        }
        System.out.println("\nStudent1:");
        for (Student student : s1) {
            System.out.println(student);
        }
        System.out.println("\nStudent2:");
        for (Student student : s2) {
            System.out.println(student);
        }

        s1=MergeSort(s1);
        s2=MergeSort(s2);

        Student[] students = Merge(s1, s2);

        System.out.println("\nStudent Both:");
        for (Student student : students) {
            System.out.println(student);
        }



    }

    public static Student[] MergeSort(Student[] students) {
        if (students.length > 1) {
            Student[] students1 = new Student[(students.length + 1) / 2];
            System.arraycopy(students, 0, students1, 0, students1.length);
            Student[] students2 = new Student[(students.length) / 2];
            System.arraycopy(students, students1.length, students2, 0, students2.length);
            students1=MergeSort(students1);
            students2=MergeSort(students2);
            return Merge(students1, students2);
        }
        return students;
    }

    public static Student[] Merge(Student[] students1, Student[] students2) {
        Student[] students = new Student[students1.length + students2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (k != students.length) {
            if (i < students1.length) {
                if (j < students2.length) {
                    if (students1[i].compareTo(students2[j]) <= 0) {
                        students[k] = students1[i++];
                    } else {
                        students[k] = students2[j++];
                    }
                } else
                    students[k] = students1[i++];
            } else
                students[k] = students2[j++];
            k++;
        }
        return students;
    }
}
