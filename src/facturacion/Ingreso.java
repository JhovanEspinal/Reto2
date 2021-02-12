package facturacion;
import java.util.Scanner;
import java.util.ArrayList;


public class Ingreso {

    Scanner lector = new Scanner(System.in);

    private ArrayList<electrodomesticos> productos;

    public Ingreso() { productos = new ArrayList<electrodomesticos>();
    }

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
        while (!lector.hasNextInt()) lector.next();
        opcion = lector.nextInt();
        return opcion;
    }


    public Boolean menucase(Integer opcion) {
        switch (opcion) {

            case 1:
                gestionarTelevisor();
                return true;
            case 2:
                gestionarnevera();
                return true;
            case 3:
                gestionarElectrodomestico();
                return true;
            case 4:
                mostrarventa();
            case 5:
                return false;
            default:
                System.out.println("Por favor escoja una opción validad");
                return true;


        }
    }

    public void gestionarTelevisor() {
        System.out.println("Ingrese el nombre: ");
        String nombre = lector.nextLine();
        System.out.println("Ingrese el consumo [A, B o C]: ");
        Character consumo = lector.next().charAt(0);
        System.out.print("Ingre la procedencia [Nacional o Importado]: ");
        String procedencia = lector.nextLine();
        System.out.println("\nIngrese las pulgadas(entero):");
        Integer pulgadas = inputInteger();
        System.out.println("\nIngrese Si tiene TDT[Si o No]");
        String tieneTdt = lector.nextLine();
        boolean TDT = false;
        if (tieneTdt.equalsIgnoreCase("Si")) {
            TDT = true;
        }
        televisor Televisor = new televisor(nombre, consumo, procedencia, pulgadas, TDT);
        productos.add(Televisor);
    }

    public void gestionarnevera() {
        System.out.println("Ingrese el nombre: ");
        String nombre =inputString();
        System.out.println("Ingrese el consumo [A, B o C]: ");
        Character consumo = lector.next().charAt(0);
        System.out.println("Ingre la procedencia [Nacional o Importado]: ");
        String procedencia = inputString();
        System.out.println("Ingrese la capacidad: ");
        Integer capacidad = inputInteger();

        nevera Nevera = new nevera(nombre, consumo, procedencia, capacidad);
        productos.add(Nevera);
    }

    public void gestionarElectrodomestico() {
        System.out.println("Ingrese el nombre: ");
        String nombre = inputString();
        System.out.println("Ingrese el consumo [A, B o C]: ");
        Character consumo = inputCharacter();
        System.out.print("Ingre la procedencia [Nacional o Importado]: ");
        String procedencia =inputString();
        electrodomesticos electrodomestico = new electrodomesticos(nombre, consumo, procedencia);


    }

    public void mostrarventa() {
        Double totalElectro = 0.0, totalNevera = 0.0, totalTelevi = 0.0;
        Double totalElectro2 = 0.0, totalNevera2 = 0.0, totalTelevi2 = 0.0;
        for (electrodomesticos electro : productos) {
            if (electro instanceof nevera) {
                totalNevera += electro.getPrecio();
            } else if (electro instanceof televisor) {
                totalTelevi += electro.getPrecio();
            } else {
                totalElectro += electro.getPrecio();
            }
        }
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getClass().equals(nevera.class)) {
                totalNevera += productos.get(i).getPrecio();
            }
            if (productos.get(i).getClass().equals(televisor.class)) {
                totalTelevi2 += productos.get(i).getPrecio();
            } else {
                totalElectro += productos.get(i).getPrecio();
            }
        }
        System.out.print("\nNevera: " + totalNevera + "\nTelevisor: " + totalTelevi + "\nElectro: " + totalElectro);
        System.out.print("\nNevera: " + totalNevera2 + "\nTelevisor: " + totalTelevi2 + "\nElectro: " + totalElectro2);
    }

    private Integer inputInteger(){
        Scanner lector = new Scanner(System.in);
        while(!lector.hasNextInt()) lector.next();
        return lector.nextInt();
    }

    private String inputString(){
        Scanner lector = new Scanner(System.in);
        return lector.nextLine();
    }

    private Character inputCharacter(){
        Scanner lector = new Scanner(System.in);
        return (Character) lector.next().charAt(0);
    }
}

