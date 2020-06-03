/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error.handling;

/**
 *
 * @author MAKAROV-16
 */
public class Newbie {
    public static void main(String[] args){
        int a=7; int b=8; int c=9;
        try{
            c=a/b;
        } catch(ArithmeticException e){
            System.out.println("Hasil : " + a + " " + b + " " + c);
        }
    }
}
    
