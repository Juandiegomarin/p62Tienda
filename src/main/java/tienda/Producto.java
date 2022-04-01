package tienda;

import java.util.Comparator;

public abstract class Producto {

    private int codigo;
    private double precio;
    private int IVA;
    private String descripcion;

    public Producto(int codigo, double precio, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.IVA = 21;
        this.descripcion = descripcion;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIVA() {
        return IVA;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producto producto = (Producto) o;

        if (getCodigo() != producto.getCodigo()) return false;
        if (Double.compare(producto.getPrecio(), getPrecio()) != 0) return false;
        if (getIVA() != producto.getIVA()) return false;
        return getDescripcion().equals(producto.getDescripcion());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getCodigo();
        temp = Double.doubleToLongBits(getPrecio());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getIVA();
        result = 31 * result + getDescripcion().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", precio=" + precio +
                ", IVA=" + IVA +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
