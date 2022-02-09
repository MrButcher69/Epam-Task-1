package com.company;

import java.util.Scanner;

public class Four {
    public String Dote(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты точки");
        double x = in.nextDouble();
        double y = in.nextDouble();
        String str1 = "true";
        String str2 = "false";

        if(y==-1 && x == 0) return str2;
        if(x<=2 && x>=-2
                && y<=4
                && y>= -3 ){
            return str1;
        }
        if(x<= 4 && x>= 2 && y<=0 && y>= -3) return str1;
        if(x >= -4 && x<= -2 && y<=0 && y>= -3) return str1;

        return str2;
    }
}
