package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

public class CrearArchivoTexto {

    public static void loja(String mensaje) {
        try {
            FileOutputStream fos = new FileOutputStream("data/loja.txt", true); // true = append
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", mensaje);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

    public static void pichincha(String mensaje) {
        try {
            FileOutputStream fos = new FileOutputStream("data/pichincha.txt", true); // true = append
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", mensaje);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

    public static void guayas(String mensaje) {
        try {
            FileOutputStream fos = new FileOutputStream("data/guayas.txt", true); // true = append
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", mensaje);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

    public static void varios(String mensaje) {
        try {
            FileOutputStream fos = new FileOutputStream("data/otrasCiudades.txt", true); // true = append
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", mensaje);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }
}
