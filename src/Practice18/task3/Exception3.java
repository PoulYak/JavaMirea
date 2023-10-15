package Practice18.task3;


import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        String intString = myScanner.next();

        try{
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        }
        catch (Exception e){
            System.out.println("Общая ошибочка");
        } // переходит в этот блок как в случае деления на ноль так и неправильной записи

    }
}