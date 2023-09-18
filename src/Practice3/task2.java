package Practice3;

import java.util.Arrays;

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

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Circle implements Comparable<Circle>{
    @Override
    public String toString() {
        return "Circle{" +
                "centerOfCircle=" + centerOfCircle +
                ", radius=" + radius +
                '}';
    }

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


    @Override
    public int compareTo(Circle o) {
        if (this.radius>o.radius)
            return 1;
        else if (this.radius<o.radius)
            return -1;
        else
            return 0;

    }
}

class Tester{
    Circle[] circles;
    int amountOfItems = 0;

    public Tester(Circle[] circles, int amountOfItems) {
        this.circles = circles;
        this.amountOfItems = amountOfItems;
    }

    public Circle getSmallest(){
        if (circles.length==0)
            return null;
        Circle c = circles[0];
        for (int i=1; i<circles.length; i++){
            if (c.getRadius()<circles[i].getRadius())
                c = circles[i];
        }
        return c;
    }

    public Circle getLargest(){
        if (circles.length==0)
            return null;
        Circle c = circles[0];
        for (int i=1; i<circles.length; i++){
            if (c.getRadius()>circles[i].getRadius())
                c = circles[i];
        }
        return c;
    }

    public void sort(){
        Arrays.sort(circles);
    }
    public static void main(String[] args) {
        int n = 10;
        Circle[] mass = new Circle [n];
        for (int i=0; i<n; i++){
            mass[i] = new Circle(new Point(Math.random(), Math.random()), Math.random());
        }
        System.out.println(Arrays.toString(mass));
        Tester t = new Tester(mass, n);
        t.sort();
        System.out.println(Arrays.toString(mass));

    }
}
