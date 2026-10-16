package ss2_loop_array;

public class Bai3 {
    public static void main(String[] args) {
        int numbers = 25;
        int count = 0;
        for (int N = 2; N < 100; N++) {
            while (count < numbers) {
                boolean ngto = true;

                for (int i = 2; i < N; i++) {
                    if (N % i == 0) {
                        ngto = false;
                        break;
                    }
                }
                if (ngto) {
                    System.out.print(N + "");
                    count++;
                }
                N++;
            }
        }
    }
}