package thuc_hanh;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
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
                    studentManager.showList();
                    break;
                case 2:
                    System.out.println("Them Mon");
                    System.out.println("Nhap id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.println("Nhap dia chi: ");
                    String address = sc.nextLine();
                    Student student = new Student(id,name,address);
                    studentManager.add(student);
                    break;
                case 3:
                    System.out.println("Xoa");
                    System.out.println("Nhap id xoa: ");
                    int deletId = Integer.parseInt(sc.nextLine());

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
