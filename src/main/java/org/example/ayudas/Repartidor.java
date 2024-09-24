package org.example.ayudas;

public class Repartidor {
    private String nombre;
    private String telefono;
    private String direccion;
    private String ciudad;
    private int edad;
    private String tipoVehiculo;
    private String licencia;
    private int experiencia;
    private boolean disponibilidad;
    private String turno;

    // Constructor vacío
    public Repartidor() {
    }

    // Constructor lleno
    public Repartidor(String nombre, String telefono, String direccion, String ciudad, int edad, String tipoVehiculo, String licencia, int experiencia, boolean disponibilidad, String turno) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.edad = edad;
        this.tipoVehiculo = tipoVehiculo;
        this.licencia = licencia;
        this.experiencia = experiencia;
        this.disponibilidad = disponibilidad;
        this.turno = turno;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getTipoVehiculo() { return tipoVehiculo; }
    public void setTipoVehiculo(String tipoVehiculo) { this.tipoVehiculo = tipoVehiculo; }

    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    public int getExperiencia() { return experiencia; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    public boolean isDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
}

