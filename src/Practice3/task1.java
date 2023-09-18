package Practice3;

import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int n = 10;
        Random rand = new Random();
        double[] mass = new double[n];
        for (int i=0; i<n; i++){
            if (i%2==0)
                mass[i] = Math.random();
            else
                mass[i]=rand.nextDouble();

        }

        System.out.println(Arrays.toString(mass));

        Arrays.sort(mass);

        System.out.println(Arrays.toString(mass));


    }
}
