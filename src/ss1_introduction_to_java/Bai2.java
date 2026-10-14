package ss1_introduction_to_java;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = 23000;
        double vnd;
        double usd;
        System.out.print("Nhap so usd: ");
        usd = sc.nextDouble();
        vnd = usd * rate;
        System.out.println("Nhap so tien vnd: " + vnd);

    }
}
