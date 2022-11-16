package modelo;

import java.util.Date;
import java.util.List;

import static modelo.TipoTransaccion.ALQUILER;
import static modelo.TipoTransaccion.VENTA;

public class Tansaccion extends Empleado {


    private int venta;

    private int alquiler;
    private Date fecha;

    private List<TipoTransaccion> tipoTransacciones;


    public Tansaccion(String nombre, String numIdentificacion, String numTelefono, String correo, String contraseña, int venta, int alquiler) {
        super(nombre, numIdentificacion, numTelefono, correo, contraseña);

        this.fecha = fecha;
        this.tipoTransacciones = tipoTransacciones;
        this.venta = venta;
        this.alquiler = alquiler;

    }

    public Date getFecha() {
        return fecha;
    }

    public List<TipoTransaccion> getTipoTransacciones() {
        return tipoTransacciones;
    }

    public int getVenta() {

        return venta;
    }

    public int getAlquiler() {

        return alquiler;
    }
}