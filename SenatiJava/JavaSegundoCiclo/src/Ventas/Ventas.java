/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventas;

/**
 *
 * @author Alumno
 */
public class Ventas {
    private double precio;
    private int cantidad;
    private String Codigo;
    private String nombre;
    private String vendedor;
    double total;
    public Ventas(double precio, int cantidad, String Codigo, String nombre, String vendedor) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.vendedor = vendedor;
    }
    
    public double precioTotal(){
        total = Math.floor(this.precio*this.cantidad);
        return total;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    @Override
    public String toString() {
        return "Venta: {"+
                "Código='" + Codigo + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Precio=" + precio +
                ", Cantidad=" + cantidad +
                ", Vendedor=" + vendedor +
                ", Precio=" + precioTotal()  +
                '}';
    }
}
