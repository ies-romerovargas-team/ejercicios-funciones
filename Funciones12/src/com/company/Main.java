package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ejercicio Funciones. Conversor de pulgadas
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.print("Introduzca el valor en pulgadas: ");
        a = sc.nextDouble();
        System.out.println(pulgadasACentimetros(a) + " centímetros.");
        System.out.print("Introduzca el valor en centimetros: ");
        a = sc.nextDouble();
        System.out.println(centimetrosAPulgadas(a) + " pulgadas.");

    }

    public static double pulgadasACentimetros(double pulgadas)
    {
        // 1 Pulgada => 2,54
        return (pulgadas * 2.54);
    }

    public static double centimetrosAPulgadas(double centimetros)
    {
        // 1 centimetro => 2,54
        return (centimetros / 2.54);
    }
}
