/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additionquiz;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class AdditionQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = (int)(System.currentTimeMillis()%100);
        int num2= (int )(System.currentTimeMillis()*7%100);
        
        
        Scanner input=new Scanner(System.in);
         System.out.println("what is "+num1+"+"+num2+"= enter answer ");
         int ans=input.nextInt();
    
        System.out.println(num1+"+"+num2+"="+(num1+num2)+" , and your ans is "+(num1+num2==ans));
    }
    
}