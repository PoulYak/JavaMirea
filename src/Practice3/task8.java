package Practice3;

import java.text.NumberFormat;
import java.util.*;

public class task8 {
    public static void main(String[] args) {
        ArrayList<Employee> mass = new ArrayList<>();
        mass.add(new Employee("Петров Иннокентий Борисович", 236.6));
        mass.add(new Employee("Дроздов Геннадий Иванович", 243.5));
        mass.add(new Employee("Ляблин Дмитрий Анварович", 213.43));
        mass.add(new Employee("Легозуб Анна Васильевна", 233.423));
        Report.generateReport(mass);
    }
}

class CurrencyConverter{
    public static void main(String[] args) {

        double number = 123.4567;
        CurrencyConverter currencyConverter = new CurrencyConverter();
        System.out.println(currencyConverter.convert("us", "chi", 123.3, false));
    }
    HashMap<String, Double> bank;
    HashMap<String, Locale> locales;

    public CurrencyConverter() {
        bank = new HashMap<>();
        bank.put("us", 1.0);
        bank.put("chi", 94.7);
        bank.put("ger", 0.932446);
        bank.put("uk", 0.8916);
        locales = new HashMap<>();
        locales.put("us", Locale.US);
        locales.put("chi", Locale.CHINA);
        locales.put("ger", Locale.GERMANY);
        locales.put("uk", Locale.UK);
    }

    public String convert(String from_curr, String to_curr, double amount_of_money_was, boolean return_just_answer){
        double amount_of_money= amount_of_money_was / bank.get(from_curr);
        amount_of_money *= bank.get(to_curr);
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(locales.get(from_curr));
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(locales.get(to_curr));
        if (return_just_answer)
            return numberFormat2.format(amount_of_money);
        return String.format("Вы поменяли "+numberFormat1.format(amount_of_money_was)+" на "+numberFormat2.format(amount_of_money));

    }
}

class Employee{
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Report{
    public static void generateReport(ArrayList<Employee> arr){
        for (Employee e: arr){
            System.out.printf("Fullname: %1$-30s - salary: %2$5.2f\n",e.getFullname(), e.getSalary());
        }
    }
}

class Shop{
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.buy(1, "chi");
    }
    double[] prices = {123.4, 3.3, 12.5, 12.0, 22.5};

    public Shop() {
        System.out.printf("Цены на товары, которые есть %s\n", Arrays.toString(prices));
    }

    public void buy(int good_number, String currency) {
        CurrencyConverter converter = new CurrencyConverter();
        System.out.printf("К оплате %s", converter.convert("us", currency, prices[good_number], true));
    }
}

