package Practice23.task2;

public class task {

    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        System.out.println(linkedQueue.element());
        System.out.println(linkedQueue.dequeue());
    }

}
