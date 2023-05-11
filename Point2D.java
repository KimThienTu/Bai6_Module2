public class Point2D {
    private float x;
    private float y;

    public Point2D(){
        x = 0.0f;
        y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{x,y};
    }

    public double getDistance(Point2D point) {
        float dx = x - point.x;
        float dy = y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Point2DTest{
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(3.0f, 4.0f);
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        p1.setX(1.0f);
        p1.setY(2.0f);
        System.out.println("Tọa độ mới của điểm 1 là: " + p1);

        p1.setXY(5.0f,6.0f);
        System.out.println("Tọa độ mới của điểm 1 là: " + p1);

        float[] xy = p2.getXY();
        System.out.println("Tọa đô của điểm 2 là: (" + xy[0] + ", " + xy[1] + ")");
        System.out.println("Khoảng cách giữa điểm 1 và điểm 2: " + p1.getDistance(p2));
    }
}



