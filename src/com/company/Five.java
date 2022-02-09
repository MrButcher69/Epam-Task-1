package com.company;

import java.util.Scanner;

public class Five {
    public String POw(){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        if(a<=0) return Double.toString(Math.pow(a,4));
        return Double.toString(Math.pow(a,3));
    }
}
