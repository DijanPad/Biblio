public class Cliente {

private int nIdentif;
private String nombre;
private String dirección;
private Prestamo[] prestamos;



public Cliente(int nIdentif, String nombre, String dirección) {
    this.nIdentif = nIdentif;
    this.nombre = nombre;
    this.dirección = dirección;
    this.prestamos = new Prestamo[5];
}
public int getnIdentif() {
    return nIdentif;
}
public void setnIdentif(int nIdentif) {
    this.nIdentif = nIdentif;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getDirección() {
    return dirección;
}
public void setDirección(String dirección) {
    this.dirección = dirección;
}
public Prestamo[] getPrestamos() {
    return prestamos;
}
public void setPrestamos(Prestamo[] prestamos) {
    this.prestamos = prestamos;
}
    
}
