    package quan_ly_san_pham;

    import thuc_hanh.Student;
    import thuc_hanh.StudentManager;

    import java.util.Scanner;

    public class RunSanPham {
        public static void main(String[] args) {
            SanPham sanPham = new SanPham();
            QuanLySanPham quanLySanPham = new QuanLySanPham();
            Scanner sc = new Scanner(System.in);
            boolean flag = true;
            while(flag){
                System.out.println("--QUAN LY SAN PHAM--" +
                        "\n1. Danh Sach" +
                        "\n2. Them" +
                        "\n3. Xoa" +
                        "\n4. Tim Kiem" +
                        "\n5. Thoat");
                System.out.println("---KET THUC---");
                int choose = Integer.parseInt(sc.nextLine());
                switch(choose){
                    case 1:
                        System.out.println("Danh Sach");
                        quanLySanPham.showList();
                        break;
                    case 2:
                        System.out.println("Them Mon");
                        System.out.println("Nhap id: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println("Nhap ten: ");
                        String name = sc.nextLine();
                        System.out.println("Nhap gia tien: ");
                        int price = Integer.parseInt(sc.nextLine());
                        SanPham sp = new SanPham(id,name,price);
                        quanLySanPham.add(sp);
                        break;
                    case 3:
                        System.out.println("Xoa");
                        System.out.println("Nhap id xoa: ");
                        String deletId = sc.nextLine();
                        quanLySanPham.delet(Integer.parseInt(deletId));
                        break;
                    case 4:
                        System.out.println("Tim Kiem");
                        System.out.println("Nhap id can tim");
                        int seachId = Integer.parseInt(sc.nextLine());
                        quanLySanPham.seach(seachId);
                        break;

                    default:
                        flag = false;
                }
            }
            System.out.println("---THOAT---");
        }
    }


