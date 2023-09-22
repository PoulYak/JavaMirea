package Practice5.task2;

public class Circle extends Shape {
    public String only(){
        return "dasd";
    }
    public Circle(double r) {
        super();
        this.r = r;
    }

    public double getR() {
        return r;
    }

    double r;
    @Override
    double getArea() {
        return Math.PI*r*r;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    public String getType() {
        return "Circle";
    }
}

