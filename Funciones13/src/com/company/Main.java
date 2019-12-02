package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ejercicio Funciones Nota a texto
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.print("Introduzca nota numérica: ");
        a = sc.nextDouble();
        System.out.println(notaEnTexto(a));
    }

    public static String notaEnTexto(double nota)
    {
        String devuelve = "";
        if (nota == 10)
        {
            devuelve ="Matrícula de honor";
        } else if (nota >= 9)
        {
            devuelve="Sobresaliente";
        } else if (nota >= 7)
        {
            devuelve = "Notable";
        } else if (nota >= 6)
        {
            devuelve = "Bien";
        } else if (nota >= 5)
        {
            devuelve = "Suficiente";
        } else if (nota >= 4)
        {
            devuelve = "Insuficiente";
        } else if (nota >= 3)
        {
            devuelve ="Deficiente";
        }else if (nota >= 0)
        {
            devuelve = "Muy Deficiente";
        }
        return devuelve;
    }
}