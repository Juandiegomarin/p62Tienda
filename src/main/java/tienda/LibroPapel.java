package tienda;

public final class LibroPapel extends Libro implements SeEnvia {

    private int numeroPaginas;

    public LibroPapel(int codigo, double precio, String descripcion, int isbn, int numeroPaginas) {
        super(codigo, precio, descripcion, isbn);
        this.numeroPaginas = numeroPaginas;
    }

    public LibroPapel() {
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LibroPapel that = (LibroPapel) o;

        return getNumeroPaginas() == that.getNumeroPaginas();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getNumeroPaginas();
        return result;
    }

    @Override
    public String toString() {
        return "LibroPapel{" +
                "numeroPaginas=" + numeroPaginas + super.toString() +
                '}';
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("Este libro de isbn " + getIsbn() + " y número de páginas" + getNumeroPaginas() + "se enviará a la dirección " + direccion);
    }

    @Override
    public void comprarLibro() {
        System.out.println("Se ha comprado el libro con metálico");
    }
}
