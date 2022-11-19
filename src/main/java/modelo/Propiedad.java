package modelo;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private String direccion;
    private String area;

    private  Ubicacion ubicaciones;



    public Propiedad(String direccion, String area, Ubicacion ubicaciones ) {

        this.direccion = direccion;
        this.area = area;
        this.ubicaciones= ubicaciones;

    }

    public String getDireccion() {

        return direccion;
    }

    public String getArea() {
         return area;
    }




}

