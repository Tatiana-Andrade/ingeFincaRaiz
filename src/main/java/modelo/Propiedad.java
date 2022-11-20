package modelo;

public class Propiedad {
    private String direccion;
    private String area;

    private Ubicacion zona;


    public Propiedad(String direccion, String area, Ubicacion zona) {

        this.direccion = direccion;
        this.area = area;
        this.zona = zona;

    }


    public String getDireccion() {
        return direccion;
    }
}