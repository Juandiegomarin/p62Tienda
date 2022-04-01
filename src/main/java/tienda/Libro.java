package tienda;

public abstract class Libro extends Producto implements Comparable<Libro> {

    private int isbn;

    public Libro(int codigo, double precio, String descripcion, int isbn) {
        super(codigo, precio, descripcion);
        this.isbn = isbn;
    }

    public Libro() {
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Libro libro = (Libro) o;

        return getIsbn() == libro.getIsbn();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getIsbn();
        return result;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' + super.toString() +
                '}';
    }

    public int compareTo(Libro o) {
        if (this.getIsbn() > o.getIsbn()) {

            return 1;
        } else if (this.getIsbn() < o.getIsbn()) {
            return -1;
        } else {
            return 0;
        }
    }

    public abstract void comprarLibro();
}
