package myBilet;


import java.util.Collections;

public class ArrayIntList {
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = new int[]{1,5,3,4,10, 10, 0};
        ArrayIntList arr = new ArrayIntList(numbers, n);
        System.out.println(arr.isPairSorted());
    }

    public ArrayIntList(int[] elementData, int size) {
        this.elementData = elementData;
        this.size = size;
    }

    private int[] elementData;
    private int size;
    public boolean isPairSorted(){
        for (int i=1; i<size; i+=2){
            if (elementData[i-1]>elementData[i])
                return false;
        }
        return true;
    }
}
