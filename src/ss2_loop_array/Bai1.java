package ss2_loop_array;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nMenu:"+
            "\n1. Print the rectangle"+
            "\n2. Print the square triangle (bottom-left, top-left, bottom-right, top-right)"+
            "\n3. Print isosceles triangle"+
            "\n4. Exit"+
            "\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter width: ");
                    int width = scanner.nextInt();
                    System.out.print("Enter height: ");
                    int height = scanner.nextInt();

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("--- Square Triangle ---"+
                    "\n1. Bottom-left"+
                    "\n2. Top-left"+
                    "\n3. Bottom-right"+
                    "\n4. Top-right"+
                    "\nChoose corner (1-4): ");
                    int corner = scanner.nextInt();

                    switch (corner) {
                        case 1:
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= 5 - i; j++) {
                                    System.out.print("  ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= 5 - i; j++) {
                                    System.out.print("  ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("lua chon khong hop le!");
                    }
                    break;

                case 3:
                    int heightTri = 5;
                    for (int i = 1; i <= heightTri; i++) {
                        for (int j = 1; j <= heightTri - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Lua chon khong hop le!.");
            }
        }
    }
}