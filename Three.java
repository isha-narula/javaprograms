/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three;

/**
 *
 * @author devkalra
 */
public class Three {

    /**
     * @param args the command line arguments
     * 
     */
    public static void biggest()
    {
        int a=3,b=4,c=5;
        if(a>b && a>c)
        {
            System.out.print("First number is greatest");
        }
        else if(b>a && b>c)
        {
            System.out.print("Second Number is greatest");
        }
        else
        {
            System.out.print("Third number is greatest");
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        biggest();
    }
    
}
