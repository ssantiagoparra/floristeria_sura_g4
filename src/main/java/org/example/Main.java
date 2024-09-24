package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

public class Main {
    public static void main(String[] args) {

        // Creación de objetos con constructor vacío
        Cliente clienteVacio = new Cliente();
        Flor florVacia = new Flor();
        Repartidor repartidorVacio = new Repartidor();
        Proveedor proveedorVacio = new Proveedor();

        // Creación de objetos con constructor lleno
        Cliente clienteLleno = new Cliente("Juan", "Calle 123", "5551234", "juan@gmail.com", "Medellín", 30, "123456789", "Tarjeta", "Frecuente", true);
        Flor florLlena = new Flor("Rosa", "Rojo", 5.0, "Ornamental", "Flores Cesde", "Colombia", true, 100, 50.0, false);
        Repartidor repartidorLleno = new Repartidor("Carlos", "5554321", "Calle 456", "Bogotá", 25, "Moto", "A1", 3, true, "Mañana");
        Proveedor proveedorLleno = new Proveedor("Luis", "Flores SA", "5556789", "luis@floressa.com", "Calle 789", "Medellín", "Flores", 200, 4.5, true);

        // Mostrar los atributos de los objetos usando getters
        System.out.println("Cliente: " + clienteLleno.getNombre() + ", Dirección: " + clienteLleno.getDireccion());
        System.out.println("Flor: " + florLlena.getNombre() + ", Precio: " + florLlena.getPrecio());
        System.out.println("Repartidor: " + repartidorLleno.getNombre() + ", Teléfono: " + repartidorLleno.getTelefono());
        System.out.println("Proveedor: " + proveedorLleno.getNombre() + ", Empresa: " + proveedorLleno.getEmpresa());
    }

}
