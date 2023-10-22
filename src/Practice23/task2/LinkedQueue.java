package Practice23.task2;

import java.util.LinkedList;

public class LinkedQueue<T> implements Queue<T>{

    LinkedList<T> queue = new LinkedList<>();
    @Override
    public void enqueue(T t) {
        queue.addLast(t);
    }

    @Override
    public T element() {
        if (queue.isEmpty())
            return null;
        else
            return queue.getFirst();
    }

    @Override
    public T dequeue() {
        return queue.pop();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void clear() {
        queue.clear();
    }
}
