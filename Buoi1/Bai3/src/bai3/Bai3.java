/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a, b, c;
        System.out.println("Nhập vào 3 số:");
        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        if(a>0&&b>0&&c>0){
            if(a+b>c && b+c>a && c+a>b)
                System.out.println("Ba số đúng là 3 cạnh của 1 tam giác");
            else
                System.out.println("Ba số không phải là 3 cạnh của 1 tam giác");
        }else{
            System.out.println("Ba cạch của tam giác phải lớn hơn 0");
        }
        
    }
}

