/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linear_equation;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Linear_equation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();
        double e=input.nextDouble();
        double f=input.nextDouble();
        
        double x= (e*d-b*f)/(a*d-b*c);
        double y=(a*f-e*c)/(a*d-b*c);
        
        if(a*d-b*c==0)
            System.out.println("The equation has no solution.");
        
        else
            System.out.println("x is "+x+" and y is "+y);
            
    }
    
}
