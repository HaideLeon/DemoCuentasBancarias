/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democuentasbancarias;

import java.util.Scanner;
import model.CuentaBasica;
import model.CuentaDeAhorro;

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
        CuentaDeAhorro miAhorro = new CuentaDeAhorro(132,"H"); 
        CuentaBasica miCuenta = new CuentaBasica (123,"Ivan B");
        Scanner entrada = new Scanner (System.in);
       
        //variables de Cuenta Basica 
        System.out.println ("Usted tiene en su cuenta: " + miCuenta.getSaldo() );
        
        while ( miCuenta.getSaldo() >= 0 ){
        double dP;
       
        System.out.print ("Cuanto desea ingresar a su cuenta: ");
        miCuenta.deposito(dP=entrada.nextDouble ());
       
        System.out.println ("Ustede actualmente tiene en su cuenta "+ 
                miCuenta.getSaldo());
        
        double r;
        System.out.print ("¿Cuanto desea retirar de su cuenta?: ");
        miCuenta.retirar(r = entrada.nextDouble());
        System.out.println ("Le queda en su cuenta:" + miCuenta.getSaldo());
        
        System.out.println("Su corte mensual es: ");
        miAhorro.realizarCorteMensual();
        
        
        }
               
        
       //clase Cuenta de Ahorro
       
       //System.out.print ("¿Cuanto desea abonar en su cuenta de ahorro?:" );
       //ahorro = entrada.nextDouble ();
       
      //System.out.println("Usted ahora cuenta con un ahorro de:"+ 
              //miAhorro.deporsitar(ahorro) );
           
       }
       
       
       
     }

  
       
       
        
       
        
     
        
        
        
        
        
        
       
        
        
        
    
    
