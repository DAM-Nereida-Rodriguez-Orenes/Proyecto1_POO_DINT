/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 * Ejercicio 2 de POO
 * @author Nereida Rodríguez Orenes 2ºDAM
 */
public class Auto extends Vehiculo{
    private String tipoCombustible;

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public String mostrarInfo(){
        return "La marca es "+super.getMarca()+", el color es "+super.getColor()+" y el tipo de combustible es "+this.getTipoCombustible();
    }
}
