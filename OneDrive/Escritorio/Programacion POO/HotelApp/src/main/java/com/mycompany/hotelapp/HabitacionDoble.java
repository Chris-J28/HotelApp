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
    public int getCamasDobles() {
        return camasDobles;

    @Override
    public String mostrarInfo() {
        return " Habitacion Doble " + numHabi + " \n" +
               "Precio por noche: " + String.format("%.2f", precioNoche) + "\n" +
               "Estado: " + (reservacion ? "Ocupada" : "Libre") + "\n" +
               "Camas dobles: " + camasDobles;
    }
    @Override
    public boolean ocupar() { return super.ocupar(); }

    @Override
    public boolean liberar() { return super.liberar(); }

    @Override
    public double calcularCosto(int noches) { return super.calcularCosto(noches); }
}
