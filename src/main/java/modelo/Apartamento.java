package modelo;

import java.util.List;

public class Apartamento extends Vivienda {


    private boolean balcones;
    private boolean servicioAscensor;
    private String pisoUbicacion;
    private String valorAdministracion;
    private String numeroParqueaderos;


    public Apartamento( String direccion, String area, String numeroBaños, String numeroCuartos,boolean balcones, boolean servicioAscensor,
                        String pisoUbicacion,String valorAdministracion,String numeroParqueaderos,Ubicacion zona){

        super(direccion, area, numeroBaños,numeroCuartos, zona);


        this.balcones= balcones;
        this.servicioAscensor=servicioAscensor;
        this.pisoUbicacion=pisoUbicacion;
        this.valorAdministracion=valorAdministracion;
        this.numeroParqueaderos=numeroParqueaderos;


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

}

