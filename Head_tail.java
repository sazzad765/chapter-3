/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package head_tail;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Head_tail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter a guess(0=head or 1=tail): ");
        int guess=input.nextInt();
        
        int randomnumber=(int)(Math.random()*2);
        if (randomnumber==guess)
            System.out.println("you are true.");
        else 
            System.out.println("you are false.");
        
        if(randomnumber==0)
            System.out.println("head");
        else if(randomnumber==1)
            System.out.println("tail");
        
    }
    
}
