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
        CuentaDeAhorro miAhorro = new CuentaDeAhorro(123,"Ivan B"); 
        CuentaBasica miCuenta = new CuentaBasica (123,"Ivan B");
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Su saldo inicial es : $" + miCuenta.getSaldo());
        System.out.println("Se realizo un deposito por el monto de : $ 1000 ");
        miCuenta.deposito(1000);
        System.out.println("Se realizo un deposito por el monto de : $ 1500 ");
        miCuenta.deposito(1500);
        System.out.println("Usted actualmente cuenta con un saldo : $ "
                + miCuenta.getSaldo());
        System.out.println("Se realizo un retiro por el monto de : $ 200");
        miCuenta.retirar(200);
        System.out.println("Usted actualmente cuenta con un saldo : $ " + miCuenta.getSaldo());
        System.out.println("Se realizo un deposito por el monto de : $ 300");
        miCuenta.deposito(300);
        System.out.println("Usted actualmente cuenta con un saldo : $ "
                + miCuenta.getSaldo());
        System.out.println("Se realizo un retiro por el monto de : $ 1000");
        miCuenta.retirar(1000);
        System.out.println("Usted actualmente cuenta con un saldo: $" + miCuenta.getSaldo() );
         System.out.println ();
          System.out.println ();
        

        ///Mi Cuenta de Ahorro
        System.out.println("ESTA ES LA CUENTA DE AHORRO");
        System.out.println("\nSu saldo inicial es : $" + miCuenta.getSaldo());
        System.out.println("\nSe realizo un deposito por el monto de : $ 1000 ");
        miAhorro.deposito(1000);
        System.out.println("\nSe realizo un deposito por el monto de : $ 1500 ");
         miAhorro.deposito(1500);
        System.out.println("Usted actualmente cuenta con un saldo : $ "
                + miAhorro.getSaldo());
        System.out.println("Se realizo un retiro por el monto de : $ 200");
        miAhorro.retirar(200);
        System.out.println("Usted actualmente cuenta con un saldo : $ " + miAhorro.getSaldo());
        System.out.println("Se realizo un deposito por el monto de : $ 300");
         miAhorro.deposito(300);
        System.out.println("Usted actualmente cuenta con un saldo : $ "
                + miAhorro.getSaldo());
        System.out.println("Se realizo un retiro por el monto de : $ 1000");
        miAhorro.retirar(1000);
        System.out.println("Usted actualmente cuenta con un saldo: $" + miAhorro.getSaldo() );
       
         System.out.println ( );
         System.out.println ();
        
        System.out.println ("¿Desea saber su corte mensual?");
        System.out.println ("Seleccione 1 si desea saber o 0 por si aun no desea conocer su corte mensual: ");
       
        int prueba = entrada.nextInt();
        if (miAhorro.quiereCorte(prueba)== true){
            
           
                
             System.out.println ( "Su Corte Mensual es :" +
                     ((miAhorro.getSaldo()+ miAhorro.calcularInteres()) - miAhorro.comisionPorSaldo(1650)) );
             
        }
        
        
        
        
        
        
     }
}

  
       
       
        
       
        
     
        
        
        
        
        
        
       
        
        
        
    
    
