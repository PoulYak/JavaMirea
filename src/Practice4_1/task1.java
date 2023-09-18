package Practice4_1;

class Shape{

    public Shape() {
    }

    double getArea(){
        return 0;
    }

    double getPerimeter() {
        return 0;
    }

    public String getType() {
        return "Shape";
    }

    @Override
    public String toString() {
        return "Shape{}";
    }
}

class Circle extends Shape {
    public String only(){
        return "dasd";
    }
    public Circle(double r) {
        super();
        this.r = r;
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

class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        super();
        this.a = a;
        this.b = b;
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


class Square extends Shape {


    double a;

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


class Tester3{
    public static void main(String[] args) {
        Shape shape = new Circle(12);
        System.out.println(shape);

    }
}