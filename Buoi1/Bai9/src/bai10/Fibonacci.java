/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author TungNguyen
 */
class Fibonacci {
    public int CalculateFi(int n)
    {
        if (n == 0 || n == 1){
            return 1;
        } 
        return CalculateFi(n-1) + CalculateFi(n-2);
    }
}
