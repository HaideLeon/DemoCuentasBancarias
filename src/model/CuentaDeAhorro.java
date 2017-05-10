/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sams
 */
public class CuentaDeAhorro extends CuentaBasica {
   
    
    private double tasaDeInteres = 4.0 ;
    private double comisionPorSaldo;
    double interes ;
    double comision;
    int numero;
    
   double prueva;
    
   
  
    public CuentaDeAhorro(int numeroDeCuenta, String cliente){
        super ( numeroDeCuenta,cliente );
        
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
    
    }
   
   public double calcularInteres(){
       
       double tasa = this.tasaDeInteres / 360;
       interes = tasa / 100 * 30 * getSaldo();
       
       System.out.println("El interes de la cuenta es de:" + interes);
       return interes;
   }
   
   public double comisionPorSaldo(double saldo ){
           
       if (saldo < 1000){
           comision = 50;
       }else {
           comision = 0;
           
       }
       System.out.println("Su comision es de:" + comision);
       return comision;
   }
   
   public boolean quiereCorte (int numero){
   
       boolean siQuiere = false;
       if (numero == 1){
           siQuiere = true;
       }
       return siQuiere;
   }
   
   public void realizarCorteMensual(){
       
       this.saldo = (getSaldo () + interes) - comision;
       
      
   
   }

   
   
      
   
   
   
     
     
    
    
    
    
    
    
}
