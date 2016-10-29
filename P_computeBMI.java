/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_computebmi;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class P_computeBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight= input.nextDouble();
        
        System.out.println("Enter height in feet and inches: ");
        double feet=input.nextDouble();
        double inches=input.nextDouble();
       
        double weight_kg= weight*0.45359237;
        double height_meters=((feet*12)+inches)*0.0254;
        
        double bmi=weight_kg/ (height_meters*height_meters);
        
        System.out.println("BMI " +bmi);
        
       
        if (bmi<16)
            System.out.println("You are seriusly underweight");
        else if(bmi<18)
            System.out.println("You are underweight");
        else if(bmi<24)
            System.out.println("You are normal weight");
        else if(bmi<29)
            System.out.println("You are over weight");
        else if(bmi<35)
            System.out.println("You are seriusly overweight");
        else
            System.out.println("You are gravely overweight");
        
    }
    
}
