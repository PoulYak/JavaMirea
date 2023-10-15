package Practice18.task4;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        String intString = myScanner.next();

        try{
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        }
        catch (NumberFormatException e){
            System.out.println("Wrong format of integer");
        }
        catch (ArithmeticException e){
            System.out.println("division by zero");
        }
        finally {
            System.out.println("Вошли в finally"); // теперь в конце всегда выводится это
        }

    }
}