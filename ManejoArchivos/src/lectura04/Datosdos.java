/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

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
public class Datosdos {

    public static void leerPromediosDatosDos() {

        double promedio = 0;
        double suma = 0;
        double contador = 0;

        try {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);

                System.out.println(linea_partes.get(3));

                String valor = linea_partes.get(3);

                double variable = Double.parseDouble(valor);
                suma = suma + variable;
                contador = contador + 1;

            }

            promedio = suma / contador;

            entrada.close();

        } catch (FileNotFoundException | NumberFormatException e) {
            System.err.println("Error al leer del archivo.");
        }
        System.out.printf("Promedio: %.2f\n", promedio);

    }
}
