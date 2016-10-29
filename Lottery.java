/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Lottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int lottery=(int)(Math.random()*100);
        
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your lottery pick(two digits): ");
        int guess=input.nextInt();
        
        int l_digits1=lottery/10;
        int l_digits2=lottery%10;
        
        int g_digits1=guess/10;
        int g_digits2=guess%10;
        
        System.out.println("The lottery number is: "+lottery);
        
        if(guess==lottery)
            System.out.println("Exact match: you win $10000");
        else if(g_digits2==l_digits1
                &&g_digits1== l_digits2)
            System.out.println("Match all digits: you win $3000");
        else if(g_digits1 == l_digits1
                ||g_digits1 == l_digits2
                ||g_digits2 == l_digits1
                ||g_digits2 == l_digits2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
    
}
