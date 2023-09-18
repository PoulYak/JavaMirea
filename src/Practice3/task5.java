package Practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task5 { //то же самое что и 4
    public static void main(String[] args) {
        int n;
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] mass = new int[n];
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=0; i<n; i++){
            mass[i] = rand.nextInt(n+1);
            if (mass[i]%2==0)
                arr.add(mass[i]);
        }
        System.out.println(Arrays.toString(mass));

        System.out.println(arr);

    }
}
