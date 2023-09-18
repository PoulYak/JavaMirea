package Practice2;

class TestCircle{
    public static void main(String[] args) {
        Circle2 cir1 = new Circle2(1.0, 2.0, 5);
        Circle2 cir2 = new Circle2(3.0, 4.0, 6);
        System.out.println(cir2.isGreaterThan(cir1));
    }
}

class Circle2{
    private double x, y, radius;

    public double getX() {
        return x;
    }

    public Circle2(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return Math.PI*radius;
    }

    public boolean isGreaterThan(Circle2 circle2){
        if (radius>= circle2.radius)
            return true;
        return false;
    }
}