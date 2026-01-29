/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Scanner;

/**
 *
 * @author USER_ASUS
 */
public class Principal {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        String cedula = "";
        String cadenaFinal = "";
        String placa = "";
        boolean bandera = true;

        while (bandera) {

            for (int i = 0; i < 3; i++) {

                System.out.println("Ingrese su cedula");
                cedula = entrada.nextLine();
                System.out.println("Ingrese su nombre");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese su placa del carro");
                placa = entrada.nextLine();
                System.out.println("Ingrese su marca del carro");
                String marca = entrada.nextLine();
                entrada.nextLine();

                cadenaFinal = String.format("%s%s %s %s\n", cadenaFinal,
                        cedula,
                        nombre, placa, marca);

                String inicialPlaca = placa.substring(0, 1);

                if (inicialPlaca.equals("L")) {

                    CrearArchivoTexto.Loja(cadenaFinal);
                } else {
                    if (inicialPlaca.equals("P")) {
                        CrearArchivoTexto.Pichincha(cadenaFinal);
                    } else {
                        if (inicialPlaca.equals("G")) {
                            CrearArchivoTexto.Guayas(cadenaFinal);
                        } else {

                            CrearArchivoTexto.otros(cadenaFinal);
                        }
                        cadenaFinal = "";
                        String opcion;

                        System.out.println("Si deseas agregar mas pon (s/n)");
                        opcion = entrada.next();
                        if (opcion.equals("n")) {

                            break;
                        }

                    }
                }
            }
            escritura04.CrearArchivoTexto.agregarRegistros(cadenaFinal, placa);
        }
    }
}
