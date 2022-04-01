package tienda;

public abstract class Ropa extends Producto implements SeEnvia {

    private String marca;

    public Ropa(int codigo, double precio, String descripcion, String marca) {
        super(codigo, precio, descripcion);
        this.marca = marca;
    }

    public Ropa() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ropa ropa = (Ropa) o;

        return getMarca().equals(ropa.getMarca());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getMarca().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "marca='" + marca + '\'' + super.toString() +
                '}';
    }
}
