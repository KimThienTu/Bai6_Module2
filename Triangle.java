import java.util.Scanner;

public class Triangle extends ShapeBT {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {}

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle[side1=" + side1 + ",side2=" + side2 + ",side3=" + side3 + "]";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = scanner.nextDouble();
        System.out.print("Enter color: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        System.out.println("Color: " + triangle.getColor());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}