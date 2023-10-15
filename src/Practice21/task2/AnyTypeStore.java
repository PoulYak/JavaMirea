package Practice21.task2;

import java.util.ArrayList;
import java.util.List;

public class AnyTypeStore<T> {
    T[] mass;
    int size;

    public AnyTypeStore(T[] mass) {
        this.size = 0;
        this.mass = mass;

    }
    public void add(T o){
        if (size>=mass.length)
            throw new ArrayStoreException();
        else{
            mass[size] = o;
            size++;
        }
    }

    public T get(int idx){
        if (idx>=size)
            throw new ArrayIndexOutOfBoundsException();
        else{
            return mass[idx];
        }
    }

    public void saveToList(){
        ArrayList<T> lst = new ArrayList<>();
        for (int i=0; i<size; i++){

            lst.add(mass[i]);
        }
        System.out.println(lst.subList(0, Math.min(size, 5)));

    }

    public static void main(String[] args) {
        System.out.println("Task 2");
        Integer[] lst = new Integer[10];
        AnyTypeStore mass = new AnyTypeStore(lst);
        mass.add(321);
        mass.add(1);

        System.out.println("\nTask 3");

        int i = (int) mass.get(1);
        System.out.println(i);
        System.out.println("\nTask 4");
        mass.add(1);
        mass.add(1);
        mass.add(1);
        mass.add(1);

        mass.saveToList();



    }
}
