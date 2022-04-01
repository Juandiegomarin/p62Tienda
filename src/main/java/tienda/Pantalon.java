package tienda;

public final class Pantalon extends Ropa {

    private String talla;

    public Pantalon(int codigo, double precio, String descripcion, String marca, String talla) {
        super(codigo, precio, descripcion, marca);
        this.talla = talla;
    }

    public Pantalon() {
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pantalon pantalon = (Pantalon) o;

        return getTalla().equals(pantalon.getTalla());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getTalla().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "talla='" + talla + '\'' + super.toString()
                + '}';
    }


    public void enviar(String direccion) {
        System.out.println("Esta pantalón de marca " + getMarca() + " y talla " + getTalla() + " se enviará a la dirección " + direccion);
    }
}
