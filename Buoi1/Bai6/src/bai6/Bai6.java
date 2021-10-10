/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int sum=0;
        System.out.println("Nhap vao mot so nguyen");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>0){
            for(int i=0;i<=n;i++){
                if(i%2==0){
                    sum+=i;
                }
            }
            System.err.println(sum);
        }else{
            System.err.println("Số vừa nhập nhỏ hơn 0");
        }
    }
    
}
