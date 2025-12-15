/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 * Ejercicio 2 de POO
 * @author Nereida Rodríguez Orenes 2ºDAM
 */
public class Moto extends Vehiculo{
   private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
   
   public String mostrarInfo(){
        return "La marca es "+super.getMarca()+", el color es "+super.getColor()+" y la cilindrada es "+this.getCilindrada();
    }
}
