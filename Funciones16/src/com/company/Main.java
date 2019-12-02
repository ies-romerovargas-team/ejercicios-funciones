package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ejercicio Funciones Elevado
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Escribe dos números (a y b) para calcular a elevado a b");
        System.out.print("Numero a: ");
        a = sc.nextInt();
        System.out.print("Numero b: ");
        b = sc.nextInt();
        System.out.println(elevado(a, b));
    }

    public static double elevado(int a, int b)
    {
        int i;
        double potencia = 1;
        for (i = 1; i <= b; i++)
        {
            potencia = potencia * a;
        }
        return  potencia;
    }
}
