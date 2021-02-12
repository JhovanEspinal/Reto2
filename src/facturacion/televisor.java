package facturacion;

public class televisor extends electrodomesticos{
    private int pulgadas;
    private boolean TDT;


    public televisor(String nombre, Character consumo, String procedencia, int pulgadas) {
        super(nombre, consumo, procedencia);
        this.pulgadas = pulgadas;
    }

    //calcular precio del televisor
    @Override
    public void precio(){
    Double prec = getPrecio();
     if (pulgadas > 40){
         prec+= prec*0.3;
     }



    }
    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
}
