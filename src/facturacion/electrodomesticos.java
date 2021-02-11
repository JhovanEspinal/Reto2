package facturacion;

public  class  electrodomesticos {

    public String nombre;
    public String consumo;
    public String procedencia;
    public Double precio;

    public electrodomesticos(String nombre, String consumo, String procedencia, double precio) {
        this.nombre = nombre;
        this.consumo = consumo;
        this.procedencia = procedencia;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
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
