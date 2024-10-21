package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    static String query = "";
    static Scanner scan = new Scanner(System.in);
    static List<Fila> filas = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Pega todas las líneas que quieras procesar. Deja una línea vacía para terminar:");

        StringBuilder input = new StringBuilder();
        String line;

        // Leer hasta que el usuario deje una línea vacía
        while (!(line = scan.nextLine()).isEmpty()) {
            input.append(line).append("\n");
        }

        // Almacenamos todas las líneas ingresadas en la variable `query`
        query = input.toString();


        separarDatos();

        generarDescripcion();


        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        for (Fila fila : filas) {
            System.out.println(fila.getNombreCampo() +
                    "," + fila.getTipoDato() +
                    "," + fila.getLongitud() +
                    "," + fila.getDescripcion());
        }
    }

    public static void generarDescripcion() {

        // Toma el nombre y separa las palabras tomando en cuenta las mayusculas

        String regex = "([A-Z]?[a-z]+\\d*)";

        Pattern pattern = Pattern.compile(regex);

        for (Fila fila : filas) {

            List<String> palabras = new ArrayList<>();

            Matcher matcher = pattern.matcher(fila.getNombreCampo());

            while (matcher.find()) {
                if (matcher.group(1) != null) {
                    palabras.add(matcher.group(1));
                }
            }
            String descripcion = "";
            for (String palabra : palabras) {
                palabra = palabra.toLowerCase();
                descripcion += palabra + " ";
            }
            descripcion = descripcion.trim();
            if (!descripcion.isEmpty()) {
                descripcion = descripcion.substring(0, 1).toUpperCase() + descripcion.substring(1);
            }
            fila.setDescripcion(descripcion);
        }

    }

    public static void separarDatos(){

        // Agarra el texto ingresado y separa por saltos de linea, cada linea toma nombre del campo, tipo de dato y
        // Longitud, en caso de no tener longitud se establece como " "

        System.out.println(query);

        String regex = "^\\t?\\s?(\\w+)|\\s([a-z]+)\\s|\\((\\d+)\\)";

        Pattern pattern = Pattern.compile(regex);


        for (String frase : query.split("\\r?\\n")) {

            Matcher matcher = pattern.matcher(frase);

            Fila filaTemp = new Fila();

            while (matcher.find()) {

                if (matcher.group(1) != null){
                    filaTemp.setNombreCampo(matcher.group(1));

                } else if (matcher.group(2) != null) {
                    filaTemp.setTipoDato(matcher.group(2));

                } else if (matcher.group(3) != null) {
                    filaTemp.setLongitud(matcher.group(3));
                }

            }

            if (filaTemp.getLongitud() == null) {
                filaTemp.setLongitud(" ");
            }
            filas.add(filaTemp);
        }
    }
}