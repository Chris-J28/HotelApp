/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelapp;

/**
 *
 * @author chris
 */
//Clase abstracya
public abstract class Habitacion {
    //Constructor
    public Habitacion(int numHabi, double precioNoche, boolean reservacion){
        this.numHabi=numHabi;
        this.precioNoche=precioNoche;
        this.reservacion=reservacion;
    }
    //Atributos
    protected int numHabi;
    public int getNumHabi() {
        return numHabi;
    }
    protected double precioNoche;
    public double getPrecioNoche() {
        return precioNoche;
    }
    protected boolean reservacion;
    public boolean reservacion() {
        return reservacion;
    }
public boolean isReservacion() {
    return reservacion;
}
    //Metodos
    public abstract String mostrarInfo();
    
    public boolean ocupar(){
         if (!reservacion) {
            reservacion = true;
            return true;
        }
        return false;
    }
    public boolean liberar(){
        if (reservacion) {
            reservacion = false;
            return true;
        }
        return false;
    }
    public double calcularCosto(int noches){
       
        return precioNoche * noches;
    }
    
}
