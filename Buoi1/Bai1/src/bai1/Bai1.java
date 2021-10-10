/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.println("Nhap vao mot so nguyen");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<=0){
            System.out.println("Day la so nguyen am");
        }else{
            System.out.println("Day la so nguyen duong");
        }
    }
    
}
