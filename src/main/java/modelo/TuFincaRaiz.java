package modelo;


import java.util.Date;
import java.util.List;
import java.util.Objects;

public class TuFincaRaiz {

    public List<Usuario> usuarios;
    public List<Empleado> empleados;
    public List<Propiedad> propiedades;
    public List<Propietario> propietarios;
    public List<Cliente> clientes;
    public List<Tansaccion> transacciones;


    public List<TipoTransaccion> tipoTransacciones;


    public TuFincaRaiz(List<Empleado> empleados, List<Propiedad> propiedades,
                       List<Cliente> clientes, List<Tansaccion> transacciones) {

        this.empleados = empleados;
        this.propiedades = propiedades;
        this.clientes = clientes;
        this.transacciones = transacciones;
    }
    //Aqui vamos aregistrar al Emplado
    public void registrarEmpleado( String nombre, String numIdentificacion, String numTelefono,
                                   String correo, String cargo, String contraseña){
        Objects.requireNonNull(nombre, "");
        Objects.requireNonNull(numIdentificacion,"");
        Objects.requireNonNull(numTelefono," ");
        Objects.requireNonNull(correo,"");
        Objects.requireNonNull(cargo, "");

         empleados.add(new Empleado(nombre, numIdentificacion, numTelefono, correo, contraseña));
    }
    //  //Aqui vamos BUSCAR al Emplado
    public Empleado buscarEmpleados ( String numIdentificacion){

        Objects.requireNonNull(numIdentificacion,"");

        return empleados.stream()
                .filter((empleado)-> empleado.getNumIdentificacion().equals(numIdentificacion)
                )
                .findFirst()
                .orElse(null);

    }

    public void registrarClientes(String nombre, String numIdentificacion, String numTelefono, String correo ){
        Objects.requireNonNull( nombre, " el nombre no puede estar vacio");
        Objects.requireNonNull( numIdentificacion, " el numero de identificacion no puede estar vacio");
        Objects.requireNonNull( numTelefono, " el numero de telefono no puede estar vacio");
        Objects.requireNonNull( correo, " el correp no puede estar vacio");


        clientes.add(new Cliente (nombre,numIdentificacion,numTelefono, correo));
    }
    public Cliente buscarCliente ( String numIdentificacion){
        Objects.requireNonNull( numIdentificacion, " el numero de identificacion no puee estar vacio");

        return clientes.stream()

                .filter(( clientes)->clientes.getNumIdentificacion().equals(numIdentificacion)
                )
                // encontrar el primero
                .findFirst()
                // si no lo encuentra me va arrojar vacio
                .orElse(null);

    }
    public void resgistrarPropietario (String nombre, String numIdentificacion, String numTelefono, String correo ){
        Objects.requireNonNull( nombre, " el nombre no puede estar vacio");
        Objects.requireNonNull( numIdentificacion, " el numero de identificacion no puede estar vacio");
        Objects.requireNonNull( numTelefono, " el numero de telefono no puede estar vacio");
        Objects.requireNonNull( correo, " el correp no puede estar vacio");



        propietarios.add(new Propietario (nombre,numIdentificacion,numTelefono, correo));
    }
    public Propietario buscarPropietario( String numIdentificacion){
        Objects.requireNonNull( numIdentificacion, " el numero de identificacion no puee estar vacio");

        return propietarios.stream()

                .filter(( propietarios)->propietarios.getNumIdentificacion().equals(numIdentificacion)
                )
                // encontrar el primero
                .findFirst()
                // si no lo encuentra me va arrojar vacio
                .orElse(null);

    }
    public void registrarPropiedad ( String direccion, String area){
        Objects.requireNonNull(direccion, " la dirreccion no puede estra vacia");
        Objects.requireNonNull(area, "el area no puede eestar vacia");

        propiedades.add(new Propiedad(direccion,area));

    }
    public Propiedad buscarPropiedad (String direccion){
        Objects.requireNonNull(direccion, " la dirreccion no puede estra vacia");

        return propiedades.stream()

                .filter((propiedades)-> propiedades.getDireccion().equals(direccion)
                )
                .findFirst()
                .orElse(null);
    }
    public void registrarTransaccion(String nombre, String numIdentificacion, String numTelefono,
                                     String correo, String contraseña, int venta, int alaquiler ) {

        transacciones.add(new Tansaccion(nombre, numIdentificacion, numTelefono, correo, contraseña, venta, alaquiler));
    }


    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Tansaccion> getTransacciones() {
        return transacciones;
    }
}
