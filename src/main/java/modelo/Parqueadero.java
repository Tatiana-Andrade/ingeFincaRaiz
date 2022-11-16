package modelo;

import java.util.List;

public class Parqueadero extends Propiedad{

    private List<Propiedad> propiedades;


    public  Parqueadero( String direccion, String area){
        super(direccion, area);

    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }
}
