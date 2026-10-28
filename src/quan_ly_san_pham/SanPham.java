package quan_ly_san_pham;

public class SanPham {
    int id;
    String name;
    int price;
    public SanPham() {

    }
    public SanPham(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getInfo(){
        return "id: "+this.id + ", name: "+this.name +", price: "+this.price;
    }
}

