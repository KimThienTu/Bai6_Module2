public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    // Constructors
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    // Getter and Setter methods
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Move method
    public MovablePoint move() {
        float x = super.getX() + xSpeed;
        float y = super.getY() + ySpeed;
        super.setXY(x, y);
        return this;
    }

    // toString method
    public String toString() {
        return String.format("(%f, %f), speed = (%f, %f)", super.getX(), super.getY(), xSpeed, ySpeed);
    }
}

class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(0.0f, 0.0f, 1.0f, 1.0f);
        System.out.println(point1.toString());
        point1.move();
        System.out.println(point1.toString());

        MovablePoint point2 = new MovablePoint();
        System.out.println(point2.toString());
        point2.setSpeed(2.0f, 2.0f);
        point2.move();
        System.out.println(point2.toString());
    }
}
