package edu.umss.unidad4.ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CasteoPromocion {
    public static void main(String[] args) throws ParseException {
        byte a;
        short b;
        int x = 127;
        long y = 67535;

        a = (byte)x;
        System.out.println(a);

        byte z = 10;
        int var = z;
        System.out.println(var);

        b = (short)y;
        System.out.println(b);

        double num1 = 1234.567;
        float num2 = 12.34f;

        num2 = (float) num1;

        System.out.println(num2);

        num2 = 1.5f;
        num1 = num2;

        System.out.println(num1);

        x = (int)num2;
        System.out.println(x);

        x = 15;
        num2 = x;
        System.out.println(num2);

        String varNumero1 = "10";
        int entero1 = Integer.parseInt(varNumero1);
        System.out.println(entero1);

        Integer integer1 = 2;
        String varNumero2 = "100.5";
        double double1 = Double.parseDouble(varNumero2);
        System.out.println(double1);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse("11/02/2022");
        System.out.println(fecha);
    }
}
