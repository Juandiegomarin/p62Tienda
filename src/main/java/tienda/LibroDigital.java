package tienda;

public class LibroDigital extends Libro implements SeDescarga {

    private double numeroKBytes;

    public LibroDigital(int codigo, double precio, String descripcion, int isbn, double numeroKBytes) {
        super(codigo, precio, descripcion, isbn);
        this.numeroKBytes = numeroKBytes;
    }

    public LibroDigital() {
    }

    public double getNumeroKBytes() {
        return numeroKBytes;
    }

    public void setNumeroKBytes(double numeroKBytes) {
        this.numeroKBytes = numeroKBytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LibroDigital that = (LibroDigital) o;

        return Double.compare(that.getNumeroKBytes(), getNumeroKBytes()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getNumeroKBytes());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "LibroDigital{" +
                "numeroKBytes=" + numeroKBytes + super.toString() +
                '}';
    }

    @Override
    public void descargar() {
        System.out.println("http://JuanDiego.daw/" + hashCode());
    }

    @Override
    public void comprarLibro() {
        System.out.println("Se ha comprado el libro con tarjeta");
    }
}
