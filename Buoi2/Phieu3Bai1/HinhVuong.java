/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phieu3Bai1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HinhVuong extends HinhPhang{
    private float canh;

    public HinhVuong(float canh) {
        this.canh = canh;
    }
    public HinhVuong() {
       
    }

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }
    
    @Override
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh :");
        canh = sc.nextFloat();
        
    }
    @Override
    public void xuat(){
        System.out.println("Chu vi hinh chu nhat :"+TinhChuVi());
        
        System.out.println("Dien tich hinh chu nhat : "+TinhDienTich());
        
        
    }
    @Override
    double TinhChuVi() {
        return canh*4;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double TinhDienTich() {
        return canh*canh;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
