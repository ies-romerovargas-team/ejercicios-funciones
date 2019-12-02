package com.company;

import java.util.Scanner;

public class Main<i> {

    public static void main(String[] args) {
        // Ejercicio Funciones mcm
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduzca un número para conocer si es primo");
        System.out.print("Número: ");
        num1 = sc.nextInt();
        if (primo(num1))
        {
            System.out.println("El número es PRIMO");
        }
        else
        {
            System.out.println("El número no es PRIMO");
        }
    }

    public static boolean primo(int a)
    {
        int i;
        boolean devuelve;
        devuelve = true;
        for(i = a - 1; i > 1; i--)
        {
            if(a % i == 0){
                devuelve = false;
            }
        }
        return devuelve;
    }
}