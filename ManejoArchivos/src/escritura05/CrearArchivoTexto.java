/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Formatter;

/**
 *
 * @author USER_ASUS
 */
public class CrearArchivoTexto {

    public static void agregarRegistros(String valor, String nombreArchivo) {

        String ruta = String.format("data/%s.txt", nombreArchivo);
        try {
            Formatter salida = new Formatter(ruta);
            salida.format("%s", valor);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    }

}
