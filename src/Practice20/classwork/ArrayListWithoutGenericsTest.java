package Practice20.classwork;

import java.util.*;

public class ArrayListWithoutGenericsTest {
    public static void main(String[] args) {
        List strLst = new ArrayList();
        // List и ArrayList содержит тип Objects
        strLst.add("alpha");
        // Неявное преобразование String в Object
        strLst.add("beta");
        strLst.add("charlie");
        Iterator iter = strLst.iterator();
        while (iter.hasNext()) {
            String str = (String) iter.next();
    // необходимо выполнить понижающее преобразование типов Object обратно в String
            System.out.println(str);
        }
        strLst.add(1234);
    // на этапе Compile/runtime невозможно определить ошибку
        String str = (String) strLst.get(3);
    // компиляция ок, но будет runtime ClassCastException
    }
}
