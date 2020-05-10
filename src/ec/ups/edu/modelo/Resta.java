/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

/**
 *
 * @author ariel
 */
public class Resta extends Operaciones {

    @Override
    public void operacion() {
        setResultado(getNum1() - getNum2());
        
        System.out.println("--------------------------------------------------");
        System.out.println("Resultado: " + getResultado());
        System.out.println("--------------------------------------------------");
    }
    
}
