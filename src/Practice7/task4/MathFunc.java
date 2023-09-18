package Practice7.task4;

public class MathFunc implements MathCalculable {

    public MathFunc() {
    }

    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        System.out.println(mc.abs(2, 2));
        int R = 10;
        System.out.println(2*PI*R);
    }

    @Override
    public double pow(int a, int n) {
        return Math.pow(a, n);
    }

    @Override
    public double abs(double real, double im) {
        return Math.sqrt(real*real+im*im);
    }

}
