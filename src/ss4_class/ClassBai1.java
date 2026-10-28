
package ss4_class;

public class ClassBai1 {
    private double a;
    private double b;
    private double c;

    public ClassBai1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public void giaipt() {
        double delta = getDiscriminant();

        if (delta > 0) {
            System.out.println("Root 1: " + getRoot1());
            System.out.println("Root 2: " + getRoot2());
        } else if (delta == 0) {
            System.out.println("Root: " + (-b / (2 * a)));
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
