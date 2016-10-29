/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_statement;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class If_statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num= input.nextInt();
        
        if(num%5==0)
            System.out.println("hi five");
        if(num%2==0)
            System.out.println("hi even");
            
        
    }
    
}
