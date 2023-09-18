package Practice4_1;


class Person{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Олег", 22);
        p1.move();
        p2.talk();
    }
    String fullName;
    int age;

    public void move(){
        System.out.printf("%s двигается\n", fullName);
    }
    public void talk(){
        System.out.printf("%s говорит\n", fullName);
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}