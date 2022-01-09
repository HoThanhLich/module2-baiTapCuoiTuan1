import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        QuanLySanPham danhSachSanPham[] = new QuanLySanPham[5];
        danhSachSanPham[0] = new QuanLySanPham(1, "Nokia", (short) 3500, "dien thoai");
        danhSachSanPham[1] = new QuanLySanPham(2, "Galaxy", (short) 4000, "dien thoai");
        danhSachSanPham[2] = new QuanLySanPham(3, "IPhone", (short) 6000, "dien thoai");
        danhSachSanPham[3] = new QuanLySanPham(4, "Macbook", (short) 10000, "may tinh");
        danhSachSanPham[4] = new QuanLySanPham(5, "HP ZBook", (short) 8000, "may tinh");

        //hien thi san pham
        System.out.println("Cac san pham: ");
        for (int j = 0; j < danhSachSanPham.length; j++) {
            System.out.println(danhSachSanPham[j].hienThi());
        }

        int luaChon;
        System.out.println("Hay chon mot thao tac:");
        System.out.println("1. them san pham.");
        System.out.println("2. xoa san pham.");
        System.out.println("3. tim kiem san pham.");
        System.out.println("4. Sap xep san pham.");
        System.out.println("6. cap nhat san pham.");
        System.out.println("0. thoat.");

        do {
            luaChon = input.nextInt();
            if (luaChon < 0 || luaChon > 6) {
                System.out.println("vui long chon thao tac phu hop");
            }
        } while (luaChon < 0 || luaChon > 6);

        switch (luaChon) {
            case 0:
                System.out.println(System.out);
            case 1:
                System.out.println("vui long nhap thong tin san pham: ");
                System.out.println("Ten: ");
                String tenSp = input.nextLine();
                System.out.println("Gia: ");
                short giaSp = input2.nextShort();
                System.out.println("Mo ta: ");
                String moTa = input.nextLine();
                QuanLySanPham danhSachSanPhamMoi[] = new QuanLySanPham[danhSachSanPham.length + 1];
                QuanLySanPham sanPhamMoi = new QuanLySanPham(6, tenSp, giaSp, moTa);

                System.out.println("mang moi la: ");
                for (int i = 0; i < danhSachSanPhamMoi.length; i++) {
                    System.out.println(danhSachSanPhamMoi[i].hienThi());
                }
        }
    }
}
