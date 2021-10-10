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
public class HinhTron extends HinhPhang{
    private float bankinh;

    public HinhTron() {
       
    }
    public HinhTron(float bankinh) {
        this.bankinh = bankinh;
    }

    public float getBankinh() {
        return bankinh;
    }

    public void setBankinh(float bankinh) {
        this.bankinh = bankinh;
    }
    
    @Override
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập bán kính :");
        bankinh = sc.nextFloat();
        
    }
    @Override
    public void xuat(){
        System.out.println("Chu vi hinh chu nhat :"+TinhChuVi());
        
        System.out.println("Dien tich hinh chu nhat : "+TinhDienTich());
        
        
    }
    @Override
    double TinhChuVi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return bankinh*2*Math.PI;
    }

    @Override
    double TinhDienTich() {
        return Math.pow(bankinh,2)*Math.PI;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
