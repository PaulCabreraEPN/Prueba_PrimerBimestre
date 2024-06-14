package Viajes;

import java.util.Date;

public class Ruta extends Pasajero{

    int Ruta;
    Date fecha_salida;

    public Ruta() {
    }

    public Ruta(int ruta, Date fecha_salida) {
        Ruta = ruta;
        this.fecha_salida = fecha_salida;
    }

    public Ruta(String nombre, int cedula, int ruta, Date fecha_salida) {
        super(nombre, cedula);
        Ruta = ruta;
        this.fecha_salida = fecha_salida;
    }

    public int getRuta() {
        return Ruta;
    }

    public void setRuta(int ruta) {
        Ruta = ruta;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public double calcular_costo(int ruta){

        if (Ruta==1){
            return 20.00;
        } else if (Ruta==2) {
            return 15.00;
        } else if (Ruta==3) {
            return 17.50;
        } else if (Ruta==4) {
            return 17.50;
        }

        return 0;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        if (Ruta==1){
            System.out.println("Ruta: Quito-Guayaquil ");
        } else if (Ruta==2) {
            System.out.println("Ruta: Quito-Puyo ");
        } else if (Ruta==3) {
            System.out.println("Ruta: Quito-Tulcán ");
        } else if (Ruta==4) {
            System.out.println("Ruta: Quito-Riobamba  ");
        }
        System.out.println("Fecha salida: " + fecha_salida);
    }
}
