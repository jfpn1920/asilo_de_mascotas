import java.util.Scanner;
public class asilo_de_mascotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombresMascotas = new String[10];
        String[] especies = new String[10];
        String[] razas = new String[10];
        String[] edades = new String[10];
        String[] propietarios = new String[10];
        String[] telefonos = new String[10];
        String[] tiposAlojamiento = new String[10];
        String[] alimentaciones = new String[10];
        String[] fechasIngreso = new String[10];
        String[] fechasSalida = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-----------------------------------------//
        //--|menu_principal_de_asilo_de_mascotas|--//
        //-----------------------------------------//
        do {
            System.out.println("menu principal de asilo de mascotas");
            System.out.println("1) Registrar mascota");
            System.out.println("2) Editar mascota");
            System.out.println("3) Listar mascotas");
            System.out.println("4) Buscar mascota");
            System.out.println("5) Eliminar mascota");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_mascota|--//
                //-----------------------//
                case 1:
                    if (total >= nombresMascotas.length) {
                        System.out.println("No hay espacio para registrar mas mascotas.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de mascota");
                    System.out.println("id de la mascota a registrar: " + id);
                    System.out.print("nombre de la mascota: ");
                    nombresMascotas[total] = entrada.nextLine();
                    System.out.print("especie: ");
                    especies[total] = entrada.nextLine();
                    System.out.print("raza: ");
                    razas[total] = entrada.nextLine();
                    System.out.print("edad: ");
                    edades[total] = entrada.nextLine();
                    System.out.print("nombre del propietario: ");
                    propietarios[total] = entrada.nextLine();
                    System.out.print("telefono del propietario: ");
                    telefonos[total] = entrada.nextLine();
                    System.out.print("tipo de alojamiento: ");
                    tiposAlojamiento[total] = entrada.nextLine();
                    System.out.print("tipo de alimentacion: ");
                    alimentaciones[total] = entrada.nextLine();
                    System.out.print("fecha de ingreso: ");
                    fechasIngreso[total] = entrada.nextLine();
                    System.out.print("fecha de salida: ");
                    fechasSalida[total] = entrada.nextLine();
                    System.out.print("estado de la mascota: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Mascota registrada correctamente.");
                    total++;
                    break;
                //--------------------//
                //--|editar_mascota|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen mascotas registradas.");
                        break;
                    }
                    System.out.println("Datos de las mascotas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Mascota: " + nombresMascotas[i] + " | Especie: " + especies[i] + " | Raza: " + razas[i] + " | Edad: " + edades[i] + " | Propietario: " + propietarios[i] + " | Telefono: " + telefonos[i] + " | Alojamiento: " + tiposAlojamiento[i] + " | Alimentacion: " + alimentaciones[i] + " | Fecha ingreso: " + fechasIngreso[i] + " | Fecha salida: " + fechasSalida[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la mascota: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato de la mascota");
                        System.out.print("Nuevo nombre de la mascota: ");
                        nombresMascotas[posicion] = entrada.nextLine();
                        System.out.print("Nueva especie: ");
                        especies[posicion] = entrada.nextLine();
                        System.out.print("Nueva raza: ");
                        razas[posicion] = entrada.nextLine();
                        System.out.print("Nueva edad: ");
                        edades[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del propietario: ");
                        propietarios[posicion] = entrada.nextLine();
                        System.out.print("Nuevo telefono del propietario: ");
                        telefonos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de alojamiento: ");
                        tiposAlojamiento[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de alimentacion: ");
                        alimentaciones[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de ingreso: ");
                        fechasIngreso[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de salida: ");
                        fechasSalida[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado de la mascota: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Mascota actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_mascotas|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen mascotas registradas.");
                    } else {
                        System.out.println("Lista de mascotas");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Mascota: " + nombresMascotas[i] + " | Especie: " + especies[i] + " | Raza: " + razas[i] + " | Edad: " + edades[i] + " | Propietario: " + propietarios[i] + " | Telefono: " + telefonos[i] + " | Alojamiento: " + tiposAlojamiento[i] + " | Alimentacion: " + alimentaciones[i] + " | Fecha ingreso: " + fechasIngreso[i] + " | Fecha salida: " + fechasSalida[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_mascota|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen mascotas registradas.");
                        break;
                    }
                    System.out.println("busqueda de mascota");
                    System.out.print("ingresa la id para buscar mascota: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos de la mascota encontrada:");
                        System.out.println("ID: " + idBusqueda + " | Mascota: " + nombresMascotas[posicion] + " | Especie: " + especies[posicion] + " | Raza: " + razas[posicion] + " | Edad: " + edades[posicion] + " | Propietario: " + propietarios[posicion] + " | Telefono: " + telefonos[posicion] + " | Alojamiento: " + tiposAlojamiento[posicion] + " | Alimentacion: " + alimentaciones[posicion] + " | Fecha ingreso: " + fechasIngreso[posicion] + " | Fecha salida: " + fechasSalida[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_mascota|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen mascotas registradas.");
                        break;
                    }
                    System.out.println("Datos de las mascotas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Mascota: " + nombresMascotas[i] + " | Especie: " + especies[i] + " | Raza: " + razas[i] + " | Edad: " + edades[i] + " | Propietario: " + propietarios[i] + " | Telefono: " + telefonos[i] + " | Alojamiento: " + tiposAlojamiento[i] + " | Alimentacion: " + alimentaciones[i] + " | Fecha ingreso: " + fechasIngreso[i] + " | Fecha salida: " + fechasSalida[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la mascota a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombresMascotas[i] = nombresMascotas[i + 1];
                            especies[i] = especies[i + 1];
                            razas[i] = razas[i + 1];
                            edades[i] = edades[i + 1];
                            propietarios[i] = propietarios[i + 1];
                            telefonos[i] = telefonos[i + 1];
                            tiposAlojamiento[i] = tiposAlojamiento[i + 1];
                            alimentaciones[i] = alimentaciones[i + 1];
                            fechasIngreso[i] = fechasIngreso[i + 1];
                            fechasSalida[i] = fechasSalida[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Mascota eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen mascotas registradas.");
                        break;
                    }
                    int reservadas = 0;
                    int alojadas = 0;
                    int enAdopcion = 0;
                    int retiradas = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Reservado")) {
                            reservadas++;
                        } else if (estados[i].equalsIgnoreCase("Alojado")) {
                            alojadas++;
                        } else if (estados[i].equalsIgnoreCase("En adopcion")) {
                            enAdopcion++;
                        } else if (estados[i].equalsIgnoreCase("Retirado")) {
                            retiradas++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    String especieMayor = especies[0];
                    int cantidadEspecieMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadEspecie = 0;
                        for (int j = 0; j < total; j++) {
                            if (especies[i].equalsIgnoreCase(especies[j])) {
                                cantidadEspecie++;
                            }
                        }
                        if (cantidadEspecie > cantidadEspecieMayor) {
                            cantidadEspecieMayor = cantidadEspecie;
                            especieMayor = especies[i];
                        }
                    }
                    String razaMayor = razas[0];
                    int cantidadRazaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadRaza = 0;
                        for (int j = 0; j < total; j++) {
                            if (razas[i].equalsIgnoreCase(razas[j])) {
                                cantidadRaza++;
                            }
                        }
                        if (cantidadRaza > cantidadRazaMayor) {
                            cantidadRazaMayor = cantidadRaza;
                            razaMayor = razas[i];
                        }
                    }
                    String alojamientoMayor = tiposAlojamiento[0];
                    int cantidadAlojamientoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadAlojamiento = 0;
                        for (int j = 0; j < total; j++) {
                            if (tiposAlojamiento[i].equalsIgnoreCase(tiposAlojamiento[j])) {
                                cantidadAlojamiento++;
                            }
                        }
                        if (cantidadAlojamiento > cantidadAlojamientoMayor) {
                            cantidadAlojamientoMayor = cantidadAlojamiento;
                            alojamientoMayor = tiposAlojamiento[i];
                        }
                    }
                    String alimentacionMayor = alimentaciones[0];
                    int cantidadAlimentacionMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadAlimentacion = 0;
                        for (int j = 0; j < total; j++) {
                            if (alimentaciones[i].equalsIgnoreCase(alimentaciones[j])) {
                                cantidadAlimentacion++;
                            }
                        }
                        if (cantidadAlimentacion > cantidadAlimentacionMayor) {
                            cantidadAlimentacionMayor = cantidadAlimentacion;
                            alimentacionMayor = alimentaciones[i];
                        }
                    }
                    String propietarioMayor = propietarios[0];
                    int cantidadPropietarioMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadPropietario = 0;
                        for (int j = 0; j < total; j++) {
                            if (propietarios[i].equalsIgnoreCase(propietarios[j])) {
                                cantidadPropietario++;
                            }
                        }
                        if (cantidadPropietario > cantidadPropietarioMayor) {
                            cantidadPropietarioMayor = cantidadPropietario;
                            propietarioMayor = propietarios[i];
                        }
                    }
                    String estadoMayor = estados[0];
                    int cantidadEstadoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadEstado = 0;
                        for (int j = 0; j < total; j++) {
                            if (estados[i].equalsIgnoreCase(estados[j])) {
                                cantidadEstado++;
                            }
                        }
                        if (cantidadEstado > cantidadEstadoMayor) {
                            cantidadEstadoMayor = cantidadEstado;
                            estadoMayor = estados[i];
                        }
                    }
                    System.out.println("resumen de asilo de mascotas");
                    System.out.println("Mascotas registradas: " + total);
                    System.out.println("Especie mas frecuente: " + especieMayor);
                    System.out.println("Raza mas frecuente: " + razaMayor);
                    System.out.println("Alojamiento mas utilizado: " + alojamientoMayor);
                    System.out.println("Alimentacion mas frecuente: " + alimentacionMayor);
                    System.out.println("Propietario con mas mascotas: " + propietarioMayor);
                    System.out.println("Estado mas frecuente: " + estadoMayor);
                    System.out.println("Reservadas: " + reservadas);
                    System.out.println("Alojadas: " + alojadas);
                    System.out.println("En adopcion: " + enAdopcion);
                    System.out.println("Retiradas: " + retiradas);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Asilo de Mascotas.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}