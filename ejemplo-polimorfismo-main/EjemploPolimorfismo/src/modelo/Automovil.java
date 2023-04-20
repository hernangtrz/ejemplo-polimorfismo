/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class Automovil extends Vehiculo{
    private double precioHora;
    private int horasDeUso;


    public Automovil(double precioHora, int horasDeUso, String placa, boolean estado) {
        super(placa, estado);
        this.precioHora = precioHora;
        this.horasDeUso = horasDeUso;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public int getHorasDeUso() {
        return horasDeUso;
    }

    public void setHorasDeUso(int horasDeUso) {
        this.horasDeUso = horasDeUso;
    }

    
    
    @Override
    public double calcularImporteRenta() {
        return this.precioHora * this.horasDeUso;
    }

    @Override
    public String toString() {
        return "Automovil{" + "precioHora=" + precioHora + ", horasDeUso=" + horasDeUso + '}';
    }

      
    
}
