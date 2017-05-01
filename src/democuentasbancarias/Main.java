/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democuentasbancarias;

import java.util.Scanner;
import model.CuentaBasica;

/**
 *
 * @author sams
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBasica miCuenta = new CuentaBasica (123,"Ivan B");
        Scanner entrada = new Scanner (System.in);
        
        double saldo = 0; 
        double dP = 0; 
        double r = 0;
        
        double SaldoTotal = 50;
        
        System.out.println("Usted tiene en su cuenta: $" +SaldoTotal);
        
        while (dP >= 0 | r >= 0 && SaldoTotal >= 50 ){
        
        System.out.print ("Cuanto desea ingresar a su cuenta: ");
        dP = entrada.nextDouble ();
        System.out.print ("¿Cuanto desea retirar de su cuenta?:");
        r = entrada.nextDouble ();
        saldo = 50;    
            
        if ( miCuenta.depositar(dP)){
             
             SaldoTotal = dP + saldo;
             System.out.println("Su saldo existente es:" + saldo);
             System.out.println ("Usted acaba de realizar un deposito"
                     + " por un monoto de: " + dP + "\n\n") ; 
             System.out.println("Su saldo actual es: "  + SaldoTotal);
          
         } else {
             System.out.println("Su saldo actual es:" + saldo);
            return ; 
            
         }
       
       if ( r >= SaldoTotal){
           
           System.out.println("Usted solo tiene en su cuenta: " + SaldoTotal + 
                   " y no pude retirar la cantidad que desea");
        
       } else {
           
           double SaldoNuevo = SaldoTotal - r;
           
           System.out.println("Usted esta retirando de su cuenta: " + r);
           System.out.println ("A usted le queda en su cuenta: " + SaldoNuevo);
          
       }
       
        saldo = SaldoTotal ;
        
    }
     }

  }
       
       
        
       
        
     
        
        
        
        
        
        
       
        
        
        
    
    
