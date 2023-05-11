public class CircleBT {
    private double radius;
    private String color;

    public CircleBT(){
        this.radius = 1.0;
        this.color = "red";
    }

    public CircleBT(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public CircleBT(double radius, String color) {
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "CircleBT{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

class CircleBTTest{
    public static void main(String[] args) {
        CircleBT c1 = new CircleBT();
        System.out.println(c1);

        CircleBT c2 = new CircleBT(2.0);
        System.out.println(c2);

        CircleBT c3 = new CircleBT(3.0);
        System.out.println(c3);

        c1.setRadius(4.0);
        c1.setColor("green");
        System.out.println(c1);

        System.out.println("Radius is: " + c1.getRadius());
        System.out.println("Color is: " + c1.getColor());
        System.out.println("Area is: " + c1.getArea());
    }
}
