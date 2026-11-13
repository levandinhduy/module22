package ss6_kethua_bai2;

public class TestPoint2d {
    public static void main(String[] args) {

        Point2d point2d = new Point2d();
        System.out.println(point2d);

        Point2d point2d1 = new Point2d(3.5f, 4.5f);
        System.out.println(point2d1);

        point2d1.setXY(5.0f, 6.0f);
        System.out.println(point2d1);

        float[] xy =  point2d1.getXY();

        System.out.println("X = " + xy[0]);
        System.out.println("Y = " + xy[1]);
    }
}

