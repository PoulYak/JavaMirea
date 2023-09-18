package Practice1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fact(sc.nextInt()));
    }

    private static long fact(long n){
        if (n<=1)
            return 1;
        return n*fact(n-1);
    }
}
