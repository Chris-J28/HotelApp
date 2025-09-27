package com.mycompany.hotelapp;

/**
 *
 * @author Emili
 */
public class Suite extends Habitacion {
    
    private boolean tieneJacuzzi;
    private boolean tieneVistaMar;

    // Constructor
    public Suite(int numHabi, double precioNoche, boolean reservacion, boolean tieneJacuzzi, boolean tieneVistaMar) {
        super(numHabi, precioNoche, reservacion);
        this.tieneJacuzzi = tieneJacuzzi;
        this.tieneVistaMar = tieneVistaMar;
    }

    @Override
    public String mostrarInfo() {
        return "--- Suite #" + numHabi + " ---\n" +
               "Precio por noche: $" + String.format("%.2f", precioNoche) + "\n" +
               "Estado: " + (reservacion ? "Ocupada" : "Libre") + "\n" +
               "Jacuzzi: " + (tieneJacuzzi ? "Si" : "No") + "\n" +
               "Vista al mar: " + (tieneVistaMar ? "Si" : "No");
    }
}
