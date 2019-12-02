package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ejercicio Función Bisiesto
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce año: ");
        int a = sc.nextInt();
        if(bisiesto(a))
        {
            System.out.println("Es un año bisiesto");
        }
        else
        {
            System.out.println("No es un año bisiesto");
        }
    }

    public static boolean bisiesto(int a)
    {
        boolean devuelve;
        if(a % 4 == 0)
        {
            devuelve = true;
        }
        else
        {
            devuelve = false;
        }
        return  devuelve;
    }
}