/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] arr={"Không","Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín"};
        int n;
        System.out.println("Nhap vao mot so nguyen");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>9&&n<0){
            System.out.println("Chỉ có 0 đến 9");
        }else{
            System.out.println(arr[n]);
        }
    }
    
}
