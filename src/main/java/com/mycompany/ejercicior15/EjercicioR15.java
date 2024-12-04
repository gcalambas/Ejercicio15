/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior15;
import java.util.Scanner;
public class EjercicioR15 {
    public static void main(String[] args) {
        double pesoA, pesoB, pesoC, pesoD;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el peso de la esfera A: ");
        pesoA = entrada.nextInt();

        System.out.print("Ingrese el peso de la esfera B: ");
        pesoB = entrada.nextInt();

        System.out.print("Ingrese el peso de la esfera C: ");
        pesoC = entrada.nextInt();

        System.out.print("Ingrese el peso de la esfera D: ");
        pesoD = entrada.nextInt();

        Esfera.determinarEsferaDiferente(pesoA, pesoB, pesoC, pesoD);

    }
}
