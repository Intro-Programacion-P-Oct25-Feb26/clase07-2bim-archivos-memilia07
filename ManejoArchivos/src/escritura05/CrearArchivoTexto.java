/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

/**
 *
 * @author USER_ASUS
 */
public class CrearArchivoTexto {

    public static void Loja(String nombreArchivo) {
        try {
            FileOutputStream fos = new FileOutputStream("data/salidaDatosPersonales002.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", nombreArchivo);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

    public static void Pichincha(String nombreArchivo) {
        try {
            FileOutputStream fos = new FileOutputStream("data/salidaDatosPersonales002.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", nombreArchivo);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

    public static void Guayas(String nombreArchivo) {
        try {
            FileOutputStream fos = new FileOutputStream("data/salidaDatosPersonales002.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", nombreArchivo);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }
    }

    public static void otros(String valor) {
        try {
            FileOutputStream fos = new FileOutputStream("data/salidaDatosPersonales002.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", valor);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }
}
