/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author santi
 */
public class Operaciones {
    
    private int num1;
    private int num2;
    
    public Operaciones(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int sumar()
    {
        return num1 + num2;
    }
    public int restar ()
    {
        return num1 - num2;
    }
    public int multi()
    {
        return num1*num2;
    }
    public int dividir()
    {
        return num1/num2;
    }
    public int modulo(){
        return num1%num2;
    }
    
    
}
