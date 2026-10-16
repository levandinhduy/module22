package ss2_loop_array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("--QUAN LY MON--" +
                    "\n1. Danh Sach" +
                    "\n2. Them Mon" +
                    "\n3. Xoa" +
                    "\n4. Tim Kiem" +
                    "\n5. Thoat");
            System.out.println("---KET THUC---");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    System.out.println("Danh Sach");
                    break;
                case 2:
                    System.out.println("Them Mon");
                    break;
                case 3:
                    System.out.println("Xoa");
                    break;
                case 4:
                    System.out.println("Tim Kiem");
                    break;
                default:
                    flag = false;
            }
        }
        System.out.println("---THOAT---");
    }
}
