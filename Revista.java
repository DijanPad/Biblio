public class Revista extends Texto{
    
    private int anio;
    private  int numero;

    public Revista(Boolean disponible, String titulo, int nIdentif, String materia, int cantidad, int anio, int numero) {
        super(disponible, titulo, "", nIdentif, materia, cantidad);
        this.anio = anio;
        this.numero = numero;
    }


    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return super.toString() + ", anio: " + anio + ", numero: " + numero;
    }

    


}
