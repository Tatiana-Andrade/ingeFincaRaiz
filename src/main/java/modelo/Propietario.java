package modelo;

import java.util.ArrayList;
import java.util.List;

public class Propietario extends Persona{

    private List<Propiedad> propiedades;
    public Propietario(String nombre, String numIdentificacion, String numTelefono, String correo) {

        super( nombre, numIdentificacion, numTelefono, correo);
        this.propiedades = new ArrayList<>();

    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

}
