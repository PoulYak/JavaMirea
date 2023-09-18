package Practice1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] mass = new int[n];
        int i=0;
        int temp;
        while (i<n){
            temp = sc.nextInt();
            mass[i] = temp;
            i++;
        }
        int maxi = -1, mini = -1;
        int s=0;
        if (mass.length!=0){
             maxi = mass[0];
             mini = mass[0];

        }
        i=0;
        while (i<mass.length){
            int item = mass[i];
            mini = (Math.min(item, mini));
            maxi = (Math.max(item, maxi));
            s+=item;
            i++;
        }
        System.out.printf("max:%d, min: %d, sum: %d", maxi, mini, s);
    }
}
