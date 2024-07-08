package test.test2;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(12, "XII");
        m.put(13, "XIII");
        m.put(10, "XII");
        Map<String, Integer> newMap = Test.reverse(m);
        System.out.println(newMap);
    }
    public static Map<String, Integer> reverse(Map<Integer, String> m){
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry :m.entrySet()){
            if (!newMap.containsKey(entry.getValue()))
                newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;
    }
}
