package ss4_class;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai1 {
    private double a;
    private double b;
    private double c;

    public Bai1(double a, double b, double c) {
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

    public double calculate() {
        return b * b - 4 * a*c;
    }
    public double calculate1() {
        double delta = calculate();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta) / (2 * a));
        }
        return 0;
    }
    public double calculate2() {
        double delta = calculate();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta) / (2 * a));
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a,b,c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Bai1 bai1 = new Bai1(a, b, c);
        double delta = bai1.calculate();
        if (delta >= 0) {

        }



    }
}
