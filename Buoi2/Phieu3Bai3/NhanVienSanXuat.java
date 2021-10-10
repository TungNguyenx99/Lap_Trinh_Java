
package NhanVien;

import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien{
    private int sanpham,namht;

    public int getNamht() {
        return namht;
    }

    public void setNamht(int namht) {
        this.namht = namht;
    }
    
    public NhanVienSanXuat() {
    }

    public int getSanpham() {
        return sanpham;
    }

    public void setSanpham(int sanpham) {
        this.sanpham = sanpham;
    }

    public NhanVienSanXuat(String hoten, int nam,int phucap, int sanpham, int namht) {
        super(hoten, nam,phucap);
        this.sanpham=sanpham;
        this.namht=namht;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap san pham");
        sanpham= sc.nextInt();
        System.out.println("Nhap nam hien tai");
        namht= sc.nextInt();
        
        
    }
    @Override
    public void xuat(){
        
        int namct=namht-super.getNam();
        super.xuat();
        if( (namct)==1){
            System.out.println("Phu cap la 100000");
        }else{
            int pc=0;
            for(int i=1; i<namct; i++){
                pc+= i*100000;
                
            }System.out.println("phu cap la"+pc);
        }
        
    }
   
    @Override
    float luong() {
        return sanpham*10000;
    }
    
}
