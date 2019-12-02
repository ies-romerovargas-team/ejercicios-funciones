package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ejercicio Funciones Factorial
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static double factorial(int a)
    {
        int i;
        double resultado = 1;
        for (i = a; i > 1; i--)
        {
            resultado = resultado * i;
        }
        return  resultado;
    }
}