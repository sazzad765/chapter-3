/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three_num_addition;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Three_num_addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = (int)(System.currentTimeMillis()%10);
        int num2=  (int)(System.currentTimeMillis()*7%10);
        int num3=  (int)(System.currentTimeMillis()*4%10);
        
        
        Scanner input=new Scanner(System.in);
         System.out.println("what is "+num1+"+"+num2+"+"+num3+"= enter answer ");
         int ans=input.nextInt();
    
        System.out.println(num1+"+"+num2+"+"+num3+"="+(num1+num2+num3)+" , and your ans is "+(num1+num2+num3==ans));
    }
    
}
