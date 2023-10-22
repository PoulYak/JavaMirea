package Practice23.task1;

import Practice23.task2.Queue;

public class ArrayQueueADT {
    private int size;
    private int top;
    private int last;

    private Object[] elements = new Object[10];



    public static void enqueue(ArrayQueueADT queueADT ,Object t) {
        if (queueADT.size==queueADT.elements.length)
            increaseSize(queueADT);
        queueADT.elements[queueADT.last] = t;
        queueADT.last = (queueADT.last+1)%queueADT.elements.length;
        queueADT.size++;
    }


    public static Object element(ArrayQueueADT queueADT) {
        if (queueADT.size<1)
            throw new IndexOutOfBoundsException();
        return queueADT.elements[queueADT.top];
    }


    public static Object dequeue(ArrayQueueADT queueADT) {
        Object x = element(queueADT);
        queueADT.size--;
        queueADT.elements[queueADT.top] = null;
        queueADT.top = (queueADT.top+1)%queueADT.elements.length;
        return x;
    }


    public static int size(ArrayQueueADT queueADT) {
        return queueADT.size;
    }


    public static boolean isEmpty(ArrayQueueADT queueADT) {
        return queueADT.size==0;
    }


    public static void clear(ArrayQueueADT queueADT ) {
        queueADT.size = 0;
        queueADT.top = 0;
        queueADT.last = 0;

    }


    private static void increaseSize(ArrayQueueADT queueADT) {
        int len = queueADT.elements.length;
        Object[] newElements =  new Object[queueADT.elements.length*2];
        int i = 0;
        while (queueADT.top!=queueADT.last) {
            newElements[i] = queueADT.elements[queueADT.top];
            queueADT.top = (queueADT.top + 1) % len;
            i++;
        }
        queueADT.top = 0;
        queueADT.last = len - 1;
        queueADT.elements = newElements;
    }
}
