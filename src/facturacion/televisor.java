package facturacion;

public class televisor extends electrodomesticos{
    private int pulgadas;
    private boolean TDT;




    public televisor(String nombre, String consumo, String procedencia, double precio, int pulgadas) {
        super(nombre, consumo, procedencia, precio);
        this.pulgadas = pulgadas;
    }
}
