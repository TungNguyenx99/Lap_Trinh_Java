/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phieu3Bai2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DEMO {
    
    static  VietNam ds1[];
    static  NuocNgoai ds2[];
    static  int n,m;
    public static void nhap(){
        System.out.println("Nhap số khách hàng việt nam muốn nhập :");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        ds1= new VietNam[n];
        for(int i= 0; i< n; i++){
            ds1[i] = new VietNam();
            ds1[i].nhap();
        }
        
        System.out.println("Nhap số khách hàng nước ngoài muốn nhập :");
      
        m = sc.nextInt();
        ds2= new NuocNgoai[m];
        for(int i= 0; i< m; i++){
            ds2[i] = new NuocNgoai();
            ds2[i].nhap();
        }
    }
    
    public static void inDS(){
        System.out.printf("%-15s %-15s %15s %15s %15s %15s %15s %15s %15s %n","Mã khách hàng","Họ tên","Ngày tháng năm","số lượng","đơn giá","định mức","đối tượng","quốc tịch","Tổng tiền");
        for(VietNam vn: ds1){
            vn.xuatDLL();
        }
        for(NuocNgoai nn: ds2){
            nn.xuatDL();
        }
    }
    
    public static void inDSL(){
        System.out.printf("%-15s %-15s %15s %15s %15s %15s %15s %15s %15s %n","Mã khách hàng","Họ tên","Ngày tháng năm","số lượng","đơn giá","định mức","đối tượng","quốc tịch","Tổng tiền");
        for(VietNam vn: ds1){
            vn.xuatDL();
        }
    }
    public static void main(String[] args) {
        nhap();
        inDS();
        System.out.println("Danh sách đơn hàng trong tháng 9 năm 2013");
        inDSL();
    }
}
