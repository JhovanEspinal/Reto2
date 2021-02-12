package facturacion;
import java.util.Scanner;
public class ventas {


    public void menu() {
        Boolean parar = Boolean.TRUE;
        do {
            menuM();
            Integer opcion = retornarOP();
            parar = menucase(opcion);

        } while (parar);
    }

   //

    public void menuM() {

        System.out.println("Bievenido al sistema facturación");
        System.out.println("Escoga una opción");
        System.out.println(" 1. Gestionar televisor \n 2. gestionar nevera \n 3.Gestionar electrodomestico \n 4.mostrar ventas \n 5. Salir ");
    }

    public int retornarOP() {
        Integer opcion;
        Scanner lector = new Scanner(System.in);
        while (!lector.hasNextInt()) lector.next();
        opcion = lector.nextInt();
        return opcion;
    }

    public () {
        Integer opcion;
        Scanner lector = new Scanner(System.in);
        while (!lector.hasNextInt()) lector.next();
        opcion = lector.nextInt();
        return opcion;
    }

    public Boolean menucase(Integer opcion) {
        switch (opcion) {

            case 1: gestionartelevisor();
                return true;
            case 2: gestionarnevera();
                return true;
            case 3: gestionarelesctrodomestico();
            return true;
            case 4: mostrarventas;
            case 5:
                return false;
            default:
                System.out.println("Por favor escoja una opción validad");
                return true;



        }



}










