package Practice19.task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Market {
    public void buy() throws WrongINNException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите фио:");
        String s = scanner.nextLine();
        System.out.println("Укажите ИНН:");
        String INN = scanner.next();
        if (checkINN(INN)){
            System.out.println("Ваш заказ оформлен");
        }
        else {
            throw new WrongINNException(INN);
        }
    }

    private boolean checkINN(String INN){

        if (Pattern.matches("\\d{12,12}", INN))
            return true;
        else
            return false;

    }
}
