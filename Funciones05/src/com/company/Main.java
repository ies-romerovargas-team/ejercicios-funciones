package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ejercicio Función signo
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número: ");
        int num1 = sc.nextInt();
        int a = signo(num1);
        if (a == 1)
        {
            System.out.println("El número " + num1 + " es positivo");
        }
        else if (a == -1)
        {
            System.out.println("El número " + num1 + " es negativo");
        }
        else if (a == 0)
        {
            System.out.println("El número es cero");
        }
    }

    private static int signo(int a)
    {
        int devuelve = 0;
        if(a > 0)
        {
            devuelve = 1;
        }
        if(a < 0)
        {
            devuelve = -1;
        }
        if (a == 0)
        {
            devuelve = 0;
        }
        return  devuelve;
    }
}