package com.mycompany.hotelapp;

/**
 *
 * @author Emili
 */
public class HabitacionDoble extends Habitacion {
    
    private int camasDobles;

    // Constructor
    public HabitacionDoble(int numHabi, double precioNoche, boolean reservacion, int camasDobles) {
        super(numHabi, precioNoche, reservacion);
        this.camasDobles = camasDobles;
    }

    @Override
    public String mostrarInfo() {
        return " Habitacion Doble " + numHabi + " \n" +
               "Precio por noche: " + String.format("%.2f", precioNoche) + "\n" +
               "Estado: " + (reservacion ? "Ocupada" : "Libre") + "\n" +
               "Camas dobles: " + camasDobles;
    }
}
