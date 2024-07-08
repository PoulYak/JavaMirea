package test.test4;

import java.util.Set;

public class Test {
    public static boolean hasOdd(Set<Integer> s){

        for (int item: s){
            if (item%2==1)
                return true;
        }
        return false;
    }
}
