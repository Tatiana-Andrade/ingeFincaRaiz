package modelo;

import java.util.List;

public class Edificio extends Propiedad{



    private String numeroPisos;

    public Edificio ( String direccion, String area, String numeroPisos, Ubicacion zona){

        super(direccion, area, zona);

        this.numeroPisos=numeroPisos;


    }

    public String getNumeroPisos() {
        return numeroPisos;
    }

  
}
