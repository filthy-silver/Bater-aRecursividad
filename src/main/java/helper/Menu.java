package helper;

import java.io.IOException;

import static bateria.Ejercicios.*;
import static helper.Helper.*;


public class Menu {

    static Helper h;

    public static void menu () throws IOException, InterruptedException {
        System.out.println(
                """
                        *** Batería de ejercicios sobre recursividad ***
                        Selecciona a continuación el modo que quieras ejecutar...
                        \t 1 - Dígitos
                        \t 2 - Potencias
                        \t 3 - Del Revés
                        \t 4 - Binario
                        \t 5 - A binario
                        \t 6 - Orden alfabético
                        \t 7 - Mostrar suma""");

        switch(getUserInt("Introduce un valor numérico")){
            case 1 -> Ej1.run();
            case 2 -> Ej2.run();
            case 3 -> Ej3.run();
            case 4 -> Ej4.run();
            case 5 -> Ej5.run();
            case 6 -> Ej6.run();
            case 7 -> Ej7.run();
            default -> {
                System.out.println("Introduce un número de ejercicio válido");
                clear();
                menu();
            }
        }

        System.out.println("""
                Elige una opción:
                \t[M] - Volver al menú principal
                \t[X] - Salir""");

        sc.nextLine();
        switch(sc.nextLine().toUpperCase()){
            case "M" -> {
                clear();
                menu();
            }
            default -> {
                System.out.println("Hasta la próxima!");
            }
        }
    }

}


