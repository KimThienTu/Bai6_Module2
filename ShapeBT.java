public class ShapeBT {
    private String color;

    public ShapeBT() {
        color = "red";
    }

    public ShapeBT(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    public String toString() {
        return "Shape[color=" + color + "]";
    }
}
