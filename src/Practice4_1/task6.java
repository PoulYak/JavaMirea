package Practice4_1;

class Employer{
    protected String firstName;
    protected String lastName;
    protected double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }
    public double getIncome() {
        return income;
    }


}

class Manager extends Employer{
    protected double averageSum;

    public Manager(double averageSum, String firstName, String lastName, double income) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }


}


class Tester5{
    public static void main(String[] args) {
        Employer employer = new Manager(23.3, "Иван", "Меркулов", 23232.4);

    }
}
