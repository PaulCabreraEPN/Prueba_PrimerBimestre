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

    @Override
    public void mostrar_info() {
        super.mostrar_info();

        System.out.println("Ruta: " + Ruta);
        System.out.println("Fecha salida: " + fecha_salida);
    }
}
