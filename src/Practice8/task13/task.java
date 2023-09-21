package Practice8.task13;

import java.util.ArrayList;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        result.add(x);

        int state = 0;
        while (x!=0){
            x = sc.nextInt();
            if (state==1)
                result.add(x);
            state = (state+1)%2;
        }
        System.out.println(result);
    }
}
