package Practice2;

import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {
        int[] mass = {1,2,3,4,5};
        int temp;
        for (int i=0; i<mass.length/2; i++){
            temp = mass[mass.length-1-i];
            mass[mass.length-1-i] = mass[i];
            mass[i] = temp;
        }
        System.out.println(Arrays.toString(mass));

    }
}
