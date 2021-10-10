
package NhanVien;

import java.util.Scanner;

public abstract class NhanVien {
    private String hoten;
    private int nam;
    abstract float luong();
    public int  phucap;

    public int getPhucap() {
        return phucap;
    }

    public void setPhucap(int phucap) {
        this.phucap = phucap;
    }

    public NhanVien(String hoten, int nam, int phucap) {
        this.hoten = hoten;
        this.nam = nam;
        this.phucap = phucap;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public NhanVien() {
    }

    public NhanVien(String hoten, int nam) {
        this.hoten = hoten;
        this.nam = nam;
    }
     public void nhap(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap ho ten nhan vien :");
         hoten= sc.nextLine();
         System.out.println("Nhap nam vao lam : ");
         nam= sc.nextInt();
     }
     public void xuat(){
         System.out.println("Ho ten nhan vien :"+hoten);
         System.out.println("Nam vao lam :"+nam);
         System.out.println("luong"+luong());
         System.out.println("Phụ cap :"+phucap);
     }
    
}
