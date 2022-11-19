package modelo;

public class Usuario extends Persona{

    private String contraseña;

    public Usuario(String nombre, String numIdentificacion, String numTelefono, String correo,
                   String contraseña) {
        super(nombre, numIdentificacion, numTelefono, correo);
        this.contraseña = contraseña;   }


    public String getContraseña() {

        return contraseña;
    }

}

