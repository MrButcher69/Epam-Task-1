package com.company;

import java.util.Scanner;

public class FirstPart {

    public boolean mas(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 4-х значное число");
        int num = in.nextInt();
        int a,b,c,d;
        a = num / 1000;
        b = num / 100 % 10;
        c = num % 100 / 10;
        d = num % 1000 % 10;
        if((a + b) == (c + d)){
            return true;
        }else {
            return false;
        }
    }
}
