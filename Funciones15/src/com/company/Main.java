package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ejercicio Funciones Lee Numero
        while (leeNumero(50,80))
        {

        }
        System.out.println("Correcto!!");
    }

    public static boolean leeNumero(int a, int b)
    {
        int max, min;
        if(a > b)
        {
            max = a;
            min = b;
        }
        else
        {
            max = b;
            min = a;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre " + a + " y " + b + ": ");
        int c = sc.nextInt();
        return (c < min || c > max);
    }
}