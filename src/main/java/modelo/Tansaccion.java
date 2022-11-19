package modelo;

import java.util.Date;
import java.util.List;

import static modelo.TipoTransaccion.ALQUILER;
import static modelo.TipoTransaccion.VENTA;

public class Tansaccion {


    private final int valor;

    private final Date fecha;

    private final TipoTransaccion tipoTransacciones;

    private final Empleado empleado;

    private final Propiedad propiedad;

    private final Cliente cliente;

    private final Propietario propietario;

    public Tansaccion(int valor, Date fecha, TipoTransaccion tipoTransacciones, Empleado empleado, Propiedad propiedad,
                      Cliente cliente, Propietario propietario) {
        this.valor = valor;
        this.fecha = fecha;
        this.tipoTransacciones = tipoTransacciones;
        this.empleado = empleado;
        this.propiedad = propiedad;
        this.cliente = cliente;
        this.propietario = propietario;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getValor() {
        return valor;
    }

    public TipoTransaccion getTipoTransacciones() {
        return tipoTransacciones;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}