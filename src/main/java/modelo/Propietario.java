package modelo;

import java.util.List;

public class Propietario extends Persona{

    private List<Propiedad> propiedades;
    private List<Persona> personas;

    public Propietario(String nombre, String numIdentificacion, String numTelefono, String correo) {

        super( nombre, numIdentificacion, numTelefono, correo);
        this.propiedades = propiedades;

    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public List<Persona> getPersonas() {
        return personas;
    }
}
