package ss2_loop_array;

public class Bai2 {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int N = 2;

        while (count < numbers) {
            boolean ngto = true;

            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    ngto = false;
                    break;
                }
            }
            if (ngto) {
                System.out.print(N+ "");
                count++;
            }
            N++;
        }
    }
}
