package Practice12.task1;

public class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    double a;
    double b;
    @Override
    double getArea() {
        return a*b;
    }

    @Override
    double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}
