/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scissor_rock_paper;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Scissor_rock_paper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2): ");
        int num=input.nextInt();
        
        int random_n=(int)(Math.random()*3);
        System.out.println("computer ="+random_n);
        
        if (random_n==0)
            System.out.println("the computer is scissor. ");
            
        else if(random_n==1)
            System.out.println("the computer is rock. ");
        else if(random_n==2)
            System.out.println("the computer is paper. ");
        
        
        if((num==0 && random_n==2)||(num==1 && random_n==0)||(num==2&&random_n==1)){
            
            if(num==0)
                System.out.println("you are scissor. you won. ");
            else if(num==1)
                System.out.println("you are rock. you won. ");
            else if(num==2)
                System.out.println("you are paper. you won. ");
        }
        else if(num==random_n){
            if(num==0)
                System.out.println("you are scissor too. It is draw. ");
            else if(num==1)
                System.out.println("you are rock too. It is draw. ");
            else if(num==2)
                System.out.println("you are paper too. It is draw. ");  
            
        }
        else{
            if(num==0)
                System.out.println("you are scissor. you are lose. ");
            else if(num==1)
                System.out.println("you are rock. you are lose. ");
            else if(num==2)
                System.out.println("you are paper. you are lose. "); 
            
            
        }
        
    }
    
}
