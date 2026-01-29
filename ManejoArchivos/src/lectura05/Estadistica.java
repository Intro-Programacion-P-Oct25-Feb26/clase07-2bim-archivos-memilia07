/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER_ASUS
 */
public class Estadistica {

    public static void obtenerPromedioEmpleados() {

        double promedio = 0;
        double suma = 0;
        int contador = 0;
        boolean bandera = true;

        try {
            Scanner entrada = new Scanner(new File("data/sucursales.txt"));

            while (entrada.hasNext()) {

                try {
                    String linea = entrada.nextLine();

                    if (bandera) {

                        bandera = false;

                    }

                    List<String> lista = Arrays.asList(linea.split("\\|"));
                    ArrayList<String> linea_partes = new ArrayList<>(lista);

                    System.out.println(linea_partes.get(2));
                    String valor = linea_partes.get(2);

                    double empleados = Double.parseDouble(valor);

                    suma = suma + empleados;

                    contador = contador + 1;

                } catch (Exception e) {

                }
            }

            promedio = suma / contador;

            entrada.close();

        } catch (FileNotFoundException e) {

            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
        System.out.printf("Promedio: %.2f\n", promedio);
    }
}
