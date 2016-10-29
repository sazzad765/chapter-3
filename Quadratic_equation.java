/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic_equation;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Quadratic_equation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a, b ,c: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        
        double f= Math.pow(b,2)-(4*a*c);
        
        double r1=(-b+Math.pow(f,0.5))/2*a;
        double r2=(-b-Math.pow(f,0.5))/2*a;
        
        if(f>0){
            System.out.println("The roots are "+r1+" and "+r2);
        }
        else if(f==0){
           System.out.println("the root is "+r1);
        }  
        else
            System.out.println("The equation has no real root");
    
    }
    
}
