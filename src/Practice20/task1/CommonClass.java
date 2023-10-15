package Practice20.task1;

public class CommonClass<T, E, K> {
    T t;
    E e;
    K k;

    public CommonClass(T t, E e, K k) {
        this.t = t;
        this.e = e;
        this.k = k;
    }

    @Override
    public String toString() {
        return "CommonClass{" +
                "t=" + t +
                ", e=" + e +
                ", k=" + k +
                '}';
    }

    public static void main(String[] args) {
        int a = 22;
        String b="hello ";
        Object c = new Object();
        CommonClass<Integer, String, Object> commonClass = new CommonClass<>(a,b,c);
        System.out.println(commonClass);
    }
}
