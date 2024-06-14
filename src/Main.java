import Viajes.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date hoy=new Date();

        //Ruta ruta=new Ruta("Paul Cabrera",1751431964,1,hoy);
        //ruta.mostrar_info();

        //Servicio servicio=new Servicio("Paul Cabrera",1751431964,1,hoy,false);
        //servicio.mostrar_info();

        //Servicio_nomal servicio = new Servicio_nomal("Paul Cabrera",1751431964,1,hoy,true,"Ventana",15.5,true);
        //servicio.mostrar_info();

        //Servicio_vip servicio = new Servicio_vip("Paul Cabrera",1751431964,1,hoy,true,15.5,true,"Television");
        //servicio.mostrar_info();

        TICKETS_NOR Ticket1 = new TICKETS_NOR("Paul Cabrera",1751431964,1,hoy,true,"Ventana",15.5,true,"88888",hoy);
        Ticket1.mostrar_info();
    }
}