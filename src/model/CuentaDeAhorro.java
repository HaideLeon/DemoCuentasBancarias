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
    
    private final int numeroDeCuenta;
    private final String cliente;
    private double saldo = 50 ;
    private double tasaDeInteres = 0.04 ;
    private double comisionPorSaldo;
    double interes ;
    double comision;
    int numero;
    
   double prueva;
    
   
  
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
         
         if ( cantidad <= this.saldo){
             this.saldo = this.saldo - cantidad;
             puedoRetirar = true;
    
         }else {
             puedoRetirar = false;
         
         } 
         
         return puedoRetirar ;
     
}
     
   public double calcularInteres(){
        
       tasaDeInteres = (((4.00/360.00)*30) * this.saldo /100 );
          
       return tasaDeInteres;
   }
   
   public double comisionPorSaldo(double saldo ){
           
       if (saldo < 1000){
           comision = 50;
       }else {
           comision = 0;
       }
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
       
       this.saldo = (saldo + interes) - comision;
       
      
   
   }

   
   
      
   
   
   
     
     
    
    
    
    
    
    
}
