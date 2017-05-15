/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author sams
 */
public class CuentaBasica {
    Scanner entrada = new Scanner (System.in);
   protected int numeroDeCuenta;
   protected String cliente;
   protected double saldo = 0;
   double cantidad;
 

    
    public CuentaBasica (int numeroDeCuenta, String cliente ){
        
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente =  cliente;
        
 
    }


    public double getSaldo (){
        
        return saldo; 
    }
    
   
    
public boolean deposito(double cantidad){

    boolean depositar;
    if (cantidad > 0){
        this.saldo = this.saldo + cantidad;
           depositar = true;
           
        }else{
           depositar= false;
        }
        
        return depositar;
}




    public boolean retirar ( double cantidad ){
        
        boolean puedoRetirar;
        
        
        if  (cantidad  <= getSaldo()){
            
            this.saldo = this.getSaldo() - cantidad ;
        System.out.println("Usted actualmente cuenta con un saldo : $ " + this.saldo);
            puedoRetirar = true;
        }else{
            System.out.println("Lo sentimos no puede efectuar su retiro,"
                    + " no cuenta con el monto que desea expedir");
        puedoRetirar = false;
        
    } 
    return puedoRetirar;
    
    }   
    
    
}
    
    

