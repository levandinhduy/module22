package ss6_kethua_bai1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("thong tin hinh tron");
        System.out.println(circle);

        circle.setRadius(5);
        circle.setColor("Blue");

        System.out.println("\nSau khi thay doi:");
        System.out.println(circle);

        Circle circle2 = new Circle(7, "Yellow");

        System.out.println("\nHinh tron thu 2:");
        System.out.println(circle2);
    }
}
