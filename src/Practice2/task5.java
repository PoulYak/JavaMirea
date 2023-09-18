package Practice2;

import java.util.ArrayList;

public class task5 {
    public static void main(String[] args) {
        Kennel kennel = new Kennel();
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Тобик", 11));
        dogs.add(new Dog("Бобик", 12));
        kennel.addDogs(dogs);
        System.out.println(kennel);
    }



}

class Dog{
    private String name;
    private double age;

    public Dog(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHumanAge(){
        return this.age*7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class Kennel{
    ArrayList<Dog> dogs = new ArrayList<>();
    public void addDogs(ArrayList<Dog> dogs){
        this.dogs.addAll(dogs);
    }

    @Override
    public String toString() {
        return "Kennel{" +
                "dogs=" + dogs +
                '}';
    }
}
