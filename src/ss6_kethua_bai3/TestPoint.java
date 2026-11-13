package ss6_kethua_bai3;

public class TestPoint {
    public static void main(String[] args) {

        Point p = new Point(3, 4);

        System.out.println("Thong tin Point:");
        System.out.println(p);

        System.out.println("X = " + p.getX());
        System.out.println("Y = " + p.getY());

        System.out.println("--------------------");

        MoveablePoint mp = new MoveablePoint(3, 4, 2, 5);

        System.out.println("Thong tin MovablePoint:");
        System.out.println(mp);

        mp.move();

        System.out.println("Sau khi di chuyen:");
        System.out.println(mp);
    }
}



