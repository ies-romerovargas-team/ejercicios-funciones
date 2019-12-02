package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ejercicio Funciones resolucion Camara
        Scanner sc = new Scanner(System.in);
        System.out.print("Indique el número de MegaPixeles de su cámara: ");
        double mg = sc.nextDouble();
        resolucionCamara(mg);
    }

    public static void resolucionCamara(double m)
    {
        /*
        Dos formatos posibles 4:3 y 16:9
        (1) lado1 x lado2 = MGPixeles (x 1000000)
        Para respetar las proporciones se tiene que cumplir que:
        (2) lado1 = 3 x (lado2/4)
        (3) lado2 = 4 x (lado1/3)
        Despejando una incognita en (1)
        3 x (lado2/4) x lado 2 = m
        => lado2 = raiz cuadrada (4*m/3) y
        => lado1 = raiz cuadrada (3*m/4) y

        Idem para 16:9
        */
        m = m * 1000000;
        double base, altura;
        base = Math.sqrt((4*m)/3);
        altura = Math.sqrt((3*m)/4);
        System.out.println("resultado 4:3 = " + base + " x " + altura);
        base = Math.sqrt((16*m)/9);
        altura = Math.sqrt((9*m)/16);
        System.out.println("resultado 16:9 = " + base + " x " + altura);
    }
}
