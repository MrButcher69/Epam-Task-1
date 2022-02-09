package com.company;

import java.util.Scanner;

public class Seven {
    public String function(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите отрезок");

        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.println("Введите шаг");
        double h = in.nextDouble();

        int quantity = (int) ((b - a) / 5);
        double[] m = new double[quantity];
        double[] n = new double[quantity];

        String str = "";

        for(int i = 0; i<quantity; i++){
            n[i] = a+(i*h);
        }

        for(int i = 0; i<quantity; i++){
            m[i] = Math.pow(Math.sin(n[i]),2) - Math.cos(2 * n[i]);
        }

        for(int i = 0; i< m.length; i++){
            str= str + Double.toString(n[i]) + " " + Double.toString(m[i]) +"\n";
        }
        return str;
    }
}
