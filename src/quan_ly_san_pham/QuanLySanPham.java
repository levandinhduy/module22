package quan_ly_san_pham;

public class QuanLySanPham {
    private SanPham[] sanPhams = new SanPham[100];

    public void showList() {
        for (int i = 0; i < sanPhams.length; i++) {
            if (sanPhams[i] != null) {
                System.out.println(sanPhams[i].getInfo());
            } else {
                break;
            }
        }
    }

    public void add(SanPham sanPham) {
        for (int i = 0; i < sanPhams.length; i++) {
            if (sanPhams[i] == null) {
                sanPhams[i] = sanPham;
                break;
            }
        }
    }

    public boolean delet(int id) {
        for (int i = 0; i < sanPhams.length; i++) {
            if (sanPhams[i] != null
                    && sanPhams[i].getId() == id) {

                sanPhams[i] = null;
                System.out.println("Xoa thanh cong!");
                return true;
            }
        }

        System.out.println("Khong tim thay san pham!");
        return false;
    }



    public void seach(int id){
        for (int i =0; i < sanPhams.length; i++){
            if (sanPhams[i] != null && sanPhams[i].getId() == id){


                System.out.println("tim kiem thanh cong!");
                System.out.println(sanPhams[i].getInfo());
                return;

            }
        }
        System.out.println("ko tim thay san pham!");
    }
}
