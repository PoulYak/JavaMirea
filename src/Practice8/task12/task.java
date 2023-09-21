package Practice8.task12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();

        if (x%2==1)
            result.add(x);
        while (x!=0){
            x = sc.nextInt();
            if (x%2==1)
                result.add(x);
        }
        System.out.println(result);
    }
}
