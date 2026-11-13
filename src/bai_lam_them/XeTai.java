package bai_lam_them;

public class XeTai extends PhuongTien{
    private double taitrong;

    public XeTai(String bienks, String hang, String namsx, String chush, double taitrong) {
        super(bienks, hang, namsx, chush);
        this.taitrong = taitrong;
    }

    public double getTaitrong() {
        return taitrong;
    }

    public void setTaitrong(double taitrong) {
        this.taitrong = taitrong;
    }

    @Override
    public void hienThi() {
        hienThiThongTin();
        System.out.println("Trọng tải: " + taitrong);
    }
}
