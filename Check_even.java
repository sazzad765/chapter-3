/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check_even;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Check_even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num=input.nextInt();
        
        System.out.println("Is "+num+" an even number? "+(num%2==0));
    }
    
}
