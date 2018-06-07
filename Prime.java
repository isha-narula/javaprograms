/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

/**
 *
 * @author devkalra
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=13;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.print("Not Prime");
                break;
            }
            else
            {
                System.out.print("Prime");
                break;
            }
        }
        
    }
    
}
