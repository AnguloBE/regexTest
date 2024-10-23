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

        cambiarPalabra("fecha", "fecha de");
        cambiarPalabra("numero", "número de");
        cambiarPalabra("clave", "clave de");
        cambiarPalabra("importe", "importe de");
        cambiarPalabra("descripcion", "descripcion de");

        cambiarPalabra("clv", "clave de");
        cambiarPalabra("imp", "importe de");
        cambiarPalabra("fec", "fecha de");
        cambiarPalabra("desc", "descripcion de");
        cambiarPalabra("id", "identificador de");
        cambiarPalabra("nom", "nombre de");
        cambiarPalabra("bd", "base de datos");


        cambiarPalabra("prc", "porcentaje");
        cambiarPalabra("cte", "cliente");
        cambiarPalabra("Cob", "cobranza");
        cambiarPalabra("Tel", "telefonica");
        cambiarPalabra("Punt", "puntaje de");
        cambiarPalabra("Ref", "feferencia");
        cambiarPalabra("idu", "identificador de");

        cambiarPalabra("corresp", "correspondiente");
        cambiarPalabra("num", "número de");

        cambiarPalabra("vtas", "ventas");
        cambiarPalabra("ant", "anterior");
        cambiarPalabra("numerocliente", "numero de cliente");
        cambiarPalabra("saldoalafecha", "saldo a la fecha");
        cambiarPalabra("claveant", "clave anterior");
        cambiarPalabra("mes", "mes de");
        cambiarPalabra("des", "descripcion de");

        cambiarPalabra("tipo", "tipo de");
        cambiarPalabra("facturao", "factura o");

        cambiarPalabra("saldo", "saldo de");
        cambiarPalabra("bonificacion", "bonificacion de");
        cambiarPalabra("plazo", "plazo de");
        cambiarPalabra("devolucion", "devolucion de");
        cambiarPalabra("opc", "opcion de");
        cambiarPalabra("tda", "tienda");
        cambiarPalabra("parametrico", "parametrico de");
        cambiarPalabra("movto", "movimiento");
        cambiarPalabra("cantidad", "cantidad de");
        cambiarPalabra("subtipo", "subtipo de");
        cambiarPalabra("comision", "comision de");
        cambiarPalabra("puntualidad", "puntualidad de");


        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        for (Fila fila : filas) {
            System.out.println(fila.getNombreCampo() +
                    "," + fila.getTipoDato() +
                    "," + fila.getLongitud() +
                    "," + fila.getDescripcion());
        }
    }

    public static void cambiarPalabra(String laAbreviacion, String laPalabra) {

        for (Fila fila : filas) {
            String tempDescripcion = "";
            for (String palabra : fila.getDescripcion().split(" ")) {
                palabra = palabra.toLowerCase();
                if (palabra.equals(laAbreviacion)) {

                    tempDescripcion += (" "+laPalabra);
                } else {
                    tempDescripcion += (" "+palabra);
                }

            }
            tempDescripcion = tempDescripcion.trim();
            if (!tempDescripcion.isEmpty()) {
                tempDescripcion = tempDescripcion.substring(0, 1).toUpperCase() + tempDescripcion.substring(1);
            }
            fila.setDescripcion(tempDescripcion);
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