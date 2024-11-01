/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsemana4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mayra Bardales
 */
public class Labsemana4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int option;
        int countReverse = 0, countPerfect = 0, countPrime = 0, countVoting = 0;

        do {
            
            System.out.println("Menu:");
            System.out.println("1 - Palabra al reves");
            System.out.println("2 - Numero perfecto");
            System.out.println("3 - Primos");
            System.out.println("4 - Votaciones");
            System.out.println("5 - Salir");
            System.out.print("Seleccione una opcion: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    
                    System.out.print("Ingrese una palabra: ");
                    String palabra = scanner.nextLine();
                    String palabraReversa = "";
                    for (int i = palabra.length() - 1; i >= 0; i--) {
                        palabraReversa += palabra.charAt(i);
                    }
                    System.out.println("Palabra al reves: " + palabraReversa);
                    countReverse++;
                    break;

                case 2:
                   
                   System.out.print("Ingrese un numero: ");
                    int numero = scanner.nextInt();
                    int sumaDivisores = 0;
                    System.out.print("Divisores de " + numero + ": ");
                    for (int i = 1; i < numero; i++) {
                        if (numero % i == 0) {
                            System.out.print(i + " ");
                            sumaDivisores += i;
                        }
                    }
                    System.out.println();
                    if (sumaDivisores == numero) {
                        System.out.println(numero + " es un numero perfecto.");
                    } else {
                        System.out.println(numero + " no es un numero perfecto.");
                    }
                    countPerfect++;
                    break;

                case 3:
                    
                    int numeroAleatorio = random.nextInt(100) + 1;
                    int contadorDivisores = 0;
                    System.out.println("Numero generado: " + numeroAleatorio);
                    System.out.print("Divisores de " + numeroAleatorio + ": ");
                    for (int i = 1; i <= numeroAleatorio; i++) {
                        if (numeroAleatorio % i == 0) {
                            System.out.print(i + " ");
                            contadorDivisores++;
                        }
                    }
                    System.out.println();
                    if (contadorDivisores == 2) {
                        System.out.println("El numero " + numeroAleatorio + " es primo.");
                    } else {
                        System.out.println("El numero " + numeroAleatorio + " no es primo.");
                    }
                    countPrime++;
                    break;

                case 4:
                    
                    System.out.print("Ingrese el numero de votantes: ");
                    int votantes = scanner.nextInt();
                    scanner.nextLine(); 

                    int votosAzul = 0, votosRojo = 0, votosNegro = 0, votosAmarillo = 0, votosNulos = 0;
                    for (int i = 1; i <= votantes; i++) {
                        System.out.print("Voto " + i + " (AZUL, ROJO, NEGRO, AMARILLO): ");
                        String voto = scanner.nextLine().toUpperCase();

                        switch (voto) {
                            case "AZUL":
                                votosAzul++;
                                break;
                            case "ROJO":
                                votosRojo++;
                                break;
                            case "NEGRO":
                                votosNegro++;
                                break;
                            case "AMARILLO":
                                votosAmarillo++;
                                break;
                            default:
                                votosNulos++;
                        }
                    }

                    int votosValidos = votosAzul + votosRojo + votosNegro + votosAmarillo;
                    double porcentajeValidos = (double) votosValidos / votantes * 100;

                    if (porcentajeValidos >= 60) {
                        System.out.println("Resultados de la votacion:");
                        System.out.println("AZUL: " + votosAzul + " votos");
                        System.out.println("ROJO: " + votosRojo + " votos");
                        System.out.println("NEGRO: " + votosNegro + " votos");
                        System.out.println("AMARILLO: " + votosAmarillo + " votos");
                        System.out.println("NULOS: " + votosNulos + " votos");

                         String ganador;
                        if (votosAzul > votosRojo && votosAzul > votosNegro && votosAzul > votosAmarillo) {
                            ganador = "AZUL";
                        } else if (votosRojo > votosAzul && votosRojo > votosNegro && votosRojo > votosAmarillo) {
                            ganador = "ROJO";
                        } else if (votosNegro > votosAzul && votosNegro > votosRojo && votosNegro > votosAmarillo) {
                            ganador = "NEGRO";
                        } else {
                            ganador = "AMARILLO";
                        }
                        System.out.println("La planilla ganadora es: " + ganador);
                    } else {
                        System.out.println("VOTACIoN FALLIDA");
                    }
                    countVoting++;
                    break;

                case 5:
                    
                    System.out.println("Cantidad de veces ingresado a cada opcion:");
                    System.out.println("1 - Palabra al reves: " + countReverse + " veces");
                    System.out.println("2 - Numero perfecto: " + countPerfect + " veces");
                    System.out.println("3 - Primos: " + countPrime + " veces");
                    System.out.println("4 - Votaciones: " + countVoting + " veces");
                    System.out.println("Gracias por usar el programa.");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
                    break;
            }
        } while (option != 5);

       
    }
}
    
    


