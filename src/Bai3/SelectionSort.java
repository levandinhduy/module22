
package Bai3;

import ss4_class.Stopwatch;

public class SelectionSort {

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        int n = 100000;
        int[] a = new int[n];



        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        stopwatch.stop();

        System.out.println("tho igian : "+ stopwatch.getElapsedTime());
    }
}

