package ss3_mang_pt;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {2, 5, 7, 9, 10};
        int n = array.length;

        System.out.println("Nhap X can them: ");
        int x = sc.nextInt();

        int[] newArray = new int[n + 1];

        for (int i = 0; i < n; i++) {
            newArray[i] = array[i];
        }

        newArray[n] = x;

        System.out.println("Mang sau khi them:");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}