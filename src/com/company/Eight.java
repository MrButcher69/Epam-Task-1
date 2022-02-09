package com.company;

import java.util.Scanner;

public class Eight {
    public String vosem(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int n = in.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите элементы");
        for(int i = 0; i<n; i++){
            mass[i] = in.nextInt();
        }
        System.out.println("Введите K");
        int k= in.nextInt();
        int sum = 0;
        for(int i = 0; i<n; i++){
            if(mass[i] % k == 0){
                sum += mass[i];
            }
        }
        return Integer.toString(sum);
    }
}
