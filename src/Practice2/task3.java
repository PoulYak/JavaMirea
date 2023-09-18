package Practice2;



class Point {
    double x = 0.0;
    double y = 0.0;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Circle{
    Point centerOfCircle;
    double radius = 0.0;

    public Circle(Point centerOfCircle, double radius) {
        this.centerOfCircle = centerOfCircle;
        this.radius = radius;
    }

    public Point getCenterOfCircle() {
        return centerOfCircle;
    }

    public void setCenterOfCircle(Point centerOfCircle) {
        this.centerOfCircle = centerOfCircle;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class Tester{
    Circle[] circles;
    int amountOfItems = 0;


    public Tester(Circle[] circles, int amountOfItems) {
        this.circles = circles;
        this.amountOfItems = amountOfItems;
    }

}
