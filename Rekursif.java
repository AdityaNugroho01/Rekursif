/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursif;

/**
 *
 * @author user
 */
public class Rekursif {
    
    publik static int faktorial (int n){
        if (n == 0|| n == 1){
            return 1;
            
        }
        else {
            return n * faktorial(n-1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("5! =" + faktorial(5));
        // TODO code application logic here
    }
    
}
