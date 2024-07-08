package test.test1;

import java.util.ArrayList;

public class Test {
    public static ArrayList<Integer> alternate(ArrayList<Integer> l1, ArrayList<Integer> l2){
        ArrayList<Integer> l = new ArrayList<>();
        for (int i=0; i<Math.max(l1.size(), l2.size()); i++){
            if (i<l1.size())
                l.add(l1.get(i));
            if (i<l2.size())
                l.add(l2.get(i));
        }
        return l;
    }
}
