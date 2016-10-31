/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoting_gui;

import javax.swing.JOptionPane;

/**
 *
 * @author sazzad
 */
public class Shoting_gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String value1 = JOptionPane.showInputDialog("Enter integer number 1");
        String value2 = JOptionPane.showInputDialog("Enter integer number 2");
        String value3 = JOptionPane.showInputDialog("Enter integer number 3");
        
        int num1= Integer.parseInt(value1);
        int num2= Integer.parseInt(value2);
        int num3= Integer.parseInt(value3);
        
            if(num1<=num2&&num2<=num3)
                JOptionPane.showMessageDialog(null, (num1+"<="+ num2+"<="+num3));
            else if(num2<=num3&&num3<=num1)
                JOptionPane.showMessageDialog(null, (num2+"<="+ num3+"<="+num1));
            else if(num2<=num1&&num1<=num3)
                JOptionPane.showMessageDialog(null, ( num2+"<="+num1+"<="+num3)); 
            else if(num1<=num3&&num3<=num2)
                JOptionPane.showMessageDialog(null, ( num1+"<="+num3+"<="+num2)); 
            else if(num3<=num1&&num1<=num2)
                JOptionPane.showMessageDialog(null, (num3+"<="+num1+"<="+num2));
            else
                JOptionPane.showMessageDialog(null, (num3+"<="+num2+"<="+num1));
            
    }
    
}
