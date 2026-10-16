package ss3_mang_pt;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {2, 5, 7, 9, 10};
        int n = array.length;

        System.out.print("Nhap X can xoa: ");
        int x = sc.nextInt();

        int index_del = -1;

        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }

        if (index_del != -1) {
            for (int i = index_del; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            System.out.println("Mang sau khi xoa:");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
        else
        {
            System.out.println("Khong tim thay X trong mang!");
        }

    }
}