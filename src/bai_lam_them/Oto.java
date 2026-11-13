package bai_lam_them;

public class Oto extends PhuongTien{
    private String kieuxe;
    private int socho;

    public Oto(String bienks, String hang, String namsx, String chush, String kieuxe, int socho) {
        super(bienks, hang, namsx, chush);
        this.kieuxe = kieuxe;
        this.socho = socho;
    }

    public String getKieuxe() {
        return kieuxe;
    }

    public void setKieuxe(String kieuxe) {
        this.kieuxe = kieuxe;
    }

    @Override
    public void hienThi() {
        hienThiThongTin();
        System.out.println("Kiểu xe: " + kieuxe);
        System.out.println("Số chỗ: " + socho);
    }
}
