package modelo;

import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Reporte extends Tansaccion{

    private float sumaTotalVenta;
    private  float ventaMaxima;
    private  float ventaMinima;
    private  float ventaPromedio;

    private float sumaTotalAlquiler;
    private  float alquilerMaxima;
    private  float alquilerMinima;
    private  float alquilerPromedio;

    private  String nombre;
    private List<Tansaccion> transacciones;

    public Reporte ( String nombre, String numIdentificacion, String numTelefono, String correo, String contraseña,
                     int venta, int alquiler, float ventaMaxima,float ventaMinima, float ventaPromedio,
                     float sumaTotalVenta, float alquilerMaxima,float alquilerMinima, float alquilerPromedio, float sumaTotalAlquiler){

        super(nombre, numIdentificacion, numTelefono, correo, contraseña, venta, alquiler);

        this.sumaTotalVenta=sumaTotalVenta;
        this.sumaTotalAlquiler=sumaTotalAlquiler;
        this.alquilerMaxima=alquilerMaxima;
        this.ventaMaxima=ventaMaxima;
        this.alquilerMinima=alquilerMinima;
        this.ventaMinima=ventaMinima;
        this.alquilerPromedio= alquilerPromedio;
        this.ventaPromedio=ventaPromedio;

    }
    public float ReporteVenta( String nombre,List<Tansaccion> transacciones){

        DoubleSummaryStatistics summaryStatistics = transacciones.stream()

                .mapToDouble(Tansaccion::getVenta).summaryStatistics();


        ventaMaxima = (float) summaryStatistics.getMax();


        ventaMinima = (float) summaryStatistics.getMin();


        ventaPromedio = (float) summaryStatistics.getAverage();


    }





    public Void ReporteAlquiler(String nombre, List<Tansaccion> transacciones) {

        DoubleSummaryStatistics summaryStatistics = transacciones.stream()

                .mapToDouble(Tansaccion::getAlquiler).summaryStatistics();
        sumaTotalAlquiler = (float) summaryStatistics.getSum();

        alquilerMaxima = (float) summaryStatistics.getMax();

        alquilerMinima = (float) summaryStatistics.getMin();

        alquilerPromedio = (float) summaryStatistics.getAverage();


    }


}
