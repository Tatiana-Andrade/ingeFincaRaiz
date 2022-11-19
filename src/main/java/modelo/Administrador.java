package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Administrador extends Usuario{


    private String cargo;

    public Administrador(String nombre, String numIdentificacion, String numTelefono,
                         String correo, String cargo, String contraseña) {

        super(nombre, numIdentificacion, numTelefono, correo, contraseña);
        this.cargo = cargo;

    }

    public String getCargo() {
        return cargo;
    }
}
