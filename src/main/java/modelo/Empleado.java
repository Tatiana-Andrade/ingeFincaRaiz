package modelo;
import java.util.List;


public class Empleado extends Usuario{

    private List<Tansaccion> transacciones;


    public Empleado(String nombre, String numIdentificacion, String numTelefono, String correo, String contraseña) {
        super(nombre, numIdentificacion, numTelefono, correo, contraseña);
    }


    public List<Tansaccion> getTransacciones() {

        return transacciones;
    }
}
