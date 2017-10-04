/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author WARNECHA001
 */
import java.util.Scanner;
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("How old are you?");
        Scanner var1 = new Scanner(System.in);
        int user = var1.nextInt();
       // int 
        if (user <= 18) {
            System.out.println("You are a little younge arentya");
    
}
        else if (user > 18 && user < 40){
            System.out.println("You are an adult!");
    
}
        else {
            System.out.println("getting ready to die?");
        }    
    
    }
    
}
