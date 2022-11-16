package modelo;

import java.util.List;

public class Propiedad {
    private String direccion;
    private String area;




    public Propiedad(String direccion, String area ) {

        this.direccion = direccion;
        this.area = area;


    }

    public String getDireccion() {

        return direccion;
    }

    public String getArea() {
         return area;
    }


}

