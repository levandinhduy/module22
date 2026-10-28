package bai_tap;

public abstract class DanhMuc {
    private String tenSach;
    private String maSach;
    private String nhaXuatBan;
    private int namXuatBan;
    private int soTrang;
    private int soLuong;
    private double giaBan;

    public DanhMuc(String tenSach, String maSach, String nhaXuatBan, double giaBan, int soLuong, int soTrang, int namXuatBan) {
        this.tenSach = tenSach;
        this.maSach = maSach;
        this.nhaXuatBan = nhaXuatBan;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.soTrang = soTrang;
        this.namXuatBan = namXuatBan;
    }

    public abstract double tinhThanhTien ();

    public String getTenSach() {
        return tenSach;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void In(){
        System.out.println("ma sach: "+maSach);
        System.out.println("ten sach: "+tenSach);
        System.out.println("gia ban: "+giaBan);
        System.out.println("so luong: "+soLuong);
        System.out.println("so trang: "+soTrang);
        System.out.println("nha xuat ban: "+nhaXuatBan);
        System.out.println("nam xuat ban: "+namXuatBan);
        System.out.println("thanh tien: "+tinhThanhTien());

    }
}
