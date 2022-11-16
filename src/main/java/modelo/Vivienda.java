package modelo;

public class Vivienda extends Propiedad{

    private String numeroCuartos;
    private String numeroBaños;

    public Vivienda (String direccion, String area, String numeroBaños, String numeroCuartos) {

        super(direccion, area);

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
