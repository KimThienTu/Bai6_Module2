public class Cylinder extends CircleBT{
    private double height;

    public Cylinder(){
        super();
        this.height = 1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}

class CylinderTest{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("Radius is: " + cylinder.getRadius());
        System.out.println("Color is: " + cylinder.getColor());
        System.out.println("Area is: " + cylinder.getArea());
    }
}
