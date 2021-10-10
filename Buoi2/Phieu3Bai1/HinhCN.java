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
public class HinhCN extends HinhPhang{
    private float n, m;

    public HinhCN() {
    }

    public HinhCN(float n, float m) {
        this.n = n;
        this.m = m;
    }

    public float getN() {
        return n;
    }

    public void setN(float n) {
        this.n = n;
    }

    public float getM() {
        return m;
    }

    public void setM(float m) {
        this.m = m;
    }
    @Override
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập độ dài chieu dai :");
        n = sc.nextFloat();
        System.out.println("Nhập độ dài chieu rong :");
        m = sc.nextFloat();
    }
    @Override
    public void xuat(){
        System.out.println("Chu vi hinh chu nhat :"+TinhChuVi());
        
        System.out.println("Dien tich hinh chu nhat : "+TinhDienTich());
        
        
    }

    @Override
    double TinhChuVi() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return (m+n)*2;
    }

    @Override
    double TinhDienTich() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return m*n;
    }
    
}
