package Practice13.task2;

public class Person {
    public static void main(String[] args) {
        Person person = new Person("Олег", "", "Ляшко");
        System.out.println(person.getFIO());
    }
    private String name;
    private String secondName;
    private String surname;

    public Person(String name, String secondName, String surname) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
    }

    public String getFIO(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.surname);
        sb.append(" ");
        if (this.name.length()>0)
            sb.append(this.name.substring(0, 1).toUpperCase());
            sb.append(".");
        if (this.secondName.length()>0)
            sb.append(this.secondName.substring(0, 1).toUpperCase());
        sb.append(".");
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
