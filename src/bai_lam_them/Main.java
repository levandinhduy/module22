package bai_lam_them;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyPhuongTien quanLyPhuongTien = new QuanLyPhuongTien();
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("--QUAN LY PHUONG TIEN--" +
                    "\n1. Danh Sach" +
                    "\n2. Them" +
                    "\n3. Xoa" +
                    "\n4. Tim Kiem" +
                    "\n5. Thoat");

            System.out.println("---KET THUC---");

            int choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Danh Sach Phuong Tien");
                    quanLyPhuongTien.showList();
                    break;

                case 2:
                    System.out.println("Them Phuong Tien");
                    System.out.println("1. Xe Tai");
                    System.out.println("2. Oto");
                    System.out.println("3. Xe May");

                    System.out.print("Chon loai phuong tien: ");
                    int loai = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhap bien kiem soat: ");
                    String bienks = sc.nextLine();

                    System.out.print("Nhap hang san xuat: ");
                    String hang = sc.nextLine();

                    System.out.print("Nhap nam san xuat: ");
                    String namsx = sc.nextLine();

                    System.out.print("Nhap chu so huu: ");
                    String chush = sc.nextLine();

                    if (loai == 1) {
                        System.out.print("Nhap trong tai: ");
                        double trongTai = Double.parseDouble(sc.nextLine());

                        XeTai xeTai = new XeTai(bienks, hang, namsx, chush, trongTai);
                        quanLyPhuongTien.add(xeTai);

                    } else if (loai == 2) {
                        System.out.print("Nhap kieu xe: ");
                        String kieuXe = sc.nextLine();

                        System.out.print("Nhap so cho ngoi: ");
                        int soCho = Integer.parseInt(sc.nextLine());

                        Oto oto = new Oto(bienks, hang, namsx, chush, kieuXe, soCho);
                        quanLyPhuongTien.add(oto);

                    } else if (loai == 3) {
                        System.out.print("Nhap cong suat: ");
                        int congSuat = Integer.parseInt(sc.nextLine());

                        XeMay xeMay = new XeMay(bienks, hang, namsx, chush, congSuat);
                        quanLyPhuongTien.add(xeMay);

                    } else {
                        System.out.println("Loai phuong tien khong hop le!");
                    }
                    break;

                case 3:
                    System.out.println("Xoa Phuong Tien");
                    System.out.print("Nhap bien kiem soat can xoa: ");
                    String deletBien = sc.nextLine();

                    quanLyPhuongTien.delet(deletBien);
                    break;

                case 4:
                    System.out.println("Tim Kiem Phuong Tien");
                    System.out.print("Nhap bien kiem soat can tim: ");
                    String seachBien = sc.nextLine();

                    quanLyPhuongTien.seach(seachBien);
                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }

        System.out.println("---THOAT---");
    }
}



