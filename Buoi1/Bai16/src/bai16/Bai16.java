/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai16;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String chuoi;
        char kiTu;
        boolean tonTai = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi: ");
        chuoi = sc.nextLine();
        System.out.println("Nhập vào ký tự muốn kiểm tra:");
        kiTu = sc.nextLine().charAt(0);

        char mangKiTu[] = chuoi.toCharArray();
        for (int i = 0; i < mangKiTu.length; i++)
        {
           if (kiTu == mangKiTu[i])
           {
              System.out.println("Có");
              tonTai = true;
           }
        }
        if(tonTai == false)
        System.out.println("Không");
    }
    
}
