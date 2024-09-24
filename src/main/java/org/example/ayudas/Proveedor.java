package org.example.ayudas;

public class Proveedor {
    private String nombre;
    private String empresa;
    private String telefono;
    private String email;
    private String direccion;
    private String ciudad;
    private String tipoProducto;
    private int cantidadSuministrada;
    private double precioUnitario;
    private boolean confiabilidad;

    // Constructor vacío
    public Proveedor() {
    }

    // Constructor lleno
    public Proveedor(String nombre, String empresa, String telefono, String email, String direccion, String ciudad, String tipoProducto, int cantidadSuministrada, double precioUnitario, boolean confiabilidad) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.tipoProducto = tipoProducto;
        this.cantidadSuministrada = cantidadSuministrada;
        this.precioUnitario = precioUnitario;
        this.confiabilidad = confiabilidad;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getTipoProducto() { return tipoProducto; }
    public void setTipoProducto(String tipoProducto) { this.tipoProducto = tipoProducto; }

    public int getCantidadSuministrada() { return cantidadSuministrada; }
    public void setCantidadSuministrada(int cantidadSuministrada) { this.cantidadSuministrada = cantidadSuministrada; }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }

    public boolean isConfiabilidad() { return confiabilidad; }
    public void setConfiabilidad(boolean confiabilidad) { this.confiabilidad = confiabilidad; }
}

