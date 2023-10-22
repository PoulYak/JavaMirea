package Practice23.task2;

public interface Queue<T> {
    public void enqueue(T t); // добавить элемент в очередь
    public T element(); // первый элемент в очереди
    public T dequeue(); // удалить и вернуть первый элемент в очереди
    public int size(); // текущий размер очереди
    public boolean isEmpty(); // является ли очередь пустой
    public void clear(); // удалить все элементы из очереди

}
