package org.example.modelos;

public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String ciudad;
    private int edad;
    private String identificacion;
    private String metodoPago;
    private String tipoCliente;
    private boolean esVIP;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor lleno
    public Cliente(String nombre, String direccion, String telefono, String email, String ciudad, int edad, String identificacion, String metodoPago, String tipoCliente, boolean esVIP) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.ciudad = ciudad;
        this.edad = edad;
        this.identificacion = identificacion;
        this.metodoPago = metodoPago;
        this.tipoCliente = tipoCliente;
        this.esVIP = esVIP;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    public String getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }

    public boolean isEsVIP() { return esVIP; }
    public void setEsVIP(boolean esVIP) { this.esVIP = esVIP; }
}
