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
public class CuentaBasica {
    
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    
    
   
    
    public CuentaBasica (int numeroDeCuenta, String cliente ){
        
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente =  cliente;
     
    }


    public double getSaldo (){
        
        return saldo; 
    }
    
   
    
    public boolean depositar (double cantidad){
        boolean deposito;
        
        deposito = cantidad > 0;
        return deposito;
        }
    
    public boolean retirar (double cantidad){
        boolean puedoRetirar;
        if (cantidad <= saldo){
            puedoRetirar = true;
        }else
        puedoRetirar = false;
    
        return puedoRetirar;
        
    }
            
 
    
    }
      
        
        
    
    

    
    
    
    
    

