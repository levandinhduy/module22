package bai_lam_them;

public class QuanLyPhuongTien {
    private PhuongTien[] phuongTiens = new PhuongTien[100];

    public void showList() {
        for (int i = 0; i < phuongTiens.length; i++) {
            if (phuongTiens[i] != null) {
                phuongTiens[i].hienThi();
            } else {
                break;
            }
        }
    }

    public void add(PhuongTien phuongTien) {
        for (int i = 0; i < phuongTiens.length; i++) {
            if (phuongTiens[i] == null) {
                phuongTiens[i] = phuongTien;
                System.out.println("Them thanh cong!");
                return;
            }
        }
    }

    public boolean delet(String bienks) {
        for (int i = 0; i < phuongTiens.length; i++) {
            if (phuongTiens[i] != null
                    && phuongTiens[i].getBienks().equalsIgnoreCase(bienks)) {

                phuongTiens[i] = null;
                System.out.println("Xoa thanh cong!");
                return true;
            }
        }

        System.out.println("Khong tim thay phuong tien!");
        return false;
    }

    public void seach(String bienks) {
        for (int i = 0; i < phuongTiens.length; i++) {
            if (phuongTiens[i] != null
                    && phuongTiens[i].getBienks().equalsIgnoreCase(bienks)) {

                System.out.println("Tim kiem thanh cong!");
                phuongTiens[i].hienThi();
                return;
            }
        }

        System.out.println("Khong tim thay phuong tien!");
    }
}

