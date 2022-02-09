package com.company;
import java.util.Scanner;

public class ThirdPart {
    public String Square(){
        System.out.println("Введите длинны катетов");

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        double square = 0.5 *(a*b);

        double c = Math.sqrt((a*a) + (b*b));

        double P = a + b +c;

        String solution = (Double.toString(P) + " " + Double.toString(square));
        return solution;
    }
}
