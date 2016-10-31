/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check_divisible;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Check_divisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num=input.nextInt();
        
       
        System.out.println("Is 10 divisible by 5 and 6? "+(num%5==0&&num%6==0));
        System.out.println("Is 10 divisible by 5 and 6? "+(num%5==0||num%6==0));
        System.out.println("Is 10 divisible by 5 and 6,but not both? "+(num%5==0^num%6==0));
        
    }
    
}
