package modelo;

import java.util.List;

public class Cliente extends Persona{


    public Cliente (String nombre, String numIdentificacion, String numTelefono, String correo ){
        // llama las variable que entraron por parametro y las asigna a las variables que tiene persona

        super(nombre, numIdentificacion, numTelefono, correo);

    }
}
