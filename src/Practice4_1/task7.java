package Practice4_1;

import java.util.ArrayList;

class Learner{
    private String name;

    public Learner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Learner() {
    }
}

class Student extends Learner{
    public Student(String name) {
        super(name);
    }
}

class Schoolboy extends Learner{
    public Schoolboy(String name) {
        super(name);
    }
}

class Tester2{
    public static void main(String[] args) {
        ArrayList<Learner> list = new ArrayList<>();
        list.add(new Schoolboy("Пётр"));
        list.add(new Student("Вова"));
        list.add(new Student("Лена"));
        list.add(new Schoolboy("Ульяна"));
        list.add(new Schoolboy("Денис"));
        list.add(new Student("Маша"));

        System.out.println("Студенты:");

        for (Learner l: list){
            if (l instanceof Student){
                System.out.println("  "+l.getName());
            }
        }
        System.out.println("\nШкольники:");
        for (Learner l: list){
            if (l instanceof Schoolboy){
                System.out.println("  "+l.getName());
            }
        }
    }
}