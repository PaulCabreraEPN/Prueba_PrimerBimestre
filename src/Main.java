import Viajes.Pasajero;
import Viajes.Ruta;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date hoy=new Date();

        Ruta ruta=new Ruta("Paul Cabrera",1751431964,1,hoy);
        ruta.mostrar_info();

    }
}