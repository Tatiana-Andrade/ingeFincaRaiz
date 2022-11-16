package modelo;

import java.util.List;

public class Edificio extends Propiedad{

    private String ubicacion;

    private String numeroPisos;

    public Edificio ( String direccion, String area, String numeroPisos, String ubicacion){

        super(direccion, area);

        this.numeroPisos=numeroPisos;
        this.ubicacion=ubicacion;

    }

    public String getNumeroPisos() {
        return numeroPisos;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
