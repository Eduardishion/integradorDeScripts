/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appparametrosconsole;
import java.io.Serializable;

/**
 *
 * @author Caren
 */
public class AppParametrosConsole implements Serializable{

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        

        
        int num1 = Integer.parseInt(args[0]); 
        int num2 = Integer.parseInt(args[1]); 
        if(num1 == 0 ){
            System.out.println("no se a pasado parametros 1");
        }else{
            if(num2 == 0){
                System.out.println("no se a pasado parametros 2");
            }else{
                int res = num1 + num2;
                System.out.println("El resultado es:" + res);
            }
        }
            
        
    }
    
}
