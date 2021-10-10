/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phieu3Bai2;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public abstract class QlyTienDien {
    Scanner sc = new Scanner(System.in);
    public String mkh;
    public String hoten;
    public int ngay;
    public int thang;
    public int nam;
    public int soluong;
    public double dongia;

    public String getMkh() {
        return mkh;
    }

    public void setMkh(String mkh) {
        this.mkh = mkh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public QlyTienDien(String mkh, String hoten, int ngay, int thang, int nam, int soluong, double dongia) {
        this.mkh = mkh;
        this.hoten = hoten;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    
   
    public QlyTienDien(){
    
    }
    
     void nhap(){
        System.out.println("Nhập mã khách hàng :");
        mkh = sc.nextLine();
        System.out.println("Nhập họ tên khách hàng :");
        hoten = sc.nextLine();
        System.out.println("Nhập ngày xuất đơn :");
        ngay = sc.nextInt();
        System.out.println("Nhập tháng xuất đơn :");
        thang = sc.nextInt();
        System.out.println("Nhập năm xuất đơn :");
        nam = sc.nextInt();
        System.out.println("Nhập số lượng tiêu thụ :");
        soluong = sc.nextInt();
        System.out.println("Nhập đơn giá :");
        dongia = sc.nextDouble();
    }
    abstract double Tongtien();

    @Override
    public String toString() {
        return "QlyTienDien{" + "sc=" + sc + ", mkh=" + mkh + ", hoten=" + hoten + ", ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + ", soluong=" + soluong + ", dongia=" + dongia + '}';
    }

   
    
}
