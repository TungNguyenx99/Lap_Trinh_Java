/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai15;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] code = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
           System.out.println("Nhập vào mã thứ " + (i+1));
           code[i] = sc.nextLine();
           if(!code[i].matches("00[2-5]L\\d{4}"))
           {
              System.out.println("Sai rồi!");
              return;
           }
        }
        System.out.println("Đúng rồi!");
    }
    
}
