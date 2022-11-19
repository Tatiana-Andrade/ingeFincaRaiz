package modelo;

import java.util.List;

public class Edificio extends Propiedad{



    private String numeroPisos;

    public Edificio ( String direccion, String area, String numeroPisos, Ubicacion ubicaciones){

        super(direccion, area, ubicaciones);

        this.numeroPisos=numeroPisos;


    }

    public String getNumeroPisos() {
        return numeroPisos;
    }

  
}
