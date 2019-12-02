package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ejercicio Función Par
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número: ");
        int a = sc.nextInt();
        if(par(a))
        {
            System.out.println("Es par");
        }
        else
        {
            System.out.println("Es impar");
        }
    }

    public static boolean par(int a)
    {
        boolean devuelve;
        if(a % 2 == 0)
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
