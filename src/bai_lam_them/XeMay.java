package bai_lam_them;
public class XeMay extends PhuongTien{
    private int congsuat;

    public XeMay(String bienks, String hang, String namsx, String chush, int congsuat) {
        super(bienks, hang, namsx, chush);
        this.congsuat = congsuat;
    }

    public int getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
    }

    @Override
    public void hienThi() {
        hienThiThongTin();
        System.out.println("Công suất: " + congsuat);

    }
}
