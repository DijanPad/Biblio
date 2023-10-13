public class Prestamo {
    
private String titulo; 
private String fSolicitud;
private String fDevolucion;



public Prestamo(String titulo, String fSolicitud, String fDevolucion) {
    this.titulo = titulo;
    this.fSolicitud = fSolicitud;
    this.fDevolucion = fDevolucion;
}

public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getfSolicitud() {
    return fSolicitud;
}
public void setfSolicitud(String fSolicitud) {
    this.fSolicitud = fSolicitud;
}
public String getfDevolucion() {
    return fDevolucion;
}
public void setfDevolucion(String fDevolucion) {
    this.fDevolucion = fDevolucion;
}



}
