public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        super(); // Gọi đến constructor của lớp cha Point2D
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y); // Gọi đến constructor của lớp cha Point2D
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y); // Gọi đến phương thức setXY() của lớp cha Point2D
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] { super.getX(), super.getY(), this.z };
    }

    @Override
    public String toString() {
        return String.format("(%f,%f,%f)", super.getX(), super.getY(), this.z);
    }
}

class TestPoint3D{
    public static void main(String[] args) {
        Point3D p3d1 = new Point3D();
        System.out.println(p3d1);

        Point3D p3d2 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(p3d2);

        p3d1.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println(p3d1);

        System.out.println("x = " + p3d2.getX());
        System.out.println("y = " + p3d2.getY());
        System.out.println("z = " + p3d2.getZ());
        float[] xyz = p3d2.getXYZ();
        System.out.println("x = " + xyz[0]);
        System.out.println("y = " + xyz[1]);
        System.out.println("z = " + xyz[2]);
    }
}
