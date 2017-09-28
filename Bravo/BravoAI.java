/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Larry
 */
import java.util.Scanner;
public class BravoAI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give me a number.");
        Scanner var1 = new Scanner(System.in);
        float num1 = var1.nextFloat();
        System.out.println("next number");
        Scanner var2 = new Scanner(System.in);
        float num2 = var2.nextFloat();
        float num3 = num1 * num2;
        System.out.println("The anwser is " + num3);
    }
    
}
