package ss7_abtrs_b1;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        Square s = new Square(5);

        double percent = 20;

        System.out.println("HINH TRON");
        System.out.println("Dien tich truoc: " + c.getArea());
        c.resize(percent);
        System.out.println("Dien tich sau: " + c.getArea());

        System.out.println("-------------------");

        System.out.println("HINH CHU NHAT");
        System.out.println("Dien tich truoc: " + r.getArea());
        r.resize(percent);
        System.out.println("Dien tich sau: " + r.getArea());

        System.out.println("-------------------");

        System.out.println("HINH VUONG");
        System.out.println("Dien tich truoc: " + s.getArea());
        s.resize(percent);
        System.out.println("Dien tich sau: " + s.getArea());
    }
}