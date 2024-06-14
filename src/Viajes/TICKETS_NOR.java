package Viajes;

import java.util.Date;

public class TICKETS_NOR  extends Servicio_nomal{
    String codigo;
    Date fecha_compra;

    public TICKETS_NOR() {

    }

    public TICKETS_NOR(String nombre, int cedula, int ruta, Date fecha_salida, boolean servicio_vip, String asiento, double espacio_maleta, boolean maleta_extra, String codigo, Date fecha_compra) {
        super(nombre, cedula, ruta, fecha_salida, servicio_vip, asiento, espacio_maleta, maleta_extra);
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
