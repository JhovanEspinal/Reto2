package facturacion;

public class televisor extends electrodomesticos{
    private int pulgadas;
    private Boolean TDT;


    public televisor(String nombre, Character consumo, String procedencia, int pulgadas, Boolean TDT) {
        super(nombre, consumo, procedencia);
        this.pulgadas = pulgadas;
        this.TDT=TDT;
        super.precio();
        precio();
    }

    //calcular precio del televisor
    @Override
    public void precio(){
    Double prec = getPrecio();
     if (pulgadas > 40){
         prec+= prec*0.3;
     }
     if(TDT){
         prec +=250000;
     }
     setPrecio(prec);

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
