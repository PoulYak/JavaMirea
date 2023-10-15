package Practice18.task2;

import java.util.Scanner;

public class Exception2 {
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

    }
}
