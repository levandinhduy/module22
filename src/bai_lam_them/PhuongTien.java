package bai_lam_them;

public abstract class PhuongTien{
    private String bienks;
    private String hang;
    private String namsx;
    private String chush;

    public PhuongTien() {
    }

    public PhuongTien(String bienks, String hang, String namsx, String chush) {
        this.bienks = bienks;
        this.hang = hang;
        this.namsx = namsx;
        this.chush = chush;
    }

    public void hienThiThongTin() {
        System.out.println("Biển số: " + bienks);
        System.out.println("Hãng: " + hang);
        System.out.println("Năm sản xuất: " + namsx);
        System.out.println("Chủ sở hữu: " + chush);
    }

    public String getBienks() {
        return bienks;
    }

    public void setBienks(String bienks) {
        this.bienks = bienks;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNamsx() {
        return namsx;
    }

    public void setNamsx(String namsx) {
        this.namsx = namsx;
    }

    public String getChush() {
        return chush;
    }

    public void setChush(String chush) {
        this.chush = chush;
    }

    public abstract void hienThi();
}

