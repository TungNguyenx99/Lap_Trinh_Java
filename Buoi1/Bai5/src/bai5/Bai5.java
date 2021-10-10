/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String MSSV;
        System.out.println("Nhập vào MSSV:");
        Scanner sc = new Scanner(System.in);

        MSSV = sc.nextLine();

        if (MSSV.matches("B\\d{7}"))
           System.out.println("Phù hợp");
        else
           System.out.println("Không phù hợp");
    }
    
}
