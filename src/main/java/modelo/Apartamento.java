package modelo;

import java.util.List;

public class Apartamento extends Vivienda {

    private String ubicacion;
    private boolean balcones;
    private boolean servicioAscensor;
    private String pisoUbicacion;
    private String valorAdministracion;
    private String numeroParqueaderos;


    public Apartamento( String direccion, String area, String numeroBaños, String numeroCuartos,boolean balcones, boolean servicioAscensor,
                        String pisoUbicacion,String valorAdministracion,String numeroParqueaderos, String ubicacion){

        super(direccion, area, numeroBaños,numeroCuartos);


        this.balcones= balcones;
        this.servicioAscensor=servicioAscensor;
        this.pisoUbicacion=pisoUbicacion;
        this.valorAdministracion=valorAdministracion;
        this.numeroParqueaderos=numeroParqueaderos;
        this.ubicacion=ubicacion;

    }
    public boolean isBalcones() {
        balcones = false;

       return balcones;
      }

    public boolean isServicioAscensor() {
        servicioAscensor= false;

       return servicioAscensor;
   }


    public String getValorAdministracion() {
        return valorAdministracion;
    }

    public String getNumeroParqueaderos() {
        return numeroParqueaderos;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}

