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
public class ErrorHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        try{
            n = System.in.read();
        }
        catch(java.io.IOException ex){
            System.out.println(ex);
        }
        System.out.println("Hasil : " +(char) n);
        // TODO code application logic here
    }
    
}
