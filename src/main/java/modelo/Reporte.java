package modelo;

import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Reporte {

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

    public Reporte (List<Tansaccion> transacciones ){

        this.sumaTotalVenta=sumaTotalVenta;
        this.sumaTotalAlquiler=sumaTotalAlquiler;
        this.alquilerMaxima=alquilerMaxima;
        this.ventaMaxima=ventaMaxima;
        this.alquilerMinima=alquilerMinima;
        this.ventaMinima=ventaMinima;
        this.alquilerPromedio= alquilerPromedio;
        this.ventaPromedio=ventaPromedio;

    }
    public void ReporteVenta( String nombre,List<Tansaccion> transacciones){

        DoubleSummaryStatistics summaryStatistics = transacciones.stream()

                .mapToDouble(Tansaccion::getValor).summaryStatistics();


        ventaMaxima = (float) summaryStatistics.getMax();


        ventaMinima = (float) summaryStatistics.getMin();


        ventaPromedio = (float) summaryStatistics.getAverage();


    }


    public void ReporteAlquiler(String nombre, List<Tansaccion> transacciones) {

        DoubleSummaryStatistics summaryStatistics = transacciones.stream()

                .mapToDouble(Tansaccion::getValor).summaryStatistics();
        sumaTotalAlquiler = (float) summaryStatistics.getSum();

        alquilerMaxima = (float) summaryStatistics.getMax();

        alquilerMinima = (float) summaryStatistics.getMin();

        alquilerPromedio = (float) summaryStatistics.getAverage();

    }


}
