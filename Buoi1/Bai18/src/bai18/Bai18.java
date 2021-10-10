/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai18;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String chuoi;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi: ");
        chuoi = sc.nextLine();

        if (chuoi.matches(".*\\d.*"))
           System.out.println("Có");
        else
           System.out.println("Không");
    }
    
}
