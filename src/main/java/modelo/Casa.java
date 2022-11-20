package modelo;

import java.util.List;


public class Casa extends Vivienda {

    private String numeroPisos;
    private String materialConstruccion;


    public Casa ( String direccion, String area, String numeroBaños, String numeroCuartos, Ubicacion zona){

        super(direccion, area, numeroBaños, numeroCuartos, zona);

        this.numeroPisos=numeroPisos;
        this.materialConstruccion=materialConstruccion;


    }


    public String getNumeroPisos() {

        return numeroPisos;
    }

    public String getMaterialConstruccion() {

        return materialConstruccion;
    }

}
