package Viajes;

import java.util.Date;

public class Servicio_vip extends Servicio{
    String adicionales;
    double Espacio_maleta;
    boolean maleta_extra2;

    public Servicio_vip() {
    }

    public Servicio_vip(String nombre, int cedula, int ruta, Date fecha_salida, boolean servicio_vip, double espacio_maleta, boolean maleta_extra2, String adicionales) {
        super(nombre, cedula, ruta, fecha_salida, servicio_vip);
        Espacio_maleta = espacio_maleta;
        this.maleta_extra2 = maleta_extra2;
        this.adicionales = adicionales;
    }

    public String getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(String adicionales) {
        this.adicionales = adicionales;
    }

    public double getEspacio_maleta() {
        return Espacio_maleta;
    }

    public void setEspacio_maleta(double espacio_maleta) {
        Espacio_maleta = espacio_maleta;
    }

    public boolean isMaleta_extra2() {
        return maleta_extra2;
    }

    public void setMaleta_extra2(boolean maleta_extra2) {
        this.maleta_extra2 = maleta_extra2;
    }

    @Override
    public double calcular_costo(int ruta) {
        double costo = super.calcular_costo(getRuta());
        if(maleta_extra2==true){
            return costo+6;
        }else{
            return costo;
        }
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Adicionales: " + getAdicionales());
        System.out.println("Espacio Maleta: " + getEspacio_maleta());
        System.out.println("Maletas Extra: " + isMaleta_extra2());
        System.out.println("Costo: " + calcular_costo(getRuta()));
    }
}
