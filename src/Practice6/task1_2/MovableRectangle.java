package Practice6.task1_2;


public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public boolean isEqualSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed;
    }

    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1, 2, 3, 4, 1, 1);
        System.out.println(rectangle);
        rectangle.moveDown();
        System.out.println(rectangle);
        System.out.println(rectangle.isEqualSpeed());
    }
}
