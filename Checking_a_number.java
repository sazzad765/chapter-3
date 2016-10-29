/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checking_a_number;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Checking_a_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num=input.nextInt();
        
        if(num%5==0&&num%6==0)
            System.out.println(num+" is divisible by both 5 and 6");
        else if(num%5==0||num%6==0)
            System.out.println(num+" is divisible by 5 0r 6, but not both");
        else
            System.out.println(num+" is not divisible by either 5 or 6");
    }
    
}
