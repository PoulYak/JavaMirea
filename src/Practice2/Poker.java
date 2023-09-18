package Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Poker{
    private ArrayList<String> cards;

    static final String[] suits = {"♠", "♥", "♦", "♣"};
    static final String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public Poker() {
        cards = new ArrayList<>();
        for (String suit: suits){
            for (String value: values){
                cards.add(value+suit);
            }
        }
        cards.add("♥JOKER♥");
        cards.add("♠JOKER♠");
        Collections.shuffle(cards);
    }

    public String getCards(){
        int i=0;
        ArrayList<String> result = new ArrayList<>();
        while (!cards.isEmpty() && i<5){
            result.add(cards.remove(cards.size()-1));
            i++;
        }
        return String.join(" ", result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Poker poker = new Poker();
        for (int i=0; i<n; i++)
            System.out.println(i+") "+poker.getCards()+"\n");
    }
}
