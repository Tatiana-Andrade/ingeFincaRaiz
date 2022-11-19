package modelo;


import java.util.*;

public class TuFincaRaiz {

    public List<Usuario> usuarios;
    public List<Propiedad> propiedades;
    public List<Propietario> propietarios;
    public List<Cliente> clientes;
    public List<Tansaccion> transacciones;
    public List<Empleado> empleados;



    public TuFincaRaiz() {

        this.empleados = new ArrayList<>();
        this.propiedades =new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.transacciones = new ArrayList<>();
    }
    //Aqui vamos aregistrar al Emplado
    public void registrarEmpleado( String nombre, String numIdentificacion, String numTelefono,
                                   String correo, String cargo, String contraseña){
        Objects.requireNonNull(nombre, "");
        Objects.requireNonNull(numIdentificacion,"");
        Objects.requireNonNull(numTelefono," ");
        Objects.requireNonNull(correo,"");
        Objects.requireNonNull(cargo, "");

         usuarios.add(new Empleado(nombre, numIdentificacion, numTelefono, correo, contraseña));
    }
    //  //Aqui vamos BUSCAR al Emplado
    public Empleado buscarEmpleados ( String numIdentificacion){

        Objects.requireNonNull(numIdentificacion,"");

        return usuarios.stream()
                // Filtrar solo empleados

                .map(e->(Empleado)e)
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
    public void registrarPropiedad ( String direccion, String area, Ubicacion ubicaciones){
        Objects.requireNonNull(direccion, " la dirreccion no puede estra vacia");
        Objects.requireNonNull(area, "el area no puede eestar vacia");

        propiedades.add(new Propiedad(direccion,area, ubicaciones));

    }
    public Propiedad buscarPropiedad (String direccion){
        Objects.requireNonNull(direccion, " la dirreccion no puede estra vacia");

        return propiedades.stream()

                .filter((propiedades)-> propiedades.getDireccion().equals(direccion)
                )
                .findFirst()
                .orElse(null);
    }
    public void registrarTransaccion(int valor, Date fecha, TipoTransaccion tipoTransacciones, Empleado empleado, Propiedad propiedad,
                                     Cliente cliente, Propietario propietario) {

        transacciones.add(new Tansaccion(valor, fecha, tipoTransacciones, empleado, propiedad, cliente, propietario));
    }


    public List<Empleado> getEmpleados() {

        return Collections.EMPTY_LIST;
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
