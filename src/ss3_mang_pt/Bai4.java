package ss3_mang_pt;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;

        System.out.print("Nhap so dong: ");
        n = sc.nextInt();

        System.out.print("Nhap so cot: ");
        m = sc.nextInt();

        double[][] array = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = sc.nextDouble();
            }
        }

        double max = array[0][0];
        int dong = 0;
        int cot = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    dong = i;
                    cot = j;
                }
            }
        }

        System.out.println("Gia tri lon nhat: " + max);
        System.out.println("Toa do: [" + dong + "][" + cot + "]");
    }
}
