package Registro;
import java.util.*;


public class Main {
    public static void main(String[] args) 
    {
        // N determina el tamaño del array
        final int N = 20;

        // Crea el array de personas
        Persona[] personas = new Persona[N];

        // Carga varias personas
        personas[0] = new Persona("Juan Alberto", 1110447891, "20/05/23");
        personas[1] = new Persona("Juan Alberto", 1110447891, "20/05/23");
        personas[2] = new Persona("Juan Alberto", 1110447891, "20/05/23");

        int opcion;
        Scanner s = new Scanner(System.in);
        String nombreIntroducido;
        int cedulaIntroducido;
        String fechaNacimientoIntroducido;

        do {
            System.out.println("\nREGISTRO");
            System.out.println("===================");
            System.out.println("1. Crear una persona nueva");
            System.out.println("2. Listar todas las personas");
            System.out.println("3. Indicar el nombre de la persona más joven");
            System.out.println("4. Salir del programa");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("\nNUEVA PERSONA");
                    System.out.println("===========");

                    // Busca la primera posición libre del array
                    int primeraLibre = -1;
                    do {
                        primeraLibre++;
                    } while (!(personas[primeraLibre] == null));

                    System.out.println("Por favor, introduzca los datos de la persona.");
                    System.out.print("Nombre: ");
                    nombreIntroducido = s.nextLine();
                    System.out.print("Cedula: ");
                    cedulaIntroducido = Integer.parseInt(s.nextLine());
                    System.out.print("Fecha de Nacimiento: ");
                    fechaNacimientoIntroducido = s.nextLine();

                    personas[primeraLibre] = new Persona(nombreIntroducido, cedulaIntroducido, fechaNacimientoIntroducido);
                    break;

                case 2:
                    System.out.println("\nLISTADO");
                    System.out.println("=======");

                    boolean hayPersonas = false;

                    for (Persona persona : personas) {
                        if (persona != null) {
                            persona.mostrarInformacion();
                            hayPersonas = true;
                        }
                    }

                    if (!hayPersonas) {
                        System.out.println("No hay personas registradas.\n");
                    }
                    break;

                case 3:
                    System.out.println("\nPERSONA MÁS JOVEN");
                    System.out.println("==================");
                    Persona personaMasJoven = null;
                    for (Persona persona : personas) {
                        if (persona != null) {
                            if (personaMasJoven == null || persona.calcularEdad() < personaMasJoven.calcularEdad()) {
                                personaMasJoven = persona;
                            }
                        }
                    }
                    if (personaMasJoven != null) {
                        System.out.println("La persona más joven es: " + personaMasJoven.getNombre());
                        System.out.println("Edad: " + personaMasJoven.calcularEdad() + " años");
                    } else {
                        System.out.println("No hay personas registradas.\n");
                    }
                    break;

                default:
                    break;
            }
        } while (opcion != 4);

        s.close();
    }
}

