import java.lang.String;
public class QuanLySanPham {
    private int id;
    private String name;
    private short price;
    private String description;

    public QuanLySanPham() {
    }

    public QuanLySanPham(int id, String name, short price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
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

    public void setPrice(short price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // hien thi thong tin san pham
    public String hienThi() {
        return this.id + ". " + this.name +", "+ this.price + ", "+ this.description + ".";
    }
}
