/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phieu3Bai2;

/**
 *
 * @author ADMIN
 */
public class NuocNgoai extends QlyTienDien {
    private String quoctich;

    public NuocNgoai(String quoctich, String mkh, String hoten, int ngay, int thang, int nam, int soluong, double dongia) {
        super(mkh, hoten, ngay, thang, nam, soluong, dongia);
        this.quoctich = quoctich;
    }

    public NuocNgoai() {
        
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }
    
    @Override
    void nhap(){
        
        super.nhap();
        
        System.out.println("Nhập quốc tịch :");
        quoctich=sc.nextLine();
    }
    @Override
    double Tongtien() {
        return super.getSoluong()*super.getDongia();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void xuatDL(){
         System.out.printf("%-15s %-15s %d %d %d %15d %15f %15d %15d %15s %15f %n",super.getMkh(),super.getHoten(),super.getNgay(),super.getThang(),super.getNam(),super.getSoluong(),super.getDongia(),0,0,quoctich,Tongtien()); 

     }
}
