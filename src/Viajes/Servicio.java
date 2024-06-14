package Viajes;

import java.util.Date;

public class Servicio extends Ruta{
    boolean Servicio_vip;

    public Servicio() {
    }

    public Servicio(int ruta, Date fecha_salida, boolean servicio_vip) {
        super(ruta, fecha_salida);
        Servicio_vip = servicio_vip;
    }

    public Servicio(String nombre, int cedula, int ruta, Date fecha_salida, boolean servicio_vip) {
        super(nombre, cedula, ruta, fecha_salida);
        Servicio_vip = servicio_vip;
    }

    public boolean isServicio_vip() {
        return Servicio_vip;
    }

    public void setServicio_vip(boolean servicio_vip) {
        Servicio_vip = servicio_vip;
    }

    @Override
    public double calcular_costo(int ruta) {
        double costo=super.calcular_costo(getRuta());
        if (isServicio_vip()==true){
            return costo+costo*0.3;
        }else{
            return costo;
        }
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        if (isServicio_vip()==true){
            System.out.println("Servicio vip: "+Servicio_vip);
        }else {
            System.out.println("Servicio no Vip: "+Servicio_vip);
        }


    }
}
