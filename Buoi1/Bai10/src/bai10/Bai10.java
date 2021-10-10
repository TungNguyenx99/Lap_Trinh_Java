/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] MSSV = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
           System.out.println("Nhập vào MSSV thứ " + (i+1) + ":");
           MSSV[i] = sc.nextLine();
        }

        for (int i = 0; i < 5; i++)
        {
           if (!MSSV[i].matches("B170[1-9]{4}"))
              System.out.println("MSSV thứ " + (i+1) + " sai định dạng!");
        }
    }
}
