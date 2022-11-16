package modelo;

public class Persona {
    private String nombre;
    private String numIdentificacion;
    private String numTelefono;
    private String correo;

    public Persona(String nombre, String numIdentificacion, String numTelefono, String correo) {
        this.nombre = nombre;
        this.numIdentificacion = numIdentificacion;
        this.numTelefono = numTelefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
