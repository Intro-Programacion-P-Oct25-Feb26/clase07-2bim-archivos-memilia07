/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;

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
        boolean bandera = true;
        
       while(bandera){

        for (int i = 1; i < 3; i++) {

            System.out.println("Ingrese su cedula");
            cedula = entrada.nextLine();
            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su correo");
            String correo = entrada.nextLine();
            entrada.nextLine();

            cadenaFinal = String.format("%s%s %s %s\n", cadenaFinal,
                    cedula,
                    nombre, correo);

        
        escritura04.CrearArchivoTexto.agregarRegistros(cadenaFinal, cedula);
        cadenaFinal = "";
        bandera =  false;
       }
    }
    }

}
