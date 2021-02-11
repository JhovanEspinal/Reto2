package facturacion;

public class nevera extends electrodomesticos{
    int capacidad;

    public nevera(String nombre, String consumo, String procedencia, double precio, int capacidad) {
        super(nombre, consumo, procedencia, precio);
        this.capacidad = capacidad;
    }



}
