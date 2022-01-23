/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1_dsm_analisis_resultados;

import java.util.Scanner;

/**
 *
 * @author xvwil
 */
public class Guia1_DSM_Analisis_Resultados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
              /**
               * Daniel Wilfredo Granados Hernández GH161659
               * Grupo 03L
               * Desarrollo de Software para moviles
         *
         */
        
        /**
         * Crear un programa en consola que me permita saber si dos números son
         * divisibles entre sí, para saber si un número es divisible por otro se
         * tiene que obtener el modulo y si este es cero entonces este número es
         * divisible por el otro.
         *
         */
        Scanner data = new Scanner(System.in);

        int num_1, num_2, modulo;

        System.out.print("Ingrese numero 1:");
        num_1 = data.nextInt();

        System.out.print("Ingrese numero 2:");
        num_2 = data.nextInt();

        modulo = (num_1 % num_2);

        System.out.println("modulo: : " + modulo);

        if (modulo == 0) {
            System.out.println("Los numeros si son divisibles entre si");
        } else {
            System.out.println("Los numeros no son divisibles entre si: ");
        }

        /**
         * FIN PROGRAMA 1*
         */
        /**
         * Escribir un programa que solicite ingresar 10 notas de alumnos y nos
         * informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.*
         */
        Scanner data2 = new Scanner(System.in);
        int n = 10;
        int cont_aprovado = 0, cont_reprobado = 0, nota;

        while (n != 0) {
            System.out.println("Ingrese una nota entre 0 y 10:");
            nota = data2.nextInt();

            if (nota >= 7) {

                cont_aprovado++;
            } else {
                cont_reprobado++;
            }
            n--;
            if (n == 0) {
                System.out.println("La cantidad de alumnos con nota mayor o igual a 7 son: " + cont_aprovado);
                System.out.println("La cantidad de alumnos con nota menor a 7 son: " + cont_reprobado);
            }

        }

        /**
         * FIN PROGRAMA 2*
         */
        /**
         * Desarrollar un programa que permita cargar n números enteros y luego
         * nos informe cuántos valores fueron pares y cuántos impares.
 *
         */
        Scanner data3 = new Scanner(System.in);

        int n2;
        int par = 0, impar = 0, num;
        System.out.println("Ingrese el numero de veces a pedir un numero: ");
        n2 = data3.nextInt();

        while (n2 != 0) {
            System.out.println("Ingrese un numero entero :");
            num = data3.nextInt();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            n2--;
            if (n2 == 0) {
                System.out.println("La cantidad de numeros pares ingresados fue: " + par);
                System.out.println("La cantidad de numeros impares ingresados fue: " + impar);
            }
        }

        /**
         * FIN PROGRAMA 3*
         */
        /**
         * Escribir un programa que pida ingresar coordenadas (x,y) que
         * representan puntos en el plano. Informar cuántos puntos se han
         * ingresado en el primer, segundo, tercer y cuarto cuadrante. Al
         * comenzar el programa se pide que se ingrese la cantidad de puntos a
         * procesar.
 *
         */
        Scanner data4 = new Scanner(System.in);

        int n3;
        int x, y;
        int cont_primer_cuadrante = 0, cont_segundo_cuadrante = 0, cont_tercer_cuadrante = 0, cont_cuarto_cuadrante = 0;
        System.out.println("Ingrese el numero de pares ordenador a solicitar : ");
        n3 = data4.nextInt();

        while (n3 != 0) {
            System.out.println("Ingrese un valor en x :");
            x = data4.nextInt();

            System.out.println("Ingrese un valor en y :");
            y = data4.nextInt();

            if (x < 0 && y > 0) {
                //primer octante
                cont_primer_cuadrante++;
            } else if (x > 0 && y > 0) {
                //segundo octante
                cont_segundo_cuadrante++;

            } else if (x < 0 && y < 0) {
                //tercer octante
                cont_tercer_cuadrante++;
            } else if (x > 0 && y < 0) {
                //cuarto octante
                cont_cuarto_cuadrante++;
            }
            n3--;
            if (n3 == 0) {
                System.out.println("La cantidad de pares ordenados x,y en el primer cuadrante fue: " + cont_primer_cuadrante);
                System.out.println("La cantidad de pares ordenados x,y en el segundo cuadrante fue: " + cont_segundo_cuadrante);
                System.out.println("La cantidad de pares ordenados x,y en el tercer cuadrante fue: " + cont_tercer_cuadrante);
                System.out.println("La cantidad de pares ordenados x,y en el cuarto cuadrante fue: " + cont_cuarto_cuadrante);

            }
        }

        /**
         * FIN PROGRAMA 4*
         */
    }

}
