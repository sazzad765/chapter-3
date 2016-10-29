/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wind_chill_temperature;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Wind_chill_temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter temperature between-58F to 41F: ");
        double t=input.nextDouble();
        
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double s=input.nextDouble();
        if(t<-58||t>41||s<2){
            if(t<-58||t>41)
                System.out.println("wind-chill temperature is invalid.");

            if(s<2)
                System.out.println("wind-chill speed is invalid.");
            System.exit(0);
        }
        
        double twc=35.74+0.6215*t-35.75*Math.pow(s, 0.16)+0.3965*t*Math.pow(s, 0.16);
        
        System.out.println("the wind chill : "+twc);
    }
    
}
