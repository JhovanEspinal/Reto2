package facturacion;

public abstract class  electrodomesticos {

    private String nombre;
    private Character consumo;
    private String procedencia;
    private Double precio;

    public electrodomesticos(String nombre, Character consumo, String procedencia) {
        this.nombre = nombre;
        this.consumo = consumo;
        this.procedencia = procedencia;
        precio();

    }

    public void precio(){
       preciobase(this.consumo, this.procedencia);
    }

    public void preciobase(Character consumo, String procedencia){

     switch (consumo) {

         case 'A':
             precio += 450000;
             break;
         case 'B':
             precio += 350000;
             break;
         case 'C':
         default:
             System.out.println("por favor ingrese un consumo correcto  en mayuscula ( A , B , C)");
     }

     if (procedencia.equalsIgnoreCase("Importado")) {
         precio += 350000;
     }

     else if(procedencia.equalsIgnoreCase("Nacional")) {
         precio += 250000;
     }
     else
        {
            System.out.println("por favo ingrese un consumo correcto en mayuscula (A,B, C)");
        }

     }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
