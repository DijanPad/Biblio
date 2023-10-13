public class Libro extends Texto{
    
    private String editorial;


    public Libro(Boolean disponible, String titulo, String autor, int nIdentif, String materia, int cantidad, String editorial) {
        super(disponible, titulo, autor, nIdentif, materia, cantidad);
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    

}
