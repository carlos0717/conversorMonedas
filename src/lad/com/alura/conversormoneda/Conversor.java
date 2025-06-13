package lad.com.alura.conversormoneda;

import java.util.Scanner;

public class Conversor {
    public static void eleccionUserMenu() {
        Scanner scanner = new Scanner(System.in);
        int op = 0;

        while (op != 7) {
            System.out.println("\n************************************");
            System.out.println("Sea bienvenido al Conversor de Moneda");
            System.out.println("************************************");
            System.out.println("Elige una de las siguientes opciones:");
            System.out.println("1. Dolar =>> Peso Argentino");
            System.out.println("2. Peso Argentino =>> Dolar");
            System.out.println("3. Dolar =>> Real brasileño");
            System.out.println("4. Real brasileño =>> Dolar");
            System.out.println("5. Dolar =>> Peso Colombiano");
            System.out.println("6. Peso Colombiano =>> Dolar");
            System.out.println("7. Salir");
            System.out.println("************************************");

            System.out.print("Ingresa tu opción: ");
            try {
                op = scanner.nextInt();
                scanner.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("Ingresa el valor que deseas convertir: ");
                        double dolar = scanner.nextDouble();
                        dolarPeso(dolar);
                        System.out.println("\nPresiona Enter para continuar...");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case 2:
                        System.out.println("Ingresa el valor que deseas convertir: ");
                        double peso = scanner.nextDouble();
                        pesoDolar(peso);
                        System.out.println("\nPresiona Enter para continuar...");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case 3:
                        System.out.println("Ingresa el valor que deseas convertir: ");
                        double dolar2 = scanner.nextDouble();
                        dolarReal(dolar2);
                        System.out.println("\nPresiona Enter para continuar...");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case 4:
                        System.out.println("Ingresa el valor que deseas convertir: ");
                        double real = scanner.nextDouble();
                        realDolar(real);
                        System.out.println("\nPresiona Enter para continuar...");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case 5:
                        System.out.println("Ingresa el valor que deseas convertir: ");
                        double dolar3 = scanner.nextDouble();
                        dolarPesoColombiano(dolar3);
                        System.out.println("\nPresiona Enter para continuar...");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case 6:
                        System.out.println("Ingresa el valor que deseas convertir: ");
                        double peso2 = scanner.nextDouble();
                        pesoColombianoDolar(peso2);
                        System.out.println("\nPresiona Enter para continuar...");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case 7:
                        System.out.println("Gracias por usar el Conversor de Moneda");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                        System.out.println("\nPresiona Enter para continuar...");
                        scanner.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Por favor, ingresa un número.");
                System.out.println("\nPresiona Enter para continuar...");
                scanner.nextLine();
                scanner.nextLine();
                op = 0;
            }
        }
    }

    public static double dolarPeso(double dolar){
        try {
            double tasa = ConversorApp.obtenerTasa("https://v6.exchangerate-api.com/v6/9b97934f40b0369ebec23fc4/latest/USD", "ARS");
            double peso = dolar * tasa;
            System.out.println("El valor " + dolar + " [USD] corresponde a => " + peso + " [ARS]");
            return peso;
        } catch (Exception e) {
            System.out.println("Error al obtener la tasa de conversión: " + e.getMessage());
            return 0;
        }
    }

    public static double pesoDolar(double peso){
        try {
            double tasa = ConversorApp.obtenerTasa("https://v6.exchangerate-api.com/v6/9b97934f40b0369ebec23fc4/latest/ARS", "USD");
            double dolar = peso * tasa;
            System.out.println("El valor " + peso + " [ARS] corresponde a => " + dolar + " [USD]");
            return dolar;
        } catch (Exception e) {
            System.out.println("Error al obtener la tasa de conversión: " + e.getMessage());
            return 0;
        }
    }

    public static double dolarReal(double dolar){
        try {
            double tasa = ConversorApp.obtenerTasa("https://v6.exchangerate-api.com/v6/9b97934f40b0369ebec23fc4/latest/USD", "BRL");
            double real = dolar * tasa;
            System.out.println("El valor " + dolar + " [USD] corresponde a => " + real + " [BRL]");
            return real;
        } catch (Exception e) {
            System.out.println("Error al obtener la tasa de conversión: " + e.getMessage());
            return 0;
        }
    }

    public static double realDolar(double real){
        try {
            double tasa = ConversorApp.obtenerTasa("https://v6.exchangerate-api.com/v6/9b97934f40b0369ebec23fc4/latest/BRL", "USD");
            double dolar = real * tasa;
            System.out.println("El valor " + real + " [BRL] corresponde a => " + dolar + " [USD]");
            return dolar;
        } catch (Exception e) {
            System.out.println("Error al obtener la tasa de conversión: " + e.getMessage());
            return 0;
        }
    }

    public static double dolarPesoColombiano(double dolar){
        try {
            double tasa = ConversorApp.obtenerTasa("https://v6.exchangerate-api.com/v6/9b97934f40b0369ebec23fc4/latest/USD", "COP");
            double peso = dolar * tasa;
            System.out.println("El valor " + dolar + " [USD] corresponde a => " + peso + " [COP]");
            return peso;
        } catch (Exception e) {
            System.out.println("Error al obtener la tasa de conversión: " + e.getMessage());
            return 0;
        }
    }

    public static double pesoColombianoDolar(double peso){
        try {
            double tasa = ConversorApp.obtenerTasa("https://v6.exchangerate-api.com/v6/9b97934f40b0369ebec23fc4/latest/COP", "USD");
            double dolar = peso * tasa;
            System.out.println("El valor " + peso + " [COP] corresponde a => " + dolar + " [USD]");
            return dolar;
        } catch (Exception e) {
            System.out.println("Error al obtener la tasa de conversión: " + e.getMessage());
            return 0;
        }
    }
}
