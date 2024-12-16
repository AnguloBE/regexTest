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
        cambiarPalabra("tel", "telefono");
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
        cambiarPalabra("cap", "capacidad");
        cambiarPalabra("cu", "cliente unico");
        cambiarPalabra("horacontactoinicial", "hora de contacto inicial");
        cambiarPalabra("horacontactofinal", "hora de contacto final");
        cambiarPalabra("flaghoracontacto", "identificador de hora de contacto");
        cambiarPalabra("flg", "identificador");
        cambiarPalabra("clienteprospecto", "cliente prospecto");
        cambiarPalabra("numerodesolicitud", "numero de solicitud");
        cambiarPalabra("cuflagcajaunica", "identificador de cliente unico de caja unica");
        cambiarPalabra("marcadeudabancoppel", "marca deuda bancoppel");
        cambiarPalabra("tar", "tarjeta");
        cambiarPalabra("ano", "año");
        cambiarPalabra("tot", "total");
        cambiarPalabra("otrosmovtos ", "otros movimientos ");
        cambiarPalabra("carg", "carga");
        cambiarPalabra("otrosmovtos", "otros movimientos");
        cambiarPalabra("ala", "a la");
        cambiarPalabra("ini", "inicial");
        cambiarPalabra("mreal", "m real");
        cambiarPalabra("apagar", "a pagar");
        cambiarPalabra("fin", "final");
        cambiarPalabra("motros", "m otros");
        cambiarPalabra("new", "nueva");
        cambiarPalabra("minimoa", "minimo a");
        cambiarPalabra("nva", "nueva");
        cambiarPalabra("numerocolonia", "numero de colonia");
        cambiarPalabra("gpo", "grupo");
        cambiarPalabra("pag", "pagado");
        cambiarPalabra("tamano", "tamaño");
        cambiarPalabra("etiqueta", "etiqueta de");
        cambiarPalabra("nombre", "nombre de");
        cambiarPalabra("tamaño", "tamaño de");
        cambiarPalabra("cred", "credito");
        cambiarPalabra("empleadoconvenio", "empleado de convenio");
        cambiarPalabra("tiendaabono", "tienda de abono");
        cambiarPalabra("descripcionarticulo", "descripcion de articulo");
        cambiarPalabra("tipoconvenio", "tipo de convenio");
        cambiarPalabra("notaofactura", "nota o factura");
        cambiarPalabra("estadocivil", "estado civil");
        cambiarPalabra("domiciliocasa", "domicilio casa");
        cambiarPalabra("domiciliotrabajo", "domicilio del trabajo");
        cambiarPalabra("causasitesp", "causa de situacion especial");
        cambiarPalabra("ingresomensual", "ingreso mensual");
        cambiarPalabra("nombrereferencia", "nombre de la referencia");
        cambiarPalabra("apellidopaternoreferencia", "apellido paterno de la referencia");
        cambiarPalabra("apellidomaternoreferencia", "apellido materno de la referencia");
        cambiarPalabra("conveniominimo", "convenio minimo");
        cambiarPalabra("tienellamadaprogramada", "tiene llamada programada");
        cambiarPalabra("tipoclientecampana", "tipo cliente campana");
        cambiarPalabra("numerocampana", "numero de campaña");
        cambiarPalabra("empleadotrabajoultimavez", "empleado que trabajo la ultima vez");
        cambiarPalabra("fechaultimocontacto", "fecha del ultimo contacto");
        cambiarPalabra("estatuscobtel", "estatus de cobranza telefonica");
        cambiarPalabra("fechainsercion", "fecha de insercion");
        cambiarPalabra("fechaproximoenvio", "fecha del proximo envio");
        cambiarPalabra("numeroestado", "numero de estado");
        cambiarPalabra("cteagregado", "cliente agregado");
        cambiarPalabra("grupocontacto", "grupo de contacto");
        cambiarPalabra("fingestion", "fin de la gestion");
        cambiarPalabra("tipotelefono", "tipo de telefono");
        cambiarPalabra("telefonooriginal", "telefono original");
        cambiarPalabra("telefonoreconstruido", "telefono reconstruido");
        cambiarPalabra("tipored", "tipo de red");
        cambiarPalabra("quiencontestoultimocontacto", "quien contesto el ultimo contacto");
        cambiarPalabra("fecharegistrotelefono", "fecha de registro de telefono");
        cambiarPalabra("numerocarrier", "numero carrier");
        cambiarPalabra("nombreciudad", "nombre de ciudad");
        cambiarPalabra("cobranzareal", "cobranza real");
        cambiarPalabra("inicialciudad", "inicial de ciudad");
        cambiarPalabra("abonovencido", "abono vencido");
        cambiarPalabra("formadepago", "forma de pago");
        cambiarPalabra("descripciondelpago", "descripcion del pago");
        cambiarPalabra("numctebancoppel", "numero de cliente bancoppel");
        cambiarPalabra("apell", "apellido");
        cambiarPalabra("nac", "nacimiento");
        cambiarPalabra("numeroext", "numero externo");
        cambiarPalabra("numeroint", "numero interno");
        cambiarPalabra("cod", "codigo");
        cambiarPalabra("trab", "trabajo");
        cambiarPalabra("existenciacc", "existencia cuenta coppel");
        cambiarPalabra("antiguedadcliente", "antiguedad del cliente");
        cambiarPalabra("pers", "personas");
        cambiarPalabra("referenciacoppel", "referencia coppel");
        cambiarPalabra("flagactualizado", "identificador actualizado");
        cambiarPalabra("flagcredito", "identificador de credito");
        cambiarPalabra("fechacorte", "fecha de corte");
        cambiarPalabra("antig", "antiguedad");
        cambiarPalabra("domici", "domicilio");
        cambiarPalabra("gironegocio", "giro del negocio");
        cambiarPalabra("xcob", "por cobrar");
        cambiarPalabra("fechaactualizacion", "fecha de actualizacion");
        cambiarPalabra("registrosrecibidos", "numero de registros recividos");
        cambiarPalabra("altasactualizadas", "altas actualizadas");
        cambiarPalabra("cambiosactualizados", "cambios actualizados");
        cambiarPalabra("registrosactualizados", "registros actualizados");
        cambiarPalabra("registrosnoactualizados", "registros no actualizados");
        cambiarPalabra("registrosduplicados", "registros duplicados");
        cambiarPalabra("acumuladodirectorio", "acumulado en el directorio");
        cambiarPalabra("acumuladomovimientos", "movimientos acumulados");
        cambiarPalabra("yno", "y no");
        cambiarPalabra("inicialestado", "inicial de estado");
        cambiarPalabra("salariominimo", "salario minimo");
        cambiarPalabra("ivaciudad", "iva de la ciudad");
        cambiarPalabra("antiguedadciudad", "antiguedad en la ciudad");
        cambiarPalabra("gerentezona", "gerente de zona");
        cambiarPalabra("unificaciudadescobranzas", "unifica ciudades de cobranzas");
        cambiarPalabra("gerentecobranzas", "gerente de cobranzas");
        cambiarPalabra("regionestadodecuenta", "region de estado de cuenta");
        cambiarPalabra("tipociudad", "tipo de ciudad");
        cambiarPalabra("numerociudadcoppel", "numero de ciudad coppel");
        cambiarPalabra("nombreciudadcoppel", "nombre de ciudad coppel");
        cambiarPalabra("fechaconsulta", "fecha de consulta");
        cambiarPalabra("tipoactualizacion", "tipo de actualizacion");
        cambiarPalabra("bcpl", "bancoppel");
        cambiarPalabra("cpl", "coppel");
        cambiarPalabra("numeroproducto", "numero del producto");
        cambiarPalabra("nombretablasql", "nombre de la tabla sql");
        cambiarPalabra("nombretablatxt", "nombre de la tabla de texto");
        cambiarPalabra("nombretablacifracontrolsql", "nombre de la tabla cifra control sql");
        cambiarPalabra("nombretablacifracontroltxt", "nombre de la tabla cifra control de texto");
        cambiarPalabra("frecuenciacarga", "frecuencia de carga");
        cambiarPalabra("numeroregistros", "numero de registros");
        cambiarPalabra("fechaultimomov", "fecha del ultimo movimiento");
        cambiarPalabra("proclevantartabla", "proceso de levantar tabla");
        cambiarPalabra("proccopiaral", "proceso de copiar al");
        cambiarPalabra("numerosucursal", "numero de sucursal");
        cambiarPalabra("nombresucursal", "nombre de sucursal");
        cambiarPalabra("nombreciudad", "nombre de la ciudad");
        cambiarPalabra("nombreempleado", "nombre del empleado");
        cambiarPalabra("tipousuario", "tipo de usuario");
        cambiarPalabra("nombrezona", "nombre de la zona");
        cambiarPalabra("poblacionzona", "poblacion de la zona");
        cambiarPalabra("municipiozona", "municipio de la zona");
        cambiarPalabra("codigopostalzona", "codigo postal de la zona");
        cambiarPalabra("supervisorzona", "supervisor de la zona");
        cambiarPalabra("choferzona", "chofer de la zona");
        cambiarPalabra("jefegrupozona", "jefe del grupo de la zona");
        cambiarPalabra("abogadozona", "abogado de la zona");
        cambiarPalabra("ciudadcobranzas", "ciudad de cobranzas");
        cambiarPalabra("numerocoloniacoppel", "numero de colonia coppel");
        cambiarPalabra("nombrezonacoppel", "nombre de zona coppel");
        cambiarPalabra("delcliente", "del cliente");
        cambiarPalabra("numerointerior", "numero interior");
        cambiarPalabra("cumpliocompromiso", "cumplio compromiso");
        cambiarPalabra("descripciontipocliente", "descripcion del tipo de cliente");
        cambiarPalabra("numerotarjeta", "numero de tarjeta");
        cambiarPalabra("tipoestadodecuenta", "tipo de estado de cuenta");
        cambiarPalabra("flagrestructura", "indentificador de estructura");
        cambiarPalabra("pagoinmediato", "pago inmediato");
        cambiarPalabra("fechacarta", "fecha de carta");
        cambiarPalabra("cuentaefectiva", "cuenta efectiva");
        cambiarPalabra("importeultimopago", "importe del ultimo pago");
        cambiarPalabra("numeroclientecpl", "numero de cliente coppel");
        cambiarPalabra("direccioncpl", "direccion coppel");
        cambiarPalabra("numzona", "numero de zona");
        cambiarPalabra("añodenacimiento", "año de nacimiento");
        cambiarPalabra("bonificacioninteres", "bonificacion de interes");
        cambiarPalabra("nombreproducto", "nombre del producto");
        cambiarPalabra("fechadecorte", "fecha de corte");
        cambiarPalabra("pagofijo", "pago fijo");
        cambiarPalabra("saldocliente", "saldo del cliente");
        cambiarPalabra("fechaultimadisposicion", "fecha de ultima disposicion");
        cambiarPalabra("pagominimo", "pago minimo");
        cambiarPalabra("saldovencido", "saldo vencido");
        cambiarPalabra("interesmoratorio", "interes moratorio");
        cambiarPalabra("fechaaperturacredito", "fecha de apertura de credito");
        cambiarPalabra("limitecredito", "limite de credito");
        cambiarPalabra("tasainteres", "tasa de interes");
        cambiarPalabra("saldoactmesant", "saldo actual del mes anterior");
        cambiarPalabra("fechalimitepago", "fecha limite de pago");
        cambiarPalabra("estadocredito", "estado de credito");
        cambiarPalabra("cat", "costo anual total");
        cambiarPalabra("puntualidadcliente", "puntualidad del cliente");
        cambiarPalabra("abonobase", "abono base");
        cambiarPalabra("fechacorte", "fecha de corte");
        cambiarPalabra("interesvencido", "interes vencido");
        cambiarPalabra("abonosvencidos", "abonos vencidos");
        cambiarPalabra("sdo", "saldo");
        cambiarPalabra("exig", "exigente");
        cambiarPalabra("noexig", "no exigente");
        cambiarPalabra("trasp", "trasparencia");
        cambiarPalabra("tipoultimomov", "tipo del ultimo movimiento");
        cambiarPalabra("fechaultmov", "fecha del ultimo movimiento");
        cambiarPalabra("fechalimitedepago", "fecha limite de pago");
        cambiarPalabra("tasainteres", "tasa de interes");
        cambiarPalabra("plazotc", "plazo de tarjeta de credito");
        cambiarPalabra("saldoactual", "saldo actual");
        cambiarPalabra("numtarjetatdc", "numero de tarjeta de credito");
        cambiarPalabra("numerocuenta", "numero de cuenta");
        cambiarPalabra("numcreditotdc", "numero de credito de tarjeta de credito");
        cambiarPalabra("sucursalentregotarjeta", "sucursal que entrego la tarjeta");
        cambiarPalabra("fechacompromiso", "fecha de compromiso");
        cambiarPalabra("numejecutivorealizocompromiso", "numero de ejecutivo que realizo el compromiso");
        cambiarPalabra("importecompromiso", "importe de compromiso");
        cambiarPalabra("plazocompromiso", "plazo de compromiso");
        cambiarPalabra("tipocompromiso", "tipo de compromiso");
        cambiarPalabra("sucursalmovimiento", "sucursal de movimiento");
        cambiarPalabra("empleadocapturo", "empledo que capturo");
        cambiarPalabra("tipomovto", "tipo de movimiento");
        cambiarPalabra("horamovto", "hora de movimiento");
        cambiarPalabra("importepago", "importe de pago");
        cambiarPalabra("sucursalmovto", "sucursal de movimiento");
        cambiarPalabra("tipodisp", "tipo disponible");
        cambiarPalabra("importedisp", "importe disponible");
        cambiarPalabra("comisioncons", "comision constante");
        cambiarPalabra("comisiondisp", "comision disponible");
        cambiarPalabra("comisionret", "comision retenida");
        cambiarPalabra("ivadisp", "iva disponible");
        cambiarPalabra("ivaret", "iva retenido");
        cambiarPalabra("ivacons", "iva constante");
        cambiarPalabra("numciudad", "numero de ciudad");
        cambiarPalabra("numcolonia", "numero de colonia");
        cambiarPalabra("nombreregion", "nombre de region");
        cambiarPalabra("nombreestado", "nombre de estado");
        cambiarPalabra("nombrecalle", "nombre de calle");
        cambiarPalabra("nombrecolonia", "nombre de colonia");
        cambiarPalabra("numabogado", "numero de abogado");
        cambiarPalabra("movtos", "movimientos");
        cambiarPalabra("vdooficial", "vencido oficial");
        cambiarPalabra("vdosinventa", "vencido si venta");
        cambiarPalabra("vdonoexigible", "vencido no exigente");
        cambiarPalabra("vdosinventaentre", "vencido sin venta entre");
        cambiarPalabra("numerogerente", "numero de gerente");
        cambiarPalabra("porc", "porcentaje");
        cambiarPalabra("creditoscomaerciales", "creditos comerciales");
        cambiarPalabra("prestamospersonales", "prestamos personales");
        cambiarPalabra("nombregerente", "nombre del gerente");
        cambiarPalabra("cd", "ciudad");
        cambiarPalabra("vdoficial", "vencido oficial");
        cambiarPalabra("vdoperativo", "vencido operativo");
        cambiarPalabra("fechacortefin", "fecha de corte final");
        cambiarPalabra("nombreproceso", "nombre del proceso");
        cambiarPalabra("fechainicio", "fehca de inicio");
        cambiarPalabra("fechafinal", "fecha final");
        cambiarPalabra("proc", "procedimiento");
        cambiarPalabra("credy", "credito y");
        cambiarPalabra("dineroelectronico", "dinero electronico");
        cambiarPalabra("statuscancelado", "status cancelado");
        cambiarPalabra("campania", "campañia");
        cambiarPalabra("saldadosg", "saldados ganados");
        cambiarPalabra("nuncag", "nunca ganado");
        cambiarPalabra("cobg", "cobranza ganada");
        cambiarPalabra("saldadosp", "saldados perdidos");
        cambiarPalabra("nuncap", "nunca perdidos");
        cambiarPalabra("cobp", "cobranza perdida");
        cambiarPalabra("regionesestadodecuenta", "regiones de estado de cuenta");
        cambiarPalabra("gerentedivision", "gerente de division");
        cambiarPalabra("gerenteregional", "gerente regional");
        cambiarPalabra("abonoropa", "abono de ropa");
        cambiarPalabra("saldoinicialropa", "saldo inicial de ropa");
        cambiarPalabra("abonomuebles", "abono de muebles");
        cambiarPalabra("saldoinicialmuebles", "saldo inicial de muebles");
        cambiarPalabra("abonoprestamos", "abono de prestamos");
        cambiarPalabra("saldoinicialprestamos", "saldo inicial de prestamos");
        cambiarPalabra("porcientorecuperadoropa", "prociento recuperado de ropa");
        cambiarPalabra("porcientorecuperadomuebles", "porciento recuperado de muebles");
        cambiarPalabra("porcientorecuperadoprestamos", "porciento recuperado de prestamos");
        cambiarPalabra("ultimapoliza", "ultima poliza");
        cambiarPalabra("altabeneficiario", "alta de beneficiario");
        cambiarPalabra("statusmovimiento", "status del movimiento");
        cambiarPalabra("foliocoordenada", "folio de coordenada");
        cambiarPalabra("uhtmanzana", "unidad habitacional manzana");
        cambiarPalabra("uhtotro", "unidad habitacional otro");
        cambiarPalabra("uhtandador", "unidad habitacional andador");
        cambiarPalabra("uhtetapa", "unidad habitacional etapa");
        cambiarPalabra("uhtlote", "unidad habitacional lote");
        cambiarPalabra("uhtedificio", "unidad habitacional edificio");
        cambiarPalabra("uhtentrada", "unidad habitacional entrada");
        cambiarPalabra("uhy", "unidad habitacional");
        cambiarPalabra("uhymanzana", "unidad habitacional manzana");
        cambiarPalabra("uhyotro", "unidad habitacional otro");
        cambiarPalabra("uhyandador", "unidad habitacional andador");
        cambiarPalabra("uhyetapa", "unidad habitacional etapa");
        cambiarPalabra("uhylote", "unidad habitacional lote");
        cambiarPalabra("uhyedificio", "unidad habitacional edificio");
        cambiarPalabra("uhyentrada", "unidad habitacional entrada");
        cambiarPalabra("uhr", "unidad habitacional");
        cambiarPalabra("uhrmanzana", "unidad habitacional manzana");
        cambiarPalabra("uhrotro", "unidad habitacional otro");
        cambiarPalabra("uhrandador", "unidad habitacional andador");
        cambiarPalabra("uhretapa", "unidad habitacional etapa");
        cambiarPalabra("uhrlote", "unidad habitacional lote");
        cambiarPalabra("uhredificio", "unidad habitacional edificio");
        cambiarPalabra("uhrentrada", "unidad habitacional entrada");
        cambiarPalabra("teltrabajo", "telefono del trabajo");
        cambiarPalabra("telefonocasa", "telefono de casa");
        cambiarPalabra("trabajoextension", "extencion del trabajo");
        cambiarPalabra("cunombreunoconyuge", "cliente unico nombre 1 del conyuge");
        cambiarPalabra("cunombredosconyuge", "cliente unico nombre 2 del conyuge");
        cambiarPalabra("cuapellidopaternoconyuge", "cliente unico apellido paterno del conyuge");
        cambiarPalabra("cuapellidomaternoconyuge", "cliente unico apellido materno del conyuge");
        cambiarPalabra("cucomplementoconyuge", "cliente unico complemento del conyuge");
        cambiarPalabra("cuentrecallesconyuge", "cliente unico entre calles del conyuge");
        cambiarPalabra("cunombreunoferencia", "cliente unico nombre uno de referencia");
        cambiarPalabra("cunombredosferencia", "cliente unico nombre dos de referencia");
        cambiarPalabra("cuapellidopaternoreferencia", "cliente unico apellido paterno de referencia");
        cambiarPalabra("cuapellidomaternoreferencia", "cliente unico apellido materno de referencia");
        cambiarPalabra("cucomplementoreferencia", "cliente unico complemento de referencia");
        cambiarPalabra("cuentrecallesreferencia", "cliente unico entre calles de referencia");
        cambiarPalabra("cuclientereferencia", "cliente unico cliente de referencia");
        cambiarPalabra("cunombreunoreferencia", "cliente unico nombre uno de referencia");
        cambiarPalabra("cunombredosreferencia", "cliente unico nombre dos de referencia");
        cambiarPalabra("cuapellidopaternoreferencia", "cliente unico apellido paterno de referencia");
        cambiarPalabra("cuapellidomaternoreferencia", "cliente unico apellido materno de referencia");
        cambiarPalabra("cuciudadreferencia", "cliente unico ciudad de referencia");
        cambiarPalabra("cucoloniareferencia", "cliente unico colonia de referencia");
        cambiarPalabra("cucallereferencia", "cliente unico calle de referencia");
        cambiarPalabra("cucasareferencia", "cliente unico casa de referencia");
        cambiarPalabra("cudeptoointeriorreferencia", "cliente unico departamento interior de referencia");
        cambiarPalabra("curumboreferencia", "cliente unico rumbo de referencia");
        cambiarPalabra("cucomplementoreferencia", "cliente unico complemento de referencia");
        cambiarPalabra("cuentrecallesreferencia", "cliente unico entre calles de referencia");
        cambiarPalabra("cuflaguhr", "cliente unico identificador de unidad habitacionan");
        cambiarPalabra("cuuhrmanzana", "cliente unico unidad habitacional manzana");
        cambiarPalabra("cuuhrotros", "cliente unico unidad habitacional otros");
        cambiarPalabra("cuuhrandador", "cliente unico unidad habitacional andador");
        cambiarPalabra("cuuhretapa", "cliente unico unidad habitacional etapa");
        cambiarPalabra("cuuhrlote", "cliente unico unidad habitacional lote");
        cambiarPalabra("cuuhredificio", "cliente unico unidad habitacional edificio");
        cambiarPalabra("cuuhrentrada", "cliente unico unidad habitacional entrada");
        cambiarPalabra("cutelefonoreferencia", "cliente unico telefono de referencia");
        cambiarPalabra("cutelefonocelularreferencia", "cliente unico telefono celular de referencia");
        cambiarPalabra("cuclavereferencia", "cliente unico clave de referencia");
        cambiarPalabra("cunumerosolicituddecredito", "cliente unico numero de solicitud de credito");
        cambiarPalabra("cutiendafolioanterior", "cliente unico tienda de folio anterior");
        cambiarPalabra("cufolioanterior", "cliente unico folio anterior");
        cambiarPalabra("cuclaveproducto", "cliente unico clave del producto");
        cambiarPalabra("cutipoos", "cliente unico tipo os");
        cambiarPalabra("cutipoproducto", "cliente unico tipo de producto");
        cambiarPalabra("complementoreferencia", "complemento de la referencia");
        cambiarPalabra("telefonoreferencia", "telefono de la referencia");
        cambiarPalabra("cuclavereferencia", "cliente unico clave de la referencia");
        cambiarPalabra("cunacionalidad", "cliente unico nacionalidad");
        cambiarPalabra("cuapellido", "cliente unico apellido");
        cambiarPalabra("cupais", "cliente unico pais");
        cambiarPalabra("sexoconyuge", "sexo del conyuge");
        cambiarPalabra("cuclienteconyugebcpl", "cliente unico cliente del conyuge bancoppel");
        cambiarPalabra("cuclientereferenciabcpl", "cliente unico cliente de referencia bancoppel");
        cambiarPalabra("cuclientereferencia", "cliente unico cliente de referencia");
        cambiarPalabra("flaglineacreditoesp", "identificador de linea de credito especial");
        cambiarPalabra("flagcapturacobranza", "identificador de captura de cobranza");
        cambiarPalabra("diasdomicilio", "dias de domicilio");
        cambiarPalabra("tiempotrabajoanterior", "tiempo de trabajo anterior");
        cambiarPalabra("diastrabaja", "dias que trabaja");
        cambiarPalabra("horainicialtrabajo", "hora inicial del trabajo");
        cambiarPalabra("horafinaltrabajo", "hora final del trabajo");
        cambiarPalabra("flagtestigo", "identificador de testigo");
        cambiarPalabra("ajusteperfil", "ajuste de perfil");
        cambiarPalabra("prepuntajealtoriesgo", "prepuntaje de alto riesgo");
        cambiarPalabra("pagoultimosdocemeses", "pago en los ultimos doce meses");
        cambiarPalabra("puntajefinalajustado", "puntaje final ajustado");
        cambiarPalabra("statusbcpl", "status bancoppel");
        cambiarPalabra("motivobcpl", "motivo bancoppel");
        cambiarPalabra("puntajetotalcn", "puntaje total cliente nuevo");
        cambiarPalabra("puntajecuestionario", "puntaje de cuestionario");
        cambiarPalabra("puntajescore", "puntaje score");
        cambiarPalabra("altaautomatica", "alta automatica");
        cambiarPalabra("puntualidadreferencia", "puntualidad de referencia");
        cambiarPalabra("testigoparametrico", "testigo parametrico");
        cambiarPalabra("altaautomaticasupervisar", "alta automatica a supervisar");
        cambiarPalabra("puntajefinalparcn", "puntaje final par cliente nuevo");
        cambiarPalabra("productobanco", "producto de banco");
        cambiarPalabra("solicitudbanco", "solicidud de banco");
        cambiarPalabra("montolineacreditobanco", "monto de linea de credito de banco");
        cambiarPalabra("respuestabanco", "respuesta de banco");
        cambiarPalabra("canalsolicitud", "canal de solicitud");
        cambiarPalabra("grupoevaluacion", "grupo de evaluacion");
        cambiarPalabra("grupohit", "grupo hit");
        cambiarPalabra("modalidadsolicitud", "modalidad de solicitud");
        cambiarPalabra("productocoppel", "producto coppel");
        cambiarPalabra("comprobanteingreso", "comprobante de ingreso");
        cambiarPalabra("opcionpuesto", "opcion de puesto");
        cambiarPalabra("uhcotro", "unidad habitacional otro");
        cambiarPalabra("uht", "unidad habitacional");
        cambiarPalabra("numinterior", "numero interior");
        cambiarPalabra("onota", "o nota");
        cambiarPalabra("numempleado", "numero de empleado");
        cambiarPalabra("tiendacobranzas", "tienda de cobranzas");
        cambiarPalabra("duracionefectiva", "duracion efectiva");
        cambiarPalabra("pkwhere", "llave primaria where");
        cambiarPalabra("horafinllamada", "hora de fin de la llamada");
        cambiarPalabra("horainiciollamada", "hora de inicio de la llamada");
        cambiarPalabra("fechahorallamada", "fecha y hora de la llamada");
        cambiarPalabra("motivonollame", "motivo de no llamar");
        cambiarPalabra("finllamada", "fin de la llamada");
        cambiarPalabra("numext", "numero externo");
        cambiarPalabra("saldoacancelar", "saldo a cancelar");
        cambiarPalabra("numarticulo", "numero de articulo");
        cambiarPalabra("numfactura", "numero de factura");
        cambiarPalabra("tiendafacturo", "tienda que facturo");
        cambiarPalabra("saldototal", "saldo total");
        cambiarPalabra("cveconvenio", "clave de convenio");
        cambiarPalabra("tipologica", "tipo de logica");
        cambiarPalabra("horafin", "hora de finalizacion");
        cambiarPalabra("razondeincumplimiento", "razon de incumplimiento");
        cambiarPalabra("horainicio", "hora de inicio");
        cambiarPalabra("contactocliente", "contacto de cliente");
        cambiarPalabra("polizadespuesde", "poliza despues de");
        cambiarPalabra("derechode", "derecho de");
        cambiarPalabra("claveamiss", "clave amiss");
        cambiarPalabra("antesde", "antes de");
        cambiarPalabra("despuesde", "despuesde");
        cambiarPalabra("gastosa", "gastos a");
        cambiarPalabra("gastosde", "gastos de");
        cambiarPalabra("fondorestringiblemp", "fondo restringible mp");
        cambiarPalabra("comisionmp", "comision mp");
        cambiarPalabra("candidatoscps", "candidatos cps");
        cambiarPalabra("enganchealtoriesgo", "enganche de alto riesgo");
        cambiarPalabra("puntajefinal", "puntaje final");
        cambiarPalabra("nuevosaldo", "nuevo saldo");
        cambiarPalabra("logicaabono", "logica de abono");
        cambiarPalabra("flagplazo", "identificador de plazo");
        cambiarPalabra("adic", "adicional");
        cambiarPalabra("aterceros", "a terceros");
        cambiarPalabra("campana", "campaña");
        cambiarPalabra("acartera", "a cartera");
        cambiarPalabra("numcte", "numero del cliente");
        cambiarPalabra("numcalle", "numero de calle");
        cambiarPalabra("numestado", "numero de estado");
        cambiarPalabra("intcondonado", "condonado");
        cambiarPalabra("altasporcambiosau", "altas por cambios au");
        cambiarPalabra("altasporcambioscoppel", "altas por cambios coppel");
        cambiarPalabra("tarjetascontenidoemp", "contenido de tarjetas de empleado");
        cambiarPalabra("altasporabonosseguroscps", "altas por abonos seguros cps");
        cambiarPalabra("segurosdepuradoscps", "seguros depurados cps");
        cambiarPalabra("seguroscanceladoscps", "seguros cancelados cps");
        cambiarPalabra("finalseguroscps", "final seguros cps");
        cambiarPalabra("oposicionessol", "oposiciones sol");
        cambiarPalabra("oposicionesref", "oposiciones referencia");
        cambiarPalabra("oposicionesctes", "oposiciones de clientes");
        cambiarPalabra("cancelacionessol", "cancelaciones sol");
        cambiarPalabra("cancelacionesref", "cancelaciones referencia");
        cambiarPalabra("cancelacionesctes", "cancelaciones de clientes");
        cambiarPalabra("totalregistros", "total de registros");
        cambiarPalabra("fechareporte", "fecha de reporte");
        cambiarPalabra("ult", "ultima");
        cambiarPalabra("numctes", "numero de clientes");
        cambiarPalabra("norm", "normal");
        cambiarPalabra("anti", "antiguos");
        cambiarPalabra("gtes", "gerentes");
        cambiarPalabra("empleadochofer", "empleado chofer");
        cambiarPalabra("totalctesmesanteriorcoppel", "total de clientes del mes anterior coppel");
        cambiarPalabra("totalctesmesactualcoppel", "total de clientes del mes actual coppel");
        cambiarPalabra("totalctesmesanteriorbcpl", "total de clientes del mes anterior bancoppel");
        cambiarPalabra("totalctesmesactualbcpl", "total de clientes del mes actual bancoppel");
        cambiarPalabra("totalclientesmesanterior", "total de clientes del mes anterior");
        cambiarPalabra("totalclientesmesactual", "total de clientes del mes actual");
        cambiarPalabra("vencidosobresaldoanterior", "vencidos o sobresaldo anterior");
        cambiarPalabra("vencidosobresaldoactual", "vencido o sobresaldo actual");
        cambiarPalabra("calificacionmesanterior", "calificacion del mes anterior");
        cambiarPalabra("calificacionmesactual", "calificacion del mes actual");
        cambiarPalabra("difde", "diferencia de");
        cambiarPalabra("calif", "calificacion");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");
        cambiarPalabra("", "");


        //cambiarPalabra("", "");
        //Br4aNc0pp1219..--/2001













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

        String regex = "^\\t?\\s*\\[?([\\w\\ñ]*)\\]?|\\s\\[?([a-z]+)\\]?\\s?|\\(([\\d*\\,*\\s*]*)\\)";

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