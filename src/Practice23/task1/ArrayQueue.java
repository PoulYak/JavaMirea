package Practice23.task1;

import Practice23.task2.AbstractQueue;
import Practice23.task2.Queue;

public class ArrayQueue<T> extends AbstractQueue<T> implements Queue<T> {
    private int size;
    private int top;
    private int last;

    private T[] elements;

    public ArrayQueue() {
        this.elements = (T[]) new Object[10];
        size=0;
        top=0;
        last=0;
    }


    //pre: element != null
    //post: elements[tail] = element,
    //      tail = (tail + 1) % elements.length,
    //      size = size + 1
    @Override
    public void enqueue(T t) {
        if (size==elements.length)
            increaseSize();
        elements[last] = t;
        last = (last+1)%elements.length;
        size++;
    }

    //pre: size > 0
    //post: R = elements[head]
    @Override
    public T element() {
        if (size<1)
            throw new IndexOutOfBoundsException();
        return elements[top];
    }

    //pre: size > 0
    //post: R = elements[head],
    //      head = (head + 1) % elements.length,
    //      size = size - 1
    @Override
    public T dequeue() {
        T x = element();
        size--;
        elements[top] = null;
        top = (top+1)%elements.length;
        return x;
    }

    //post: R = size
    @Override
    public int size() {
        return size;
    }

    //post: R = (size == 0)
    @Override
    public boolean isEmpty() {
        return size==0;
    }

    //post: size = 0,
    //      head = 0,
    //      tail = 0,
    @Override
    public void clear() {
        size = 0;
        top = 0;
        last = 0;

    }


    private void increaseSize() {
        int len = elements.length;
        T[] newElements =  (T[]) new Object[elements.length*2];
        int i = 0;
        while (top!=last) {
            newElements[i] = elements[top];
            top = (top + 1) % len;
            i++;
        }
        top = 0;
        last = len - 1;
        elements = newElements;
    }
}
