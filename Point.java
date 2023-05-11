public class Point {
    private float x;
    private float y;

    public Point(){
        x = 0.0f;
        y = 0.0f;
    }

    public Point(float x, float y) {
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

    public double getDistance(Point point) {
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




