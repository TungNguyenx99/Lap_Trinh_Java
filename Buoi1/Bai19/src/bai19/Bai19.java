/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai19;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String chuoi;
        int soLan = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi: ");
        chuoi = sc.nextLine();

        char mangKiTu[] = chuoi.toCharArray();
        for (int i = 0; i < mangKiTu.length; i++)
        {
           if ('a' == mangKiTu[i])
           {
              soLan++;
           }
        }
        System.out.println(soLan);
    }
    
}
