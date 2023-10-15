package Practice21.classwork;

import java.util.ArrayList;
import java.util.List;

public class task {
    public static void printList(List<? extends Number> lst) {
        for (Object o : lst) System.out.println(o);
    }

    public static void main(String[] args) {
        // List<Number> lst = new ArrayList<Integer>(); // ошибка
        List<? extends Number> lst = new ArrayList<Integer>(); // ошибка
    }


}
