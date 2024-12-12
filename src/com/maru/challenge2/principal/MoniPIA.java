package com.maru.challenge2.principal;

import com.maru.challenge2.conversor.Conversor;
import static java.lang.Integer.valueOf;
import java.util.List;
import java.util.Scanner;


public class MoniPIA {
    public static void main(String[] args) {
        System.out.println("*********************************\nBienvenido a MoniPIA\nSistema de conversión de monedas\n*********************************");
        System.out.println("""
                A continuación, se muestran las conversiones posibles:
                1) Dólar ==> Peso Argentino
                2) Peso Argentino ==> Dólar
                3) Dólar ==> Real Brasileño
                4) Real brasileño ==> Dólar
                5) Dólar ==> Peso colombiano
                6) Peso colombiano ==> Dólar
                7) Salir 
                *********************************
                """);
                
        try {
            Conversor conversor = new Conversor();
            Scanner lectura = new Scanner(System.in);

            List<String[]> paresDeMonedas = List.of(
                new String[]{"USD", "ARS"},
                new String[]{"ARS", "USD"},
                new String[]{"USD", "BRL"},
                new String[]{"BRL", "USD"},
                new String[]{"USD", "COP"},
                new String[]{"COP", "ARS"}
            );

            while (true) { 

                System.out.println("\nIngrese una de la opciones anteriores: ");
                var opcion = lectura.nextLine();

                if (opcion.matches("\\d+") && Integer.parseInt(opcion) >= 1 && Integer.parseInt(opcion) <= 7) {
                    
                    if(opcion.equalsIgnoreCase("7")){
                        System.out.println("El programa finalizo.");
                        lectura.close();
                        break;
                    }
    
                    System.out.print("Ingrese la cantidad a convertir: ");
                    var  cantidad = valueOf(lectura.nextLine());
    
                    String[] paresSeleccionados = paresDeMonedas.get(Integer.parseInt(opcion) - 1);
                    Moneda conversionDeMoneda = new Moneda(conversor.convierte(paresSeleccionados[0], paresSeleccionados[1], cantidad), cantidad);
    
                    System.out.println(conversionDeMoneda);
                } else {
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 7.");
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un valor numerico.");
        }

    }
}
