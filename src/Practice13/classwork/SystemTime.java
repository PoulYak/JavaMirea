package Practice13.classwork;

public class SystemTime {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
// ... the code being measured ...
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
    }
}
