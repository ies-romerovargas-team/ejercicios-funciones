package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ejercicio Funciones MCD
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduzca dos números para hallar su MCD");
        System.out.print("Número 1º: ");
        num1 = sc.nextInt();
        System.out.print("Número 2º: ");
        num2 = sc.nextInt();
        System.out.println(mcd(num1, num2));
    }

    public static int mcd(int a, int b)
    {
        int min, i;
        if (a > b)
        {
            min = b;
        }
        else
        {
            min = a;
        }
        i = min;
        while (!(a % i == 0 && b % i == 0))
        {
            i--;
        }
        return i;
    }
}
