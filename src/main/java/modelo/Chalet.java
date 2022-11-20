package modelo;

import java.util.List;

public class Chalet extends Casa{


    private boolean aguaPotable;
    private boolean servicioAlcantarillado;
    private boolean pozoSeptico;
    private boolean internet;
    private boolean energiaElectrica;
    private boolean gasDomiciliario;


    public Chalet(String direccion, String area, String numeroBaños, String numeroCuartos,String ubicacion,boolean aguaPotable,
                  boolean servicioAlcantarillado, boolean pozoSeptico, boolean internet, boolean energiaElectrica,
                  boolean gasDomiciliario, Ubicacion ubicaciones){

        super(direccion, area, numeroBaños, numeroCuartos,ubicaciones);


        this.aguaPotable=aguaPotable;
        this.servicioAlcantarillado=servicioAlcantarillado;
        this.pozoSeptico=pozoSeptico;
        this.internet=internet;
        this.energiaElectrica= energiaElectrica;
        this.gasDomiciliario= gasDomiciliario;

    }

    public boolean isAguaPotable() {
        return aguaPotable;
    }

    public boolean isServicioAlcantarillado() {
        return servicioAlcantarillado;
    }

    public boolean isPozoSeptico() {
        return pozoSeptico;
    }

    public boolean isInternet() {
        return internet;
    }

    public boolean isEnergiaElectrica() {
        return energiaElectrica;
    }

    public boolean isGasDomiciliario() {
        return gasDomiciliario;
    }
}


