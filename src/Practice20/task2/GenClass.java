package Practice20.task2;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenClass<T, V, K> {
    T t;
    V v;
    K k;

    public GenClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
    public void printClassNames(){
        System.out.println("Class(t) = "+t.getClass());
        System.out.println("Class(v) = "+v.getClass());
        System.out.println("Class(k) = "+k.getClass());
    }

    public static void main(String[] args) {
        GenClass<Integer, Object, Pattern> genClass = new GenClass<>(23, new Object(), Pattern.compile("123"));
        genClass.printClassNames();
    }
}
