package Practice19.task1;

public class task {
    public static void main(String[] args) {
        Market market = new Market();
        try{
            market.buy();
        }
        catch (WrongINNException e){
            System.out.println("Неправильный INN");
        }

    }
}
