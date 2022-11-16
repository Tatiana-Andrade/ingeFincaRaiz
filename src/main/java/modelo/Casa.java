package modelo;

import java.util.List;


public class Casa extends Vivienda {

    private String numeroPisos;
    private String materialConstruccion;

    private String ubicacion;


    public Casa ( String direccion, String area, String numeroBaños, String numeroCuartos, String ubicacion){

        super(direccion, area, numeroBaños, numeroCuartos);

        this.numeroPisos=numeroPisos;
        this.materialConstruccion=materialConstruccion;
        this.ubicacion=ubicacion;

    }


    public String getNumeroPisos() {

        return numeroPisos;
    }

    public String getMaterialConstruccion() {

        return materialConstruccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
