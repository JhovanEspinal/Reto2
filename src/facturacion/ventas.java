package facturacion;
import java.util.Scanner;
public class ventas {

    Boolean parar = Boolean.TRUE;
    public void menu (){

    do{
        menuM();
        Integer opcion = retornarOP();


    }while(parar);
}



    public void menuM () {

        System.out.println("Bievenido al sistema facturación");
        System.out.println("Escoga una opción");
        System.out.println(" 1. Gestionar televisor \n 2. gestionar nevera \n 3.Gestionar electrodomestico \n 4.mostrar ventas \n 5. Salir ");
    }

    public int retornarOP() {
        Integer opcion;
        Scanner lector = new Scanner(System.in);
        while(!lector.hasNextInt()) lector.next();
        opcion = lector.nextInt();
        return opcion;
    }

    public Boolean menucase(Integer opcion){
        switch (opcion){

            case 1 :








        }



    }




      }







