package Practice23.task1;

public class ArrayQueueModule {
    private static int size = 0;
    private static int top = 0;
    private static int last = 0;

    private static Object[] elements = new Object[10];


    public static void enqueue(Object t) {
        if (size == elements.length)
            increaseSize();
        elements[last] = t;
        last = (last + 1) % elements.length;
        size++;
    }

    public static Object element() {
        if (size < 1)
            throw new IndexOutOfBoundsException();
        return elements[top];
    }

    public static Object dequeue() {
        Object x = element();
        size--;
        elements[top] = null;
        top = (top + 1) % elements.length;
        return x;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        size = 0;
        top = 0;
        last = 0;

    }


    private static void increaseSize() {
        int len = elements.length;
        Object[] newElements = new Object[elements.length * 2];
        int i = 0;
        while (top != last) {
            newElements[i] = elements[top];
            top = (top + 1) % len;
            i++;
        }
        top = 0;
        last = len - 1;
        elements = newElements;
    }
}
