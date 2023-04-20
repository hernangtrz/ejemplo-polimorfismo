/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

/**
 *
 * @author Jairo F
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Vehiculo> ListRentados = new ArrayList();
        
        System.out.println("Lista Rentados");
        Vehiculo v = rentaVehiculo();
        ListRentados.add(v);
        Vehiculo v2 = rentaVehiculo();
        ListRentados.add(v2);
        Vehiculo v3 = rentaVehiculo();
        ListRentados.add(v3);
        
        imprimirList(ListRentados);
        
    }
    
    public static void imprimirList(List<Vehiculo> list){
        System.out.println("\n Informe vehiculos rentados");
        for(Vehiculo v: list){
            devolucionVehiculo(v);
        }
    }
    
    public static void devolucionVehiculo(Vehiculo v){
        
         v.setEstado(false);
         // imprimir los datos del vehiculo segun su tipo
         // Autobus: 
         // precio km km rnta, km dev
//         if(v instanceof Autobus autobus){
//             System.out.println("\n---------------------------------");
//             System.out.println("Tipo de vehiculo: Autobus");
//             System.out.println("Precio km: " + autobus.getPrecioKm());
//             System.out.println("Km de renta: " + autobus.getKmRenta());
//             System.out.println("Km de devolucion: " + autobus.getKmDevolucion());     
//         }else if(v instanceof Tractor tractor){
//         // tractor:
//         // precio dia, fecha renta, fecha devol
//            System.out.println("\n---------------------------------");         
//            System.out.println("Tipo de vehiculo: Tractor");
//            System.out.println("Precio km: " + tractor.getPrecioDia());
//            System.out.println("Km de renta: " + tractor.getFechaRenta());
//            System.out.println("Km de devolucion: " + tractor.getFechaDevolucion());  
//         }
//
         System.out.println("\n---------------------------------");
         System.out.println(v);
         System.out.println("Importe de renta: " + v.calcularImporteRenta());
         System.out.println("---------------------------------");
    
    }
    
    public static Vehiculo rentaVehiculo(){
     
        Vehiculo v;
        String placa = Entrada.leerString("Placa:");
        char tipoVehiculo= Entrada.leerChar("Tipo [A->autobus, B ->tractor, * ->automovil]: ");
        if(tipoVehiculo=='A' || tipoVehiculo=='a'){
            double precioKm=Entrada.leerDouble("Precio Km: ");
            double kmRenta=Entrada.leerDouble("Km renta: ");
            double kmDev=Entrada.leerDouble("Km devolucion: ");
            v = new Autobus(precioKm, kmRenta, kmDev, placa, true);
        }
        else if(tipoVehiculo=='B' || tipoVehiculo=='b'){
            
            double precioDia = Entrada.leerDouble("Precio dia: ");
            LocalDate fechaRenta = LocalDate.parse(Entrada.leerString("Fecha renta(aaaa-mm-dd):  " ));
            LocalDate fechaDevolucion = LocalDate.parse(Entrada.leerString("Fecha devolucion(aaaa-mm-dd): " ));
            v = new Tractor(precioDia, fechaDevolucion, fechaRenta, placa, true);
        }
        else{
            double precioHora = Entrada.leerDouble("Precio hora: ");
            int horasUsadas = (int) Entrada.leerInt("Horas usada: ");
            v = new Automovil(precioHora,horasUsadas,placa, true);
        }
        
        return v;
    
    }
    
}
