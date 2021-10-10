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
public class VietNam extends QlyTienDien{
    private int dinhmuc;
    private String dtsh;
    Scanner sc = new Scanner(System.in);

    public VietNam(int dinhmuc,String dtsh, String mkh, String hoten, int ngay,int thang, int nam, int soluong, double dongia) {
        super(mkh, hoten, ngay,thang, nam, soluong, dongia);
        this.dinhmuc = dinhmuc;
        this.dtsh=dtsh;
    } 
    

    public VietNam() {
        
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public String getDtsh() {
        return dtsh;
    }

    public void setDtsh(String dtsh) {
        this.dtsh = dtsh;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }
    
    @Override
    void nhap(){
        
        super.nhap();
        System.out.println("Nhập đối tượng khách hàng (sinh hoạt, kinh doanh,sản xuất) :");
        dtsh=sc.nextLine();
        System.out.println("Nhập định mức :");
        dinhmuc=sc.nextInt();
        
    }
    public void xuatDL(){
        if(super.getThang()==9&& super.getNam()==2013){
            System.out.printf("%-15s %-15s %d %d %d %15d %15f %15d %15s %15s %15f %n",super.getMkh(),super.getHoten(),super.getNgay(),super.getThang(),super.getNam(),super.getSoluong(),super.getDongia(),dinhmuc,dtsh,"Việt Nam",Tongtien()); 
        }
     }
    public void xuatDLL(){
        
        System.out.printf("%-15s %-15s %d %d %d %15d %15f %15d %15s %15s %15f %n",super.getMkh(),super.getHoten(),super.getNgay(),super.getThang(),super.getNam(),super.getSoluong(),super.getDongia(),dinhmuc,dtsh,"Việt Nam",Tongtien()); 
        
     }
    @Override
    double Tongtien() {
        if(super.getSoluong()<=dinhmuc){
            return super.getSoluong()*super.getDongia();
        }else 
            return dinhmuc * super.getDongia() + (super.getSoluong()-dinhmuc) * super.getDongia() * 2.5;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
