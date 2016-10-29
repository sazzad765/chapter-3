/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number_of_days_in_a_month;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Number_of_days_in_a_month {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter month and year in int: ");
        int month=input.nextInt();
        int year = input.nextInt();
        
        boolean leapyear=(year%4==0 && year %100 !=0)||(year%400==0);
        
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12||
                month==4||month==6||month==9||month==11){
            if(month==1)
                System.out.println("january "+year+" has 31 days.");
            else if(month==3)
                System.out.println("March "+year+" has 31 days.");
            else if (month==5)
                System.out.println("May "+year+" has 31 days.");
            else if(month==7)
                System.out.println("July "+year+" has 31 days.");
            else if(month==8)
                System.out.println("August "+year+" has 31 days.");
            else if(month==10)
                System.out.println("October "+year+" has 31 days.");
            else if(month==12)
                System.out.println("December "+year+" has 31 days.");

            else if(month==4)
                System.out.println("April "+year+" has 30 days.");
            else if(month==6)
                System.out.println("June "+year+" has 30 days.");
            else if(month==9)
                System.out.println("September "+year+" has 30 days.");
            else if(month==11)
                System.out.println("November "+year+" has 30 days.");
        }
        else{
            if(leapyear)
                System.out.println("february "+year+" has 29 days.");
            else
                System.out.println("february "+year+" has 28 days.");
        }
    
        
    }
    
}
