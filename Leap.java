/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leap;

/**
 *
 * @author devkalra
 */
public class Leap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year=2012;
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.print("Leap Year");
                }
                else
                {
                    System.out.print("Not a leap year");
                }
                
            }
            else
            {
                System.out.print("Not a leap year");
            }
        }
        else
        {
            System.out.print("Not a leap year");
        }
        
    }
    
}
