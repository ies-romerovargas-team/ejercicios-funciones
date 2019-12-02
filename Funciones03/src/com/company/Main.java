package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ejercicio Función Tabla de Multiplicar
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce número (0 para terminar): ");
            num = sc.nextInt();
            if(num != 0)
            {
                tablaMultiplicar(num);
            }
        } while(num != 0);
    }

    private static void tablaMultiplicar(int a)
    {
        int i;
        for(i = 1; i<=10; i++)
        {
            System.out.println(a + " x " + i + " = " + a*i);
        }
    }
}