package modelo;

import java.util.List;

public class Bodega extends Propiedad {


    private String ubicacion;


    public Bodega ( String direccion, String area, String ubicacion){
        super(direccion, area);


        this.ubicacion=ubicacion;


    }

    public String getUbicacion() {
        return ubicacion;
    }
}

