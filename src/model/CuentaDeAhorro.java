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
public class CuentaDeAhorro {
    
    private int numeroDeCuenta;
    private String cliente;
    private double saldo ;
    private double tasaDeInteres;
    private double comisionPorSaldo;
    double interes ;
    double comision = 0;
 
    private static final double INTERES_ANUAL = 0.04;
    
   
  
    public CuentaDeAhorro(int numeroDeCuenta, String cliente){
        
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
    
    }
    
    public double getSaldo (){
    
    return saldo;
    }
    
    public boolean deporsitar (double cantidad){
        
        boolean depositar;
        
        if (cantidad > 0){
            this.saldo = this.saldo + cantidad;
            depositar = true;
        }else{
           
            depositar= false;
        }
        
        return depositar;
        }
    
     public boolean retirar (double cantidad){  
         
         boolean puedoRetirar;
         
         if ( cantidad <= saldo){
             this.saldo = this.saldo - cantidad;
             puedoRetirar = true;
    
         }else {
             puedoRetirar = false;
         
         } 
         
         return puedoRetirar ;
     
}
   public double calcularInteres( ){
       
       
       double interesMensual =(INTERES_ANUAL / 12);
       interes =  saldo *  interesMensual;
          
  return interes;
   }
   
   public double comisionPorSaldo(){
       
       double comision;
       
       if (saldo < 1000){
           comision = 50;
       }else {
           comision = 0;
       }
       return comision;
   }
   
   public void realizarCorteMensual(){
       
       this.saldo = (saldo + interes - comision);
   
   
   }
   
      
   
   
   
     
     
    
    
    
    
    
    
}
