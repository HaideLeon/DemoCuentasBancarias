/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democuentasbancarias;

import java.util.Scanner;
import model.CuentaBasica;
import model.CuentaDeAhorro;
import model.CuentaDeCheques;

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
        
                                                                      //Cuenta Basica //
        miCuenta.deposito(50); //El saldo inicial//
        System.out.println("Su saldo inicial es : $" + miCuenta.getSaldo());
        System.out.println("Se realizo un deposito por el monto de : $ 1000 ");
        miCuenta.deposito(1000);
        System.out.println("Se realizo un deposito por el monto de : $ 1500 ");
        miCuenta.deposito(1500);
        System.out.println("Usted actualmente cuenta con un saldo : $ "
                + miCuenta.getSaldo());
        System.out.println("Se realizo un retiro por el monto de : $ 200");
        miCuenta.retirar(200);
    
        System.out.println("Se realizo un deposito por el monto de : $ 300");
        miCuenta.deposito(300);
        System.out.println("Usted actualmente cuenta con un saldo : $ "
                + miCuenta.getSaldo());
        System.out.println("Se realizo un retiro por el monto de : $ 1000");
        miCuenta.retirar(1000);
        
        
        
        System.out.println ();
        System.out.println ();
        

                                                         ///Mi Cuenta de Ahorro///
       
        System.out.println("ESTA ES LA CUENTA DE AHORRO");
        
        miAhorro.deposito(50);
        System.out.println("Su saldo inicial es : $" + miAhorro.getSaldo());
      
        System.out.println("\nSe realizo un deposito por el monto de : $ 1000 ");
        miAhorro.deposito(1000);
        System.out.println("\nSe realizo un deposito por el monto de : $ 1500 ");
         miAhorro.deposito(1500);
        System.out.println("Usted actualmente cuenta con un saldo : $ "
                + miAhorro.getSaldo());
        System.out.println("Se realizo un retiro por el monto de : $ 200");
        miAhorro.retirar(200);
        
        System.out.println("Se realizo un deposito por el monto de : $ 300");
         miAhorro.deposito(300);
        System.out.println("Usted actualmente cuenta con un saldo : $ "
                + miAhorro.getSaldo());
        System.out.println("Se realizo un retiro por el monto de : $ 1000");
        miAhorro.retirar(1000);
        
         System.out.println ( );
         System.out.println ();
        
        System.out.println ("¿Desea saber su corte mensual?");
        System.out.println ("Seleccione 1 si desea saber o 0 por si aun no desea conocer su corte mensual: ");
       
        int prueba = entrada.nextInt();
        if (miAhorro.quiereRealizar(prueba)== true){
            
             System.out.println ( "Su Corte Mensual es :" +
                     ((miAhorro.getSaldo()+ miAhorro.calcularInteres()) - miAhorro.comisionPorSaldo(1650)) );
             
        } 
        
        
                                                       //Cuenta De Cheques //
                                                       
                                                       
        CuentaDeCheques misCheques = new CuentaDeCheques (123,"Ivan B");
        
        int c;
        int d;
        double deposito;
        System.out.println ();
        System.out.println ();
        System.out.println ("¿Desea Expedir un Cheque?");
        System.out.println ("Seleccione 1 si desea saber o 0 por si aun no le interesa: ");    
        c = entrada.nextInt();
        
        
        while(misCheques.quiereRealizar(c) == true ){
        
               
        System.out.println("¿Cuanto desea depositar en su cuenta de cheques? ");
        deposito = entrada.nextDouble();
        
        misCheques.deposito(deposito);
        
        while ( deposito >= 2000 ){
            
          
        System.out.print("\t¿Cuanto quiere expedir de su Cuenta De Cheques? ");
        double cantidad = entrada.nextDouble ();
        
        System.out.println( "\nSU SALDO ERA: $" + misCheques.getSaldo());
        misCheques.retirarCheque(cantidad);
       
        //Calculo de la comision por los cheques
        System.out.println("Su comision es de Cheques Emitidos es: $" + 
                misCheques.calcularComisionPorChequesEmitidos());
        
        System.out.println("Su comision es de Cheques Rebotados : $"
                + misCheques.calcularComisionPorChequesRebotados());
        
        System.out.println ("\t¿Cuanto desea ingresar a su cuenta de Cheques?");
        cantidad = entrada.nextDouble();
        misCheques.deposito(cantidad);
        
        System.out.println("¿DESES SU CORTE MENSUAL?");
        System.out.println("presion 1 si lo quiere saber o 0 si aun no le interesa");
        c = entrada.nextInt ();
        
        double corteMensual = misCheques.calcularComisionPorChequesEmitidos()+ misCheques.calcularComisionPorChequesRebotados(); 
        
        if (misCheques.quiereRealizar(c) == true && corteMensual <= misCheques.getSaldo()){
            
             System.out.println("Su comision es de Cheques Emitidos es: $" + 
                misCheques.calcularComisionPorChequesEmitidos());
        
             System.out.println("Su comision es de Cheques Rebotados : $"
                + misCheques.calcularComisionPorChequesRebotados());
           
            System.out.println("Su corte mensual de la Cuenta de Cheques es de: $" + corteMensual);
            
             misCheques.retirar(corteMensual);
             
              }
        if (misCheques.quiereRealizar(c)== true && corteMensual > misCheques.getSaldo()){
                System.out.print("\nUSTED SE  NO TIENE EL DINERO SUFICIENTE PARA PAGAR LA COMISION");
                 System.out.print("\nHaga un deposito para saldar la comision");
                  System.out.print("\n¿Cuánto va a depositar?");
                  deposito = entrada.nextDouble();
                  misCheques.deposito(deposito);
              }
        }
        
        
             System.out.println("Su deposito es inferior al que se pide");
             System.out.println("Se necesita $2000 pesos para poder tener su cuenta de cheques");
        }
             System.out.println ("El cliente no desea expedir cheques por "
                + "el momento" );
        
        }
    
        
    
}



  
       
       
        
       
        
     
        
        
        
        
        
        
       
        
        
        
    
    
