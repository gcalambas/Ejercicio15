/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicior15;
public class Esfera {
    public static void determinarEsferaDiferente(double pesoA, double pesoB, double pesoC, double pesoD) {
        if (pesoA == pesoB && pesoA == pesoC) {
            // D es la diferente
            if (pesoD > pesoA) {
                System.out.println("La esfera D es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso.");
            }
        } else if (pesoA == pesoB && pesoA == pesoD) {
            // C es la diferente
            if (pesoC > pesoA) {
                System.out.println("La esfera C es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera C es la diferente y es de menor peso.");
            }
        } else if (pesoA == pesoC && pesoA == pesoD) {
            // B es la diferente
            if (pesoB > pesoA) {
                System.out.println("La esfera B es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera B es la diferente y es de menor peso.");
            }
        } else {
            // A es la diferente
            if (pesoA > pesoB) {
                System.out.println("La esfera A es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera A es la diferente y es de menor peso.");
            }
        }
    }
    
}
