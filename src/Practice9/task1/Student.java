package Practice9.task1;

import java.util.Arrays;

public class Student{
    public static void main(String[] args) {
        int n=5;
        Student[] iDNumber = new Student[n];
        iDNumber[0] = new Student("Павел Митрофанов", 123, 20);
        iDNumber[1] = new Student("Алина Зубарева", 12, 18);
        iDNumber[2] = new Student("Евгений Умов", 15, 22);
        iDNumber[3] = new Student("Геннадий Петров", 13, 21);
        iDNumber[4] = new Student("Лена Мистрикова", 8, 28);

        for (int i=0; i<n; i++){
            int j = i;
            while (j>0 && (iDNumber[j].getId()<iDNumber[j-1].getId())){
                Student temp = iDNumber[j];
                iDNumber[j] = iDNumber[j-1];
                iDNumber[j-1] = temp;
                j--;
            }
        }
        for (Student s: iDNumber){
            System.out.println(s);
        }
    }

    private String fullName;
    private int id;
    private int age;

    public Student(String fullName, int id, int age) {
        this.fullName = fullName;
        this.id = id;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
