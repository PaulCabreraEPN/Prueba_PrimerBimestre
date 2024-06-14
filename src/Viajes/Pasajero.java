package Viajes;

public class Pasajero {
    String nombre;
    int cedula;

    public Pasajero() {
    }

    public Pasajero(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void mostrar_info() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
    }
}
