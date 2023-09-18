package Practice3;

import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int n = 4;
        Random rand = new Random();
        int[] mass = new int[n];
        for (int i=0; i<n; i++){
            mass[i] = 10+rand.nextInt(90);
        }
        boolean isIncrease = true;
        for (int i=1; i<n; i++){
            if (mass[i]<=mass[i-1])
                isIncrease=false;
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Последовательность "+(isIncrease?"возрастающая":"не возрастающая"));

    }
}
