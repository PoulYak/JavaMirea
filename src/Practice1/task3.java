package Practice1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mass = new int[n];
        double s = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            mass[i] = sc.nextInt();
            int item = mass[i];
            s += item;
            count++;
        }
        System.out.println(count+" "+s / count);
    }
}
