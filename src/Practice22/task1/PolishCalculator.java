package Practice22.task1;

import java.util.Scanner;
import java.util.Stack;

public class PolishCalculator {
    public void calculateInputString(String line){
        try {

            Stack<Double> st = new Stack<>();

            for (String s: line.split("\\s")) {
                double fir,sec;
                if (s.equals("+")){
                    fir = st.pop();
                    sec = st.pop();
                    st.push(sec + fir);
                }

                else if (s.equals("-")){
                    fir = st.pop();
                    sec = st.pop();
                    st.push(sec - fir);
                }
                else if (s.equals("/")) {
                    fir = st.pop();
                    sec = st.pop();
                    st.push(sec / fir);
                }
                else if (s.equals("*")){
                    fir = st.pop();
                    sec = st.pop();
                    st.push(sec * fir);
                }
                else
                    st.push(Double.valueOf(s));
            }
            System.out.println("Result: "+st.pop());

        }
        catch (Exception e){
            System.out.println("Ошибочка");
        }
    }

    public static void main(String[] args) {
        PolishCalculator calc = new PolishCalculator();
//        System.out.println("Введите выражение в польской записи:");
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
        calc.calculateInputString("2 3 +");
        calc.calculateInputString("2 3 * 4 5 +");
        calc.calculateInputString("2 3 4 5 6 * + - /");
    }
}
