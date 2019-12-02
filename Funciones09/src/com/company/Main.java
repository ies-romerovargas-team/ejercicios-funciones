package com.company;

import java.util.Scanner;

public class Main<i> {

    public static void main(String[] args) {
        // Ejercicio Funciones mcm
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduzca dos números para hallar su mcm");
        System.out.print("Número 1º: ");
        num1 = sc.nextInt();
        System.out.print("Número 2º: ");
        num2 = sc.nextInt();
        System.out.println(mcm(num1, num2));
    }

    public static int mcm(int a, int b)
    {
        int i, max;
        if(a>b)
        {
            max = a;
        }
        else
        {
            max = b;
        }
        i = max;
        while (!(i % a == 0 && i % b == 0))
        {
                i++;
        }
        return i;
    }
}