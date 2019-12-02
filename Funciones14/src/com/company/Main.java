package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ejercicio Funciones Lee Natural
        int a = leeNatural();
    }

    public static int leeNatural()
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Introduce un número: ");
        a = sc.nextInt();
        while (a <= 0)
        {
            System.out.print("Error. Introduce un número: ");
            a = sc.nextInt();
        }
        return a;
    }
}