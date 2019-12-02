package com.company;

public class Main {

    public static void main(String[] args) {
	    // Ejercicio de Funciones III
        //diasMes
        System.out.print("diasMes(2): ");
        System.out.println(diasMes(2));
        System.out.print("diasMes(12): ");
        System.out.println(diasMes(12));
        //diasMes2
        System.out.print("diasMes2(2, 2001): ");
        System.out.println(diasMes2(2, 2001));
        System.out.print("diasMes2(2, 2000): ");
        System.out.println(diasMes2(2, 2000));
        //diasTranscurridos
        System.out.print("diasTranscurridos(2, 3, 2000): ");
        System.out.println(diasTranscurridos(2,3,2000));
        System.out.print("diasTranscurridos(31, 12, 2000): ");
        System.out.println(diasTranscurridos(31,12,2000));
        //diasTranscurridos1980
        System.out.print("diasTranscurridos1980(1, 1, 1980): ");
        System.out.println(diasTranscurridos1980(1,1,1980));
        System.out.print("diasTranscurridos1980(31, 12, 1980): ");
        System.out.println(diasTranscurridos1980(31,12,1980));
        System.out.print("diasTranscurridos1980(31, 12, 1981): ");
        System.out.println(diasTranscurridos1980(31,12,1981));
        System.out.print("diasTranscurridos1980(31, 12, 1982): ");
        System.out.println(diasTranscurridos1980(31,12,1982));
        //diasEntreFechas
        System.out.print("diasEntreFechas(01, 01, 1980, 31, 01, 1980): ");
        System.out.println(diasEntreFechas(1,1,1980, 31, 1, 1980));
        System.out.print("diasEntreFechas(01, 01, 1980, 28, 02, 1980): ");
        System.out.println(diasEntreFechas(1,1,1980, 28, 2, 1980));
        System.out.print("diasEntreFechas(01, 01, 1582, 24, 10, 2019): ");
        System.out.println(diasEntreFechas(1,1,1582, 24, 10, 2019));
        //diaSemanaFecha
        System.out.print("diaSemanaFecha(5, 11, 2019): ");
        System.out.println(diaSemanaFecha(5,11,2019));
        System.out.print("diaSemanaFecha(01, 01, 1980): ");
        System.out.println(diaSemanaFecha(1,1,1980));
        //horaASegundos
        System.out.print("horaASegundos(0, 0, 60): ");
        System.out.println(horaASegundos(0,0,60));
        System.out.print("horaASegundos(0, 1, 0): ");
        System.out.println(horaASegundos(0,1,0));
        System.out.print("horaASegundos(1, 0, 0): ");
        System.out.println(horaASegundos(1,0,0));
        //escribeHoraBonita
        System.out.print("escribeHoraBonita(12, 24, 59): ");
        System.out.println(escribeHoraBonita(12,24,59));
        System.out.print("escribeHoraBonita(2, 4, 9): ");
        System.out.println(escribeHoraBonita(2,4,9));
        System.out.print("escribeHoraBonita(0, 61, 0): ");
        System.out.println(escribeHoraBonita(0,61,0));
        //escribeSegundosBonito
        System.out.print("escribeSegundosBonito(3600): ");
        System.out.println(escribeSegundosBonito(3600));
        System.out.print("escribeSegundosBonito(25685): ");
        System.out.println(escribeSegundosBonito(25685));
        System.out.print("escribeSegundosBonito(65685): ");
        System.out.println(escribeSegundosBonito(65685));
        //segundosTranscurridos
        System.out.print("segundosTranscurridos(0, 0, 0, 1, 0, 0): ");
        System.out.println(segundosTranscurridos(0,0,0, 1, 0, 0));
        System.out.print("segundosTranscurridos(1, 2, 15, 6, 30, 15): ");
        System.out.println(segundosTranscurridos(1,2,15, 6, 30, 15));
        //segundosTranscurridos1980
        System.out.print("segundosTranscurridos1980(1, 1, 1980, 1, 0, 0): ");
        System.out.println(segundosTranscurridos1980(1,1,1980, 1, 0, 0));
    }

    public static int diasMes(int mes)
    {
        int devuelve;
        switch (mes)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            devuelve = 31;
            break;
            case 2:
                devuelve = 28;
                break;
            case 4: case 6: case 9: case 11:
            devuelve = 30;
            break;
            default:
                devuelve = 0;
                break;
        }
        return devuelve;
    }

    public static int diasMes2(int mes, int anno)
    {
        if (bisiesto(anno))
        {
            return 29;
        }
        else
        {
            return diasMes(mes);
        }
    }

    public static boolean bisiesto(int anno)
    {
        // Año bisiesto es el divisible entre 4,
        // salvo que sea año secular -último de cada siglo,
        // terminado en «00»-, en cuyo caso también
        // ha de ser divisible entre 400.
        boolean devuelve = false;
        if(anno % 4 == 0)
        {
            // año secular
            if(anno % 100 == 0)
            {
                // divisible entre 400
                if(anno % 400 == 0)
                {
                    devuelve = true;
                }
            }
            else
            {
                devuelve = true;
            }
        }
        return devuelve;
    }

    public static int diasTranscurridos(int dia, int mes, int anno)
    {
        int dias = 0, i;
        for(i = 1; i < mes; i++)
        {
            dias = dias + diasMes2(i, anno);
        }
        dias = dias + dia;
        return dias;
    }

    public static int diasTranscurridos1980(int dia, int mes, int anno)
    {
        int dias = 0, i, j;
        for (j = 1980; j < anno; j++)
        {
            if(bisiesto(j))
            {
                dias = dias + 366;
            }
            else
            {
                dias = dias + 365;
            }
        }
        // ultimo año
        dias = dias + diasTranscurridos(dia, mes, anno);
        return dias;
    }

    public static int diasEntreFechas(int d1, int m1, int a1, int d2, int m2, int a2)
    {
        int diasTotal1, diasTotal2, diferencia;
        diasTotal1 = diasTranscurridos1980(d1, m1, a1);
        diasTotal2 = diasTranscurridos1980(d2, m2, a2);
        diferencia = diasTotal2 - diasTotal1;
        return diferencia;
    }

    public static int diaSemanaFecha(int d, int m, int a)
    {
        int def = diasTranscurridos1980(d,m,a);
        return (def % 7) + 1;
    }

    public static int horaASegundos(int h, int m, int s)
    {
        return h * 3600 + m * 60 + s;
    }

    public static String escribeHoraBonita(int h, int m, int s)
    {
        // valores permitidos
        // esta función admite cualquier valor en minutos y segundos
        
        if (s > 59){
            // el exceso se lo añadimos a los minutos
            m = m + (s / 60);
            s = (s % 60);
        }
        if (m > 59){
            // el exceso se lo añadimos a las horas
            h = h + (m / 60);
            m = (m % 60);
        }
        String hora = "";
        if (h < 10)
        {
            hora = "0";
        }
        hora = hora + h + ":";
        if (m < 10)
        {
            hora = hora + "0";
        }
        hora = hora + m + ":";
        if (s < 10)
        {
            hora = hora + "0";
        }
        hora = hora + s;
        return hora;
    }

    public static String escribeSegundosBonito(int s)
    {
        return escribeHoraBonita(0,0, s);
    }

    public static int segundosTranscurridos(int h1, int m1, int s1, int h2, int m2, int s2)
    {
        return (h2 - h1) * 3600 + (m2 - m1) * 60 + (s2 - s1);
    }

    public static int segundosTranscurridos1980(int d, int m, int a, int h, int M, int s)
    {
        int x = diasTranscurridos1980(d, m, a);
        x = x * 24 * 3600 - 86400;  // restamos los segundos existentes en las últimas 24 horas
        x = x + segundosTranscurridos(0,0,0, h, M, s);
        return x;
    }
}