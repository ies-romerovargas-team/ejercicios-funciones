package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ejercicio Función Imprime Serie
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número 1: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce número 2: ");
        int num2 = sc.nextInt();
        imprimeSerie(num1, num2);
    }

    private static void imprimeSerie(int a, int b)
    {
        int sentido, i;
        if(a > b)
        {
            sentido = -1;
        }
        else
        {
            sentido = 1;
        }

        for(i = a + sentido; i != b; i = i + sentido)
        {
            System.out.println(i);
        }
    }
}