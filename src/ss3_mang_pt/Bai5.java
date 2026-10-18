package ss3_mang_pt;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int SIZE;

        System.out.print("Nhap so phan tu cua mang: ");
        SIZE = sc.nextInt();

        int[] array = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        int min = array[0];

        for (int i = 1; i < SIZE; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Gia tri nho nhat trong mang: " + min);
    }
}
