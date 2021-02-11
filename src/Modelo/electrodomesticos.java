package Modelo;

public abstract class  electrodomesticos {

    public int id;
    public  String consumo;
    public  String procedencia;
    public double precio;

    public electrodomesticos(int id, String consumo, String procedencia, double precio) {
        this.id = id;
        this.consumo = consumo;
        this.procedencia = procedencia;
        this.precio = precio;
    }
}
