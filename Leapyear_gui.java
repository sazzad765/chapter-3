/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear_gui;

import javax.swing.JOptionPane;

/**
 *
 * @author sazzad
 */
public class Leapyear_gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String value1 = JOptionPane.showInputDialog("Enter month: ");
        String value2 = JOptionPane.showInputDialog("Enter year: ");
        
        int month= Integer.parseInt(value1);
        int year= Integer.parseInt(value2);
        
        
        boolean leapyear=(year%4==0 && year %100 !=0)||(year%400==0);
        
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12||
                month==4||month==6||month==9||month==11){
            if(month==1)
                JOptionPane.showMessageDialog(null, ("january "+year+" has 31 days."));
            else if(month==3)
                JOptionPane.showMessageDialog(null, ("March "+year+" has 31 days."));
            else if (month==5)
                JOptionPane.showMessageDialog(null, ("May "+year+" has 31 days."));
            else if(month==7)
                    JOptionPane.showMessageDialog(null, ("July "+year+" has 31 days."));
            else if(month==8)
                    JOptionPane.showMessageDialog(null, ("August "+year+" has 31 days."));
            else if(month==10)
                    JOptionPane.showMessageDialog(null, ("October "+year+" has 31 days."));
            else if(month==12)
                    JOptionPane.showMessageDialog(null, ("December "+year+" has 31 days."));

            else if(month==4)
                JOptionPane.showMessageDialog(null, ("April "+year+" has 30 days."));    
            else if(month==6)
                JOptionPane.showMessageDialog(null, ("June "+year+" has 30 days."));    
            else if(month==9)
                JOptionPane.showMessageDialog(null, ("September "+year+" has 30 days."));    
            else if(month==11)
                JOptionPane.showMessageDialog(null, ("November "+year+" has 30 days."));    
        }
        else{
            if(leapyear)
                JOptionPane.showMessageDialog(null, ("february "+year+" has 29 days."));
            else
                JOptionPane.showMessageDialog(null, ("february "+year+" has 28 days."));
        }
    }
    
}
