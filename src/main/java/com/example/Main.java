package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                default:
                    System.out.println("Opción Inválida");
            }

        }
        System.out.println("Fin del programa");
        scanner.close();
    }

    public static void menu() {
        System.out.println("--------------------------------");
        System.out.println("Bienvenido a la aplicación de la semana 10");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("0. para salir");
        System.out.println("Selecciona una opción: ");
        System.out.println("--------------------------------");
    }

    public static void ejercicio1() {
        System.out.println("Ejercicio 1: Calculadora de descuentos en Tienda");

        int cantidadProductos = 12;
        double precioUnitario = 15000;
        double totalCompra = cantidadProductos * precioUnitario;
        double descuento = 0;

        if (cantidadProductos > 20) {
            descuento = 0.20;
        } else if (cantidadProductos > 10) {
            descuento = 0.15;
        } else if (cantidadProductos > 5) {
            descuento = 0.10;

        }

        totalCompra = totalCompra - (totalCompra * descuento);

        if (totalCompra > 100000) {
            totalCompra = totalCompra - (totalCompra * 0.05);
        }

        System.out.println("Cantidad de productos: " + cantidadProductos);
        System.out.println("Precio final a pagar: $" + totalCompra);
        System.out.println();

    }

    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        double ingresosMensuales = 3000000;
        int edadCliente = 20;
        double gastosMensuales = 500000;

        boolean cumpleIngresos = ingresosMensuales >= 2000000;
        boolean cumpleEdad = edadCliente >= 18 && edadCliente <= 65;
        boolean cumpleGastos = gastosMensuales <= (ingresosMensuales * 0.70);
        double montoMaximoAprobado = ingresosMensuales * 5;

        if (cumpleIngresos && cumpleEdad && cumpleGastos) {
            System.out.println("CRÉDITO APROBADO");
            System.out.println("Monto aprobado: " + montoMaximoAprobado);
        }

    }

    public static void ejercicio3() {
        System.out.println("Ejercicio 3");

        int inventarioManzanas = 15;
        int inventarioBananos = 8;
        int inventarioNaranjas = 12;

        int[] ventasManzanas = { 3, 5, 2, 4, 6, 3, 5 };
        int[] ventasBananos = { 2, 3, 4, 2, 3, 5, 2 };
        int[] ventasNaranjas = { 4, 3, 2, 5, 4, 3, 6 };

        for (int dia = 0; dia < 7; dia++) {
            System.out.println("Dia " + (dia + 1) + ":");

            inventarioManzanas -= ventasManzanas[dia];
            inventarioBananos -= ventasBananos[dia];
            inventarioNaranjas -= ventasNaranjas[dia];

            if (inventarioManzanas < 10) {
                inventarioManzanas += 50;
                System.out.println("  Pedido de manzanas: +50 unidades");
            }
            if (inventarioBananos < 10) {
                inventarioBananos += 50;
                System.out.println("  Pedido de bananos: +50 unidades");
            }
            if (inventarioNaranjas < 10) {
                inventarioNaranjas += 50;
                System.out.println("  Pedido de naranjas: +50 unidades");
            }

            System.out.println("  Inventario final - Manzanas: " + inventarioManzanas + ", Bananos: " + inventarioBananos + ", Naranjas: " + inventarioNaranjas);
        }
        System.out.println();
    }

    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        int tiempoBus = 20;
        int tiempoMetro = 15;
        int tiempoCaminar = 10;
        
        boolean hayTrafico = true;
        boolean llueve = false;
        
        if (hayTrafico) {
            tiempoBus = tiempoBus + (tiempoBus * 50 / 100);
        }
        
        if (llueve) {
            tiempoCaminar = tiempoCaminar + (tiempoCaminar * 100 / 100);
        }
        
        int tiempoTotal = tiempoBus + tiempoMetro + tiempoCaminar;
        
        System.out.println("Tiempo en bus: " + tiempoBus + " minutos");
        System.out.println("Tiempo en metro: " + tiempoMetro + " minutos");
        System.out.println("Tiempo caminando: " + tiempoCaminar + " minutos");
        System.out.println("Tiempo total de viaje: " + tiempoTotal + " minutos");
        System.out.println();

    }

    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        System.out.println("=== EJERCICIO 5: GESTION DE VUELOS ===");
        
        String[] vuelos = {"AV101", "LA202", "CM303", "VV404", "AD505"};
        int[] retrasos = {10, 20, 5, 30, 0};
        boolean[] cancelados = {false, false, false, false, true};
        boolean malClima = true;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Vuelo " + vuelos[i] + ": ");
            
            if (cancelados[i]) {
                System.out.println("CANCELADO");
            } else {
                int retrasoTotal = retrasos[i];
                if (malClima) {
                    retrasoTotal += 30;
                }
                
                if (retrasoTotal > 15) {
                    System.out.println("RETRASADO (" + retrasoTotal + " minutos)");
                } else {
                    System.out.println("A TIEMPO");
                }
            }
        }
        System.out.println();
    }

    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        System.out.println("=== EJERCICIO 6: OPTIMIZADOR DE RUTAS ===");
        
        int horasDisponibles = 8;
        int minutosDisponibles = horasDisponibles * 60;
        
        String[] zonas = {"centro", "centro", "periferia", "centro", "rural", 
                         "periferia", "centro", "periferia", "rural", "centro"};
        
        int tiempoUsado = 0;
        int entregasRealizadas = 0;
        
        for (int i = 0; i < zonas.length; i++) {
            int tiempoEntrega = 0;
            
            if (zonas[i].equals("centro")) {
                tiempoEntrega = 30;
            } else if (zonas[i].equals("periferia")) {
                tiempoEntrega = 45;
            } else if (zonas[i].equals("rural")) {
                tiempoEntrega = 60;
            }
            
            if (tiempoUsado + tiempoEntrega <= minutosDisponibles) {
                tiempoUsado += tiempoEntrega;
                entregasRealizadas++;
                System.out.println("Entrega " + (i + 1) + " en zona " + zonas[i] + 
                                 " - Tiempo: " + tiempoEntrega + " min");
            } else {
                System.out.println("No hay tiempo para mas entregas");
                break;
            }
        }
        
        System.out.println("Total de entregas realizadas: " + entregasRealizadas);
        System.out.println("Tiempo total usado: " + tiempoUsado + " minutos");
        System.out.println();
    }

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");

         System.out.println("=== EJERCICIO 7: MONITOR DE EJERCICIOS ===");
        
        int minutosCardio = 30;
        int minutosPesas = 20;
        int minutosYoga = 15;
        
        int caloriasCardio = minutosCardio * 10;
        int caloriasPesas = minutosPesas * 8;
        int caloriasYoga = minutosYoga * 5;
        
        int caloriasTotal = caloriasCardio + caloriasPesas + caloriasYoga;
        int puntos = 0;
        
        if (caloriasTotal > 500) {
            puntos = 50;
        }
        
        System.out.println("Calorias quemadas en cardio: " + caloriasCardio);
        System.out.println("Calorias quemadas en pesas: " + caloriasPesas);
        System.out.println("Calorias quemadas en yoga: " + caloriasYoga);
        System.out.println("Total de calorias quemadas: " + caloriasTotal);
        System.out.println("Puntos ganados: " + puntos);
        System.out.println();
    }

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
         System.out.println("=== EJERCICIO 8: TRIAJE HOSPITALARIO ===");
        
        String[] pacientes = {"Juan", "Maria", "Pedro", "Ana", "Carlos"};
        double[] temperaturas = {37.5, 39.0, 36.8, 38.8, 37.2};
        int[] presionSistolica = {120, 145, 130, 138, 125};
        int[] presionDiastolica = {80, 95, 85, 88, 82};
        int[] escalaDolor = {5, 9, 3, 7, 2};
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Paciente " + pacientes[i] + ": ");
            
            boolean esUrgente = false;
            
            if (temperaturas[i] > 38.5) {
                esUrgente = true;
            }
            if (presionSistolica[i] > 140 || presionDiastolica[i] > 90) {
                esUrgente = true;
            }
            if (escalaDolor[i] >= 8) {
                esUrgente = true;
            }
            
            if (esUrgente) {
                System.out.println("URGENTE");
            } else if (escalaDolor[i] >= 5 || temperaturas[i] > 37.5) {
                System.out.println("PRIORITARIO");
            } else {
                System.out.println("NORMAL");
            }
        }
        System.out.println();
    }

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
        System.out.println("=== EJERCICIO 9: PROMEDIO ESTUDIANTIL ===");
        
        String[] estudiantes = {"Laura", "Diego", "Sofia"};
        double[] parciales = {3.5, 4.2, 3.0};
        double[] proyectos = {4.0, 3.8, 3.2};
        double[] participacion = {4.5, 4.0, 3.5};
        
        for (int i = 0; i < 3; i++) {
            double promedioFinal = (parciales[i] * 0.30) +  (proyectos[i] * 0.40) + (participacion[i] * 0.30);
            
            System.out.println("Estudiante: " + estudiantes[i]);
            System.out.println("  Parciales: " + parciales[i]);
            System.out.println("  Proyecto: " + proyectos[i]);
            System.out.println("  Participacion: " + participacion[i]);
            System.out.println("  Promedio final: " + promedioFinal);
            
            if (promedioFinal >= 4.0) {
                System.out.println("  Resultado: APROBADO");
            } else if (promedioFinal >= 3.5) {
                System.out.println("  Resultado: SUPLETORIO");
            } else {
                System.out.println("  Resultado: REPROBADO");
            }
            System.out.println();
        }
    }

    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        System.out.println("=== EJERCICIO 10: SISTEMA DE RIEGO ===");
        
        int[] humedadSuelo = {25, 45, 55, 28, 35, 60, 20};
        int[] temperatura = {28, 26, 22, 30, 27, 24, 29};
        boolean[] llovio = {false, false, true, false, false, true, false};
        
        for (int dia = 0; dia < 7; dia++) {
            System.out.println("Dia " + (dia + 1) + ":");
            System.out.println("  Humedad: " + humedadSuelo[dia] + "%");
            System.out.println("  Temperatura: " + temperatura[dia] + " grados");
            System.out.println("  Llovio: " + (llovio[dia] ? "Si" : "No"));
            
            if (llovio[dia]) {
                System.out.println("  Riego: NO ACTIVADO (llovio recientemente)");
            } else if (humedadSuelo[dia] < 30) {
                System.out.println("  Riego: ACTIVADO por 60 minutos");
            } else if (temperatura[dia] > 25 && humedadSuelo[dia] < 50) {
                System.out.println("  Riego: ACTIVADO por 30 minutos");
            } else {
                System.out.println("  Riego: NO ACTIVADO");
            }
            System.out.println();
        }
    }

}
