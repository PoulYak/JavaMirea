package Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println("Чтобы добавить введите + <название> <цена>");
        System.out.println("Чтобы добавить введите - <название>");
        System.out.println("Чтобы найти введите ? <название>");
        System.out.println("Чтобы выйти введите exit");
        Scanner sc = new Scanner(System.in);
        String command;
        String computerName;
        double price;
        boolean isEnd=false;
        while (!isEnd){
            command = sc.next();
            if (command.equals("+")) {
                computerName = sc.next();
                price = sc.nextDouble();
                shop.addComputer(new Computer(computerName, price));
            } else if (command.equals("-")) {
                computerName = sc.next();
                shop.deleteComputer(computerName);
            } else if (command.equals("?")) {

                computerName = sc.next();
                System.out.println(shop.getComputer(computerName));

            }
            else {
                isEnd = true;
            }
        }

    }
}

class Shop{
    private ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }



    public void addComputer(Computer computer){
        computers.add(computer);
    }

    public Computer getComputer(String computerName){
        for (Computer computer: computers){
            if (computerName.equals(computer.getName()))
                return computer;
        }
        return null;
    }

    public void deleteComputer(String computerName){
        int i = 0;
        while (i<computers.size()){
            Computer computer = computers.get(i);
            if (computerName.equals(computer.getName()))
                computers.remove(computer);
        }
    }

}

class Computer{
    private String name;
    private double price;

    public Computer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}