package tienda;

public final class Musica extends Producto {

    private String grupo;

    public Musica(int codigo, double precio, String descripcion, String grupo) {
        super(codigo, precio, descripcion);
        this.grupo = grupo;
    }

    public Musica() {
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Musica musica = (Musica) o;

        return getGrupo().equals(musica.getGrupo());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getGrupo().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "grupo='" + grupo + '\'' + super.toString() +
                '}';
    }
}
