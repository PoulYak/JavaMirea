package Practice23.task1;

import java.util.concurrent.Flow;

public class test {
    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.isEmpty());
        arrayQueue.clear();
        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.isEmpty());
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(7);
        System.out.println(arrayQueue.element());

        arrayQueue.enqueue(8);
        arrayQueue.enqueue(9);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(11);
        arrayQueue.enqueue(12);
        arrayQueue.enqueue(13);
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println("\nModule");

        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.isEmpty());
        ArrayQueueModule.enqueue(23);
        System.out.println(ArrayQueueModule.element());
        System.out.println(ArrayQueueModule.dequeue());

        System.out.println("\nADT");

        ArrayQueueADT queueADT = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queueADT, 1);
        ArrayQueueADT.enqueue(queueADT, 2);
        ArrayQueueADT.enqueue(queueADT, 3);
        System.out.println(ArrayQueueADT.dequeue(queueADT));
        System.out.println(ArrayQueueADT.dequeue(queueADT));





    }
}
