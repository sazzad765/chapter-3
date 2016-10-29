/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random_character;

/**
 *
 * @author sazzad
 */
public class Random_character {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=(int)(65+Math.random()*26);
        char c=(char)n;
        
        System.out.println("The random letter is: "+c);
    }
    
}
