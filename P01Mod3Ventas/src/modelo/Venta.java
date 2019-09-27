package modelo; 

public class Venta{ 
    private String codigo; 
    private int precio; 
    private int cantidad; 

    public Venta() {
    }

    public Venta(String codigo, int precio, int cantidad) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
} 
