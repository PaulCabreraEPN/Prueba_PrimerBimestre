package Viajes;

import java.util.Date;

public class Servicio_nomal extends Servicio {
    String Asiento;
    double Espacio_maleta;
    boolean maleta_extra;

    public Servicio_nomal() {
    }

    public Servicio_nomal(String nombre, int cedula, int ruta, Date fecha_salida, boolean servicio_vip, String asiento, double espacio_maleta, boolean maleta_extra) {
        super(nombre, cedula, ruta, fecha_salida, servicio_vip);
        Asiento = asiento;
        Espacio_maleta = espacio_maleta;
        this.maleta_extra = maleta_extra;
    }

    public String getAsiento() {
        return Asiento;
    }

    public void setAsiento(String asiento) {
        Asiento = asiento;
    }

    public double getEspacio_maleta() {
        return Espacio_maleta;
    }

    public void setEspacio_maleta(double espacio_maleta) {
        Espacio_maleta = espacio_maleta;
    }

    public boolean getMaleta_extra() {
        return maleta_extra;
    }

    public void setMaleta_extra(boolean maleta_extra) {
        this.maleta_extra = maleta_extra;
    }

    @Override
    public double calcular_costo(int ruta) {
        double costo = super.calcular_costo(getRuta());
        if(maleta_extra==true){
            return costo+3;
        }else{
            return costo;
        }
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Asiento: " + Asiento);
        System.out.println("Espacio maleta: " + Espacio_maleta);
        System.out.println("Maleta extra: " + maleta_extra);
        System.out.println("Costo: "+ calcular_costo(getRuta()));
    }

}
