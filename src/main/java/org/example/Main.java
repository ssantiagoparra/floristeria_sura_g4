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
        // Cliente
        System.out.println("Cliente lleno:");
        System.out.println("Nombre: " + clienteLleno.getNombre());
        System.out.println("Dirección: " + clienteLleno.getDireccion());
        System.out.println("Teléfono: " + clienteLleno.getTelefono());
        System.out.println("Email: " + clienteLleno.getEmail());
        System.out.println("Ciudad: " + clienteLleno.getCiudad());
        System.out.println("Edad: " + clienteLleno.getEdad());
        System.out.println("Identificación: " + clienteLleno.getIdentificacion());
        System.out.println("Método de Pago: " + clienteLleno.getMetodoPago());
        System.out.println("Tipo de Cliente: " + clienteLleno.getTipoCliente());
        System.out.println("Es VIP: " + clienteLleno.isEsVIP());

        // Flor
        System.out.println("Flor llena:");
        System.out.println("Nombre: " + florLlena.getNombre());
        System.out.println("Color: " + florLlena.getColor());
        System.out.println("Precio: " + florLlena.getPrecio());
        System.out.println("Tipo: " + florLlena.getTipo());
        System.out.println("Proveedor: " + florLlena.getProveedor());
        System.out.println("Origen: " + florLlena.getOrigen());
        System.out.println("Es Aromática: " + florLlena.isEsAromatica());
        System.out.println("Cantidad Disponible: " + florLlena.getCantidadDisponible());
        System.out.println("Altura: " + florLlena.getAltura());
        System.out.println("Es Exótica: " + florLlena.isEsExotica());

        // Repartidor
        System.out.println("Repartidor lleno:");
        System.out.println("Nombre: " + repartidorLleno.getNombre());
        System.out.println("Teléfono: " + repartidorLleno.getTelefono());
        System.out.println("Dirección: " + repartidorLleno.getDireccion());
        System.out.println("Ciudad: " + repartidorLleno.getCiudad());
        System.out.println("Edad: " + repartidorLleno.getEdad());
        System.out.println("Tipo de Vehículo: " + repartidorLleno.getTipoVehiculo());
        System.out.println("Licencia: " + repartidorLleno.getLicencia());
        System.out.println("Experiencia: " + repartidorLleno.getExperiencia());
        System.out.println("Disponibilidad: " + repartidorLleno.isDisponibilidad());
        System.out.println("Turno: " + repartidorLleno.getTurno());

        // Proveedor
        System.out.println("\nProveedor lleno:");
        System.out.println("Nombre: " + proveedorLleno.getNombre());
        System.out.println("Empresa: " + proveedorLleno.getEmpresa());
        System.out.println("Teléfono: " + proveedorLleno.getTelefono());
        System.out.println("Email: " + proveedorLleno.getEmail());
        System.out.println("Dirección: " + proveedorLleno.getDireccion());
        System.out.println("Ciudad: " + proveedorLleno.getCiudad());
        System.out.println("Tipo de Producto: " + proveedorLleno.getTipoProducto());
        System.out.println("Cantidad Suministrada: " + proveedorLleno.getCantidadSuministrada());
        System.out.println("Precio Unitario: " + proveedorLleno.getPrecioUnitario());
        System.out.println("Confiabilidad: " + proveedorLleno.isConfiabilidad());

        // Cliente vacío
        System.out.println("\nCliente vacío:");
        System.out.println("Nombre: " + clienteVacio.getNombre());
        System.out.println("Dirección: " + clienteVacio.getDireccion());
        System.out.println("Teléfono: " + clienteVacio.getTelefono());
        System.out.println("Email: " + clienteVacio.getEmail());
        System.out.println("Ciudad: " + clienteVacio.getCiudad());
        System.out.println("Edad: " + clienteVacio.getEdad());
        System.out.println("Identificación: " + clienteVacio.getIdentificacion());
        System.out.println("Método de Pago: " + clienteVacio.getMetodoPago());
        System.out.println("Tipo de Cliente: " + clienteVacio.getTipoCliente());
        System.out.println("Es VIP: " + clienteVacio.isEsVIP());

        // Flor vacía
        System.out.println("\nFlor vacía:");
        System.out.println("Nombre: " + florVacia.getNombre());
        System.out.println("Color: " + florVacia.getColor());
        System.out.println("Precio: " + florVacia.getPrecio());
        System.out.println("Tipo: " + florVacia.getTipo());
        System.out.println("Proveedor: " + florVacia.getProveedor());
        System.out.println("Origen: " + florVacia.getOrigen());
        System.out.println("Es Aromática: " + florVacia.isEsAromatica());
        System.out.println("Cantidad Disponible: " + florVacia.getCantidadDisponible());
        System.out.println("Altura: " + florVacia.getAltura());
        System.out.println("Es Exótica: " + florVacia.isEsExotica());

        // Repartidor vacío
        System.out.println("Repartidor vacío:");
        System.out.println("Nombre: " + repartidorVacio.getNombre());
        System.out.println("Teléfono: " + repartidorVacio.getTelefono());
        System.out.println("Dirección: " + repartidorVacio.getDireccion());
        System.out.println("Ciudad: " + repartidorVacio.getCiudad());
        System.out.println("Edad: " + repartidorVacio.getEdad());
        System.out.println("Tipo de Vehículo: " + repartidorVacio.getTipoVehiculo());
        System.out.println("Licencia: " + repartidorVacio.getLicencia());
        System.out.println("Experiencia: " + repartidorVacio.getExperiencia());
        System.out.println("Disponibilidad: " + repartidorVacio.isDisponibilidad());
        System.out.println("Turno: " + repartidorVacio.getTurno());

        // Proveedor vacío
        System.out.println("Proveedor vacío:");
        System.out.println("Nombre: " + proveedorVacio.getNombre());
        System.out.println("Empresa: " + proveedorVacio.getEmpresa());
        System.out.println("Teléfono: " + proveedorVacio.getTelefono());
        System.out.println("Email: " + proveedorVacio.getEmail());
        System.out.println("Dirección: " + proveedorVacio.getDireccion());
        System.out.println("Ciudad: " + proveedorVacio.getCiudad());
        System.out.println("Tipo de Producto: " + proveedorVacio.getTipoProducto());
        System.out.println("Cantidad Suministrada: " + proveedorVacio.getCantidadSuministrada());
        System.out.println("Precio Unitario: " + proveedorVacio.getPrecioUnitario());
        System.out.println("Confiabilidad: " + proveedorVacio.isConfiabilidad());
    }

}
