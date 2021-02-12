package facturacion;

public class nevera extends electrodomesticos{
    int capacidad;


    public nevera(String nombre, Character consumo, String procedencia, Integer capacidad) {
        super(nombre, consumo, procedencia);
        this.capacidad = capacidad;
    }


    @Override
    public void precio(){
       if (capacidad > 120) {
           Integer litros = capacidad - 120;
           Integer cantidad = capacidad/10;
           Double prec = getPrecio() + cantidad*getPrecio()+0.05;
           setPrecio(prec);
       }

    }
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
}
}



