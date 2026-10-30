package ss5_static_bai1;

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println("Hinh tron 1:");
        System.out.println("Ban kinh: " + c1.getRadius());
        System.out.println("Dien tich: " + c1.getArea());

        System.out.println("\nHinh tron 2:");
        System.out.println("Ban kinh: " + c2.getRadius());
        System.out.println("Dien tich: " + c2.getArea());
    }
}