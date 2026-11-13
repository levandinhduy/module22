package ss7_abtrs_b2;
public class Main {
    public static void main(String[] args) {

        Square[] shapes = new Square[3];

        shapes[0] = new Square(5);
        shapes[1] = new Square(4);
        shapes[2] = new Square(6);

        for (int i = 0; i < 3; i++) {
            System.out.println("Dien tich: " + shapes[i].getArea());

            shapes[i].howToColor();
        }
    }
}
