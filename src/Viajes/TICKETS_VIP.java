package Viajes;

import java.util.Date;

public class TICKETS_VIP extends Servicio_vip {
    String codigo;
    Date fecha_compra;

    public TICKETS_VIP() {

    }

    public TICKETS_VIP(String nombre, int cedula, int ruta, Date fecha_salida, boolean servicio_vip, double espacio_maleta, boolean maleta_extra2, String adicionales, String codigo, Date fecha_compra) {
        super(nombre, cedula, ruta, fecha_salida, servicio_vip, espacio_maleta, maleta_extra2, adicionales);
        this.codigo = codigo;
        this.fecha_compra = fecha_compra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    @Override
    public void mostrar_info() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Fecha compra: " + fecha_compra);
        super.mostrar_info();
    }
}
