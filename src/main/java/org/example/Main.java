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
        cambiarPalabra("cob", "cobranza");
        cambiarPalabra("tel", "telefonica");
        cambiarPalabra("punt", "puntaje de");
        cambiarPalabra("ref", "referencia");
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

        cambiarPalabra("uhc", "unidad habitacional casa");
        cambiarPalabra("uhct", "unidad habitacional trabajo");
        cambiarPalabra("status", "estatus");
        cambiarPalabra("nip", "clave");
        cambiarPalabra("rfc", "registro federal del contibuyente");
        cambiarPalabra("cn", "clientes nuevos");
        cambiarPalabra("ext", "externo");
        cambiarPalabra("conyugeo", "conyuge o");
        cambiarPalabra("curp", "valor de Curp");
        cambiarPalabra("nvas", "nuevas");
        cambiarPalabra("eng", "enganche");
        cambiarPalabra("vta", "venta");
        cambiarPalabra("dev", "devolucion");
        cambiarPalabra("mueb", "muebles");
        cambiarPalabra("ctas", "cuentas");
        cambiarPalabra("perd", "perdidas");
        cambiarPalabra("recu", "recuento");
        cambiarPalabra("reem", "reembolso");
        cambiarPalabra("can", "cancelacion");
        cambiarPalabra("cta", "cuenta");
        cambiarPalabra("camb", "cambio");

        cambiarPalabra("canc", "cancelacion");
        cambiarPalabra("bonif", "bonificacion");
        cambiarPalabra("emp", "empleado");

        cambiarPalabra("transf", "transferencia");
        cambiarPalabra("mov", "movimiento");
        cambiarPalabra("cconcargo", "con cargo");
        cambiarPalabra("apoyopagoadicional", "pago adicional de apoyo");
        cambiarPalabra("apoyopagoadicionalbcpl", "pago adicional de apoyo a bancoppel");
        cambiarPalabra("ventasproteccionsalud", "ventas de proteccion de salud");
        cambiarPalabra("abonosproteccionsalud", "abonos de proteccion de salud");
        cambiarPalabra("beneficiariosproteccionsalud", "beneficiarios de proteccion de salud");
        cambiarPalabra("adicionalesproteccionsalud", "personas adicionales de proteccion de salud");
        cambiarPalabra("polizasproteccionsalud", "polizas de proteccion de salud");
        cambiarPalabra("cancadicionalesproteccionsalud", "cancelaciondes adicionales de proteccion de salud");
        cambiarPalabra("tarjetascontenido", "tarjetas de contenido");
        cambiarPalabra("devolucionesrevolvente", "devoluciones revolventes");
        cambiarPalabra("edo", "estado de");

        cambiarPalabra("solajus", "solo ajuste de");
        cambiarPalabra("inc", "incremento");
        cambiarPalabra("ptmo", "prestamo");
        cambiarPalabra("loc", "local");
        cambiarPalabra("vdo", "vencido");
        cambiarPalabra("tiendacat", "tienda CAT");
        cambiarPalabra("dcf", "descripcion, clase, familia");
        cambiarPalabra("imp", "impuesto");
        cambiarPalabra("prc", "porcentaje");
        cambiarPalabra("int", "interes");

        cambiarPalabra("canint", "interes de cancelacion");
        cambiarPalabra("entarevolvente ", "venta revolvente");
        cambiarPalabra("clientesrevolvente", "clientes revolventes");
        cambiarPalabra("engrevolvente", "enganche revolvente");
        cambiarPalabra("vtarevolvente", "venta revolvente");
        cambiarPalabra("empleadorevolvente", "empleado revolvente");

        cambiarPalabra("canintrevolvente", "cancelacion de interes revolvente");
        cambiarPalabra("reembolsorevolvente", "reembolso revolvente");
        cambiarPalabra("emprevolvente", "empleado revolvente");
        cambiarPalabra("interesrevolvente", "interes revolvente");
        cambiarPalabra("increvolvente", "incremento revolvente");
        cambiarPalabra("altasprospecto", "altas prospecto");
        cambiarPalabra("segbcpl", "seguro bancoppel");
        cambiarPalabra("pagovtassegbcpl", "pago de ventas de seguros bancoppel");
        cambiarPalabra("abonovtassegbcpl", "abono de ventas de seguro bancoppel");
        cambiarPalabra("altasbeneficiarios", "altas de beneficiarios");
        cambiarPalabra("movreglasituaciones", "movimientos de reglas de situaciones");
        cambiarPalabra("movcatsituaciones", "movimientos de categorias de situaciones");
        cambiarPalabra("movsituacionesmarcarcte", "movimientos de situaciones de marcar cliente");
        cambiarPalabra("movsituacionesdesmarcarcte", "movimientos de situaciones de desmarcar cliente");
        cambiarPalabra("movsituacionesmarcarsol", "movimientos de situaciones marcar sol");
        cambiarPalabra("movsituacionesdesmarcarsol", "movimientos de situaciones desmarcar sol");
        cambiarPalabra("consultasaldo", "consultars de saldo");
        cambiarPalabra("nac", "nacionales");
        cambiarPalabra("anio", "año");

        cambiarPalabra("esp", "especial");
        cambiarPalabra("tipocambio", "tipo de cambio");
        cambiarPalabra("puestoregistro", "puesto de registro");
        cambiarPalabra("centroregistro", "centro de registro");
        cambiarPalabra("clavemovimiento", "clave de movimiento");
        cambiarPalabra("fechamovimiento", "fecha de movimiento");
        cambiarPalabra("numeroempleado", "numero de empleado");
        cambiarPalabra("numerotienda", "numero de tienda");

        cambiarPalabra("tipomovimiento", "tipo de movimiento");
        cambiarPalabra("fol", "folio de");
        cambiarPalabra("mesespagado", "meses pagados");
        cambiarPalabra("cantidadseguros", "cantidad de seguros");

        cambiarPalabra("ctes", "clientes");
        cambiarPalabra("nvos", "nuevos");
        cambiarPalabra("tras", "traspaso");
        cambiarPalabra("numemp", "numero de empleado");
        cambiarPalabra("metasolicitudes", "meta de solicitudes");
        cambiarPalabra("metaafiliaciones", "meta de afiliaciones");
        cambiarPalabra("metanvasolicitudes", "meta nuevas de solicitudes");
        cambiarPalabra("metanvaafiliaciones", "meta nuevas de afiliaciones");
        cambiarPalabra("fecharep", "fecha");
        cambiarPalabra("keyx", "identificador unico");
        cambiarPalabra("fechamovto", "fecha de movimiento");

        cambiarPalabra("devolucionfactura", "devolucion de factura");
        cambiarPalabra("ciudadtiendamov", "ciudad de la tienda en que se hace el movimiento");
        cambiarPalabra("descripcionarticulo", "descripcion del articulo");
        cambiarPalabra("numeroarticulos", "numero de articulos");
        cambiarPalabra("diapago", "dia de pago");
        cambiarPalabra("saldocuenta", "saldo de la cuenta");
        cambiarPalabra("plazoconvenio", "plazo del convenio");
        cambiarPalabra("claveajuste", "clave de ajuste");
        cambiarPalabra("fechasaldacon", "fecha salda con");
        cambiarPalabra("vencidoinicial", "vencido inicial");
        cambiarPalabra("saldoinicial", "saldo inicial");
        cambiarPalabra("tipoconvenio", "tipo de convenio");
        cambiarPalabra("subtipoconvenio", "subtipo de convenio");
        cambiarPalabra("importesaldacon", "importe salda con");
        cambiarPalabra("fechanacimiento", "fecha de nacimiento");
        cambiarPalabra("fechavencimiento", "fecha de vencimiento");
        cambiarPalabra("flagseguroconyugal", "identificador de seguro conyugal");
        cambiarPalabra("movtoseguro", "movimiento seguro");
        cambiarPalabra("cajaoriginal", "caja original");
        cambiarPalabra("tipograbado", "tipo de grabado");
        cambiarPalabra("numerocarga", "numero de carga");
        cambiarPalabra("mescarga", "mes de carga");
        cambiarPalabra("fechacartera", "fecha en cartera");
        cambiarPalabra("ipcartera", "ip de cartera");
        cambiarPalabra("saldofinal", "saldo final");
        cambiarPalabra("tiendalocal", "tienda local");
        cambiarPalabra("tipodeduccion", "tipo de deduccion");
        cambiarPalabra("interessaldacon", "interes salda con");
        cambiarPalabra("saldaconanterior", "salda con anterior");
        cambiarPalabra("interesbonificado", "interes bonificado");
        cambiarPalabra("regresodev", "regreso devolucion");
        cambiarPalabra("bonificacionref", "bonificacion de referencia");
        cambiarPalabra("devolucionsaldo", "devolucion salda con");
        cambiarPalabra("devolucioninteres", "devolucion de interes");
        cambiarPalabra("numpuesto", "numero de puesto");
        cambiarPalabra("numvendedor", "numero de vendedor");
        cambiarPalabra("ventatotal", "venta total");
        cambiarPalabra("numfacturas", "numero de facturas");
        cambiarPalabra("numarticulos", "numero de articulos");
        cambiarPalabra("promedioxfact", "promedio por factura");
        cambiarPalabra("signoprom", "signo promedio");
        cambiarPalabra("numartxfact", "numero de articulos por factura");
        cambiarPalabra("signoart", "signo anterior");
        cambiarPalabra("fechaalta", "fecha de alta");
        cambiarPalabra("numtienda", "numero de tienda");
        cambiarPalabra("iddocumento", "identificador de documento");
        cambiarPalabra("idproceso", "identificador de proceso");
        cambiarPalabra("situacionespecial", "situaciones especiales");
        cambiarPalabra("causasituacionespecial", "causa de situaciones especiales");
        cambiarPalabra("fecharegistro", "fecha de registro");
        cambiarPalabra("flags", "identificador");
        cambiarPalabra("cvemovimiento", "clave de movimiento");
        cambiarPalabra("tiendacobtel", "numero de tienda de cobranza telefonica");
        cambiarPalabra("ciudadcliente", "numero de ciudad del cliente");
        cambiarPalabra("grupocobtel", "grupo de cobranza telefonica");
        cambiarPalabra("flagcierre", "Identificador de cierre");
        cambiarPalabra("apellidopaterno", "apellido paterno");
        cambiarPalabra("apellidomaterno", "apellido materno");
        cambiarPalabra("tipocliente", "tipo de cliente");
        cambiarPalabra("zonanombre", "nombre de la zona");
        cambiarPalabra("callenombre", "nombre de la calle");
        cambiarPalabra("deptoointerior", "departamento interior");
        cambiarPalabra("flaguhc", "identificador de unidad habitacional casa");
        cambiarPalabra("uhcmanzana", "manzana de unidad habitacional casa");
        cambiarPalabra("uhcotros", "otros de unidad habitacional casa");
        cambiarPalabra("uhcandador", "andador de unidad habitacional casa");
        cambiarPalabra("uhcetapa", "etapa de unidad habitacional casa");
        cambiarPalabra("uhclote", "lote de unidad habitacional casa");
        cambiarPalabra("uhcedificio", "edificio de unidad habitacional casa");
        cambiarPalabra("uhcentrada", "entrada de unidad habitacional casa");
        cambiarPalabra("clientelocal", "Cliente local");
        cambiarPalabra("mespago", "mes de pago");
        cambiarPalabra("enganchepropuesto", "enganche propuesto");
        cambiarPalabra("causadevolucion", "causa de devolucion");
        cambiarPalabra("facturatraspazo", "factura de traspaso");
        cambiarPalabra("importetraspazo", "importe de traspaso");
        cambiarPalabra("foliofonacot", "numero de folio");
        cambiarPalabra("flagtomareembolso", "identificador de tomar reembolso");
        cambiarPalabra("flagvtainternet", "identificador de venta de interner");
        cambiarPalabra("flagmesaregalo", "identificador de mes de regalo");
        cambiarPalabra("flagentregaotracd", "identificador de entrega");
        cambiarPalabra("ventahuella", "huella de venta");
        cambiarPalabra("quienautorizo", "quien autorizo");
        cambiarPalabra("fechahoraentregainicialmovto", "fecha y hora de entrega inicial del movimiento");
        cambiarPalabra("fechahoraentregafinalmovto", "fecha y hora de entrega final del movimiento");
        cambiarPalabra("flagtramitecredito", "identificador de tramite de credito");
        cambiarPalabra("foliotienda", "numero de folio de la tienda");
        cambiarPalabra("ipcarteracliente", "ip de carteda de cliente");
        cambiarPalabra("flagempleado", "identificador de empleado");
        cambiarPalabra("importedxc", "importe");
        cambiarPalabra("quienentrega", "quien entrega");
        cambiarPalabra("ctes", "clientes");

        cambiarPalabra("abo", "abono");
        cambiarPalabra("mini", "minimo");
        cambiarPalabra("registroscifra", "registros cifra");
        cambiarPalabra("registrosmaestro", "registros maestro");
        cambiarPalabra("numerocredito", "numero de credito");
        cambiarPalabra("numerociudad", "numero de ciudad");
        cambiarPalabra("regioncobranzas", "region de cobranzas");
        cambiarPalabra("flag", "identificador de");
        cambiarPalabra("reg", "registros");
        cambiarPalabra("sql", "sql server");
        cambiarPalabra("pg", "postgres");
        cambiarPalabra("gte", "gerente de");
        cambiarPalabra("ta", "tiempo aire");
        cambiarPalabra("totalclientes", "total de clientes");
        cambiarPalabra("txt", "texto");
        cambiarPalabra("ctesa", "clientes a");
        cambiarPalabra("ctaconcentradora", "cuenta concentradora");
        cambiarPalabra("saldoctasperdidas", "saldo de cuentas perdidas");
        cambiarPalabra("ctaperdida", "cuenta perdida");
        cambiarPalabra("fechacosecha", "fecha de cosecha");
        cambiarPalabra("saldocartera", "saldo de cartera");
        cambiarPalabra("plazoventa", "plazo de venta");
        cambiarPalabra("tipoproducto", "tipo de producto");
        cambiarPalabra("dif", "diferencia");
        cambiarPalabra("numerocaja", "numero de caja");
        cambiarPalabra("plazomuebles", "plazo de muebles");
        cambiarPalabra("xdevengar", "por devengar");
        cambiarPalabra("intx", "interes por");
        cambiarPalabra("act", "actual");
        cambiarPalabra("bonf", "bonificacion");
        cambiarPalabra("saldoala", "saldo a la");
        cambiarPalabra("ivaint", "iva de interes de");
        cambiarPalabra("marcafinal", "marca final");
        cambiarPalabra("mesen", "mes en");
        cambiarPalabra("atr", "anterior");
        cambiarPalabra("conv", "convenio");
        cambiarPalabra("dom", "domicilio");
        cambiarPalabra("sit", "situacion");
        cambiarPalabra("cve", "clave");
        cambiarPalabra("ofamiliar", "o familiar");
        cambiarPalabra("uhab", "unidad habitacional");
        cambiarPalabra("sist", "sistema");
        cambiarPalabra("seg", "seguro");
        cambiarPalabra("flagaltaautomatica", "identificador de alta automatica");
        cambiarPalabra("flagconsulta", "identificador de consulta");
        cambiarPalabra("buropilototestigo", "testigo de buro piloto");
        cambiarPalabra("marcaconsultado", "marca consultado");
        cambiarPalabra("marcahit", "marca hit");
        cambiarPalabra("cunombre", "cliente unico nombre");
        cambiarPalabra("cuapellidopaterno", "cliente unico apellido paterno");
        cambiarPalabra("cuapellidomaterno", "cliente unico apellido materno");
        cambiarPalabra("cucomplemento", "cliente unico complemento");
        cambiarPalabra("cuentrecalles", "cliente unico entre calles");
        cambiarPalabra("cucomplementotrabajo", "cliente unico complemento de trabajo");
        cambiarPalabra("cuentrecallestrabajo", "cliente unico entre calles de trabajo");
        cambiarPalabra("cuclientebancoppel", "cliente unico cliente bancoppel");
        cambiarPalabra("cap", "capacidad    ");
        cambiarPalabra("cu", "cliente unico");
        cambiarPalabra("horacontactoinicial", "hora de contacto inicial");
        cambiarPalabra("horacontactofinal", "hora de contacto final");
        cambiarPalabra("flaghoracontacto", "identificador de hora de contacto");
        cambiarPalabra("flg", "identificador");
        cambiarPalabra("clienteprospecto", "cliente prospecto");
        cambiarPalabra("Sdo", "saldo");
        cambiarPalabra("sdo", "saldo");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");



        //cambiarPalabra("", "");













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

        // Toma el nombre y separa las palabras tomando en cuenta las mayusculas, giones bajos y numeros

        //String regex = "([A-Z]?[a-z]+\\d*)";
        //String regex = "([\\d]*|[\\_]*|[A-Z]*[[a-z]*\\ñ*[a-z]*]*)";
        String regex = "(_)|(\\d+)|([A-Z]*[a-zñ]*)";

        Pattern pattern = Pattern.compile(regex);

        for (Fila fila : filas) {

            List<String> palabras = new ArrayList<>();

            Matcher matcher = pattern.matcher(fila.getNombreCampo());

            while (matcher.find()) {
                if (matcher.group(2) != null) {
                    palabras.add(matcher.group(2));
                }
                else if (matcher.group(3) != null) {
                    palabras.add(matcher.group(3));
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

        String regex = "^\\t?\\s?\\[?([\\w\\ñ]*)\\]?|\\s\\[?([a-z]+)\\]?\\s?|\\((\\d+)\\)";

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