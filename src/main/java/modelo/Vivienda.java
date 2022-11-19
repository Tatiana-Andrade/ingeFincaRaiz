package modelo;

public class Vivienda extends Propiedad{

    private String numeroCuartos;
    private String numeroBaños;

    public Vivienda (String direccion, String area, String numeroBaños, String numeroCuartos, Ubicacion ubicaciones) {

        super(direccion, area, ubicaciones);

        this.numeroBaños=numeroBaños;
        this.numeroCuartos=numeroCuartos;
    }

    public String getNumeroCuartos() {
        return numeroCuartos;
    }

    public String getNumeroBaños() {
        return numeroBaños;
    }
}
