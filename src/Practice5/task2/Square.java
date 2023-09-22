package Practice5.task2;

public class Square extends Shape {
    double a;

    public double getA() {
        return a;
    }

    @Override
    double getArea() {
        return a*a;
    }

    @Override
    double getPerimeter() {
        return 4*a;
    }

    public Square(double a) {
        super();
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    @Override
    public String getType() {
        return "Square";
    }

}
