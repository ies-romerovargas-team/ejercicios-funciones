package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ejercicio Función max
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número 1: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce número 2: ");
        int num2 = sc.nextInt();
        System.out.println(max(num1, num2));
    }

    private static int max(int a, int b)
    {
        int devuelve = 0;
        if(a >= b)
        {
            devuelve = a;
        }
        else
        {
            devuelve = b;
        }
        return  devuelve;
    }
}