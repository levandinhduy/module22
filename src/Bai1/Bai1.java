
package Bai1;

import ss4_class.ClassBai1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        ClassBai1 pt = new ClassBai1(a, b, c);

        pt.giaipt();


    }
}

