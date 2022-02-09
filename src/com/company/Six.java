package com.company;

import java.util.Scanner;

public class Six {
    public String Sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три числа");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double max, min, sum;

        if(a>b) max = a; else max = b;
        if(c>max) max = c;
        if(a<b) min = a; else min = b;
        if(c<min) min = c;

        sum = max + min;
        return Double.toString(sum);
    }
}
