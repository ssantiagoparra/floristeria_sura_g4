package org.example.modelos;

public class Flor {
    private String nombre;
    private String color;
    private double precio;
    private String tipo;
    private String proveedor;
    private String origen;
    private boolean esAromatica;
    private int cantidadDisponible;
    private double altura;
    private boolean esExotica;

    // Constructor vacío
    public Flor() {
    }

    // Constructor lleno
    public Flor(String nombre, String color, double precio, String tipo, String proveedor, String origen, boolean esAromatica, int cantidadDisponible, double altura, boolean esExotica) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.tipo = tipo;
        this.proveedor = proveedor;
        this.origen = origen;
        this.esAromatica = esAromatica;
        this.cantidadDisponible = cantidadDisponible;
        this.altura = altura;
        this.esExotica = esExotica;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getProveedor() { return proveedor; }
    public void setProveedor(String proveedor) { this.proveedor = proveedor; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public boolean isEsAromatica() { return esAromatica; }
    public void setEsAromatica(boolean esAromatica) { this.esAromatica = esAromatica; }

    public int getCantidadDisponible() { return cantidadDisponible; }
    public void setCantidadDisponible(int cantidadDisponible) { this.cantidadDisponible = cantidadDisponible; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public boolean isEsExotica() { return esExotica; }
    public void setEsExotica(boolean esExotica) { this.esExotica = esExotica; }
}
