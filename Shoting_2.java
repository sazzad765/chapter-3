/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoting_2;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Shoting_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("enter three integer number a, b, c : ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
      
       
       if(a>b){
           int temp=b;
           b = a;
           a = temp;
       }
       if(b>c){
           int temp=c;
           c=b;
           b=temp;
           
       }
       if(a>b){
           int temp=b;
           b = a;
           a = temp;
       }
        System.out.println(a+"<="+b+"<="+c);
       
           
           
    }
    
}
