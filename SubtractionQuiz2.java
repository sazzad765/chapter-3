/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subtractionquiz2;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class SubtractionQuiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=(int) (Math.random()*100);
        int num2=(int) (Math.random()*100);
    
         
        System.out.println(num1+" - "+num2+" = ?");
        Scanner input=new Scanner(System.in);
        int ans=input.nextInt();
        
        if(num1-num2==ans)
            System.out.println("your answer is true");
        else
            System.out.println("your ans is false.\n"+"Answer is "+num1+" - "+num2+" = "+(num1-num2));
    }
    
}
