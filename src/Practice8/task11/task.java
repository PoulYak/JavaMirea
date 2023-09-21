package Practice8.task11;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prevNumber, currentNumber;
        int counter = 0;
        prevNumber = sc.nextInt();
        currentNumber = sc.nextInt();
        counter += (prevNumber==1?1:0);
        counter += (currentNumber==1?1:0);
        while (prevNumber!=0 || currentNumber!=0){
            prevNumber = currentNumber;
            currentNumber = sc.nextInt();
            counter += (currentNumber==1?1:0);
        }
        System.out.println(counter);

    }
}
