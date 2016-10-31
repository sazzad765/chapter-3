/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeter_of_a_triangle;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Perimeter_of_a_triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three edge: ");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();
        boolean x=num1<num2+num3 && num2<num1+num3 && num3<num1+num2;
        
        if(x)
            System.out.println("");
    }
    
}
