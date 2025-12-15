/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 * Ejercicio 2 de POO
 * @author Nereida Rodríguez Orenes 2ºDAM
 */
public class Vehiculo {
    private String marca;
    private String color;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String mostrarInfo(){
        return "La marca es "+this.getMarca()+" y el color es "+this.getColor();
    }
}
