package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ejercicio Funciones: Area de un triángulo
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Introduzca el valor de la base: ");
        a = sc.nextInt();
        System.out.print("Introduzca el valor de la altura: ");
        b = sc.nextInt();
        System.out.println(areaTriangulo(a , b));
    }

    public static float areaTriangulo(int base, int altura)
    {
        float area = 0;
        area = (base * altura) / 2;
        return area;
    }
}
