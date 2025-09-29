/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelapp;
/**
 *
 * @author chris
 */
public class HabitacionSencilla extends Habitacion {
    private int camasIndividuales;
    public HabitacionSencilla(int numHabi, double precioNoche, boolean reservacion, int camasIndividuales) {
        super(numHabi, 800, reservacion);
        this.camasIndividuales=camasIndividuales;
    }

    public int getNumHabi() {
        return numHabi;
    }

    @Override
    public String mostrarInfo() {
        String estado = "Disponible";
        if (reservacion==true){
            estado = "Ocupada";
          }else if(reservacion==false){
              estado ="Disponible";
           }
        return "Habitacion: " + numHabi
         + " | Precio por noche: " + precioNoche
         + " | Estado: " + estado
         + " | Camas individuales: " + camasIndividuales;
    }
    @Override
    public boolean ocupar() {     
        return super.ocupar();    
    }

    @Override
    public boolean liberar() {    
        return super.liberar();
    }

    @Override
    public double calcularCosto(int noches) {  
        return super.calcularCosto(noches);
    }
}


    
