public class Texto {

private Boolean disponible;
private String titulo;
private String autor;
private int nIdentif;
private String materia;
private int cantidad;


//metodos

//Constructor
protected Texto(Boolean disponible, String titulo, String autor, int nIdentif, String materia, int cantidad) {
    this.disponible = disponible;
    this.titulo = titulo;
    this.autor = autor;
    this.nIdentif = nIdentif;
    this.materia = materia;
    this.cantidad = cantidad;
}

protected Boolean getDisponible() {
    return disponible;
}
protected void setDisponible(Boolean disponible) {
    this.disponible = disponible;
}
protected String getTitulo() {
    return titulo;
}
protected void setTitulo(String titulo) {
    this.titulo = titulo;
}
protected String getAutor() {
    return autor;
}
protected void setAutor(String autor) {
    this.autor = autor;
}
protected int getnIdentif() {
    return nIdentif;
}
protected void setnIdentif(int nIdentif) {
    this.nIdentif = nIdentif;
}
protected String getMateria() {
    return materia;
}
protected void setMateria(String materia) {
    this.materia = materia;
}
protected int getCantidad() {
    return cantidad;
}
protected void setCantidad(int cantidad) {
    this.cantidad = cantidad;
}

@Override
public String toString() {
    return  "Titulo: " + titulo + ", autor: " + autor + ", materia: " + materia + ", cantidad: " + cantidad;
}



}
