package Practice18.task1;

public class task {
    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo(); //Exception in thread "main" java.lang.ArithmeticException: / by zero at
        // Practice18.task1.Exception1.exceptionDemo(Exception1.java:5) at Practice18.task1.task.main(task.java:6)
        // Когда заменили на 2.0 и 0.0 то стала бесконечность
        // На 3м шаге выбросло исключение в catch

    }
}
