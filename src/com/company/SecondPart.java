package com.company;

import java.lang.Math;
import java.util.Scanner;

public class SecondPart {
   public double math (){

       Scanner in = new Scanner(System.in);
       double solution;
       double temp1;
       double temp2;

       double a = in.nextDouble();
       double b = in.nextDouble();
       double c = in.nextDouble();

       if(a == 0.0 || b==0.0){
           System.out.println("Значение переменных не входит в область допустимых значений");
           return 0.0;
       }

       if(c >=0.0 || a >=0.0){
           System.out.println("Значение переменых не входит в область допустимых значений");
           return 0.0;
       }

       if(!(b<=(-Math.sqrt(-(4.0*a*c))) || b>=(Math.sqrt(-(4.0*a*c))) )){
           System.out.println("Значение переменых не входит в область допустимых значений");
           return 0.0;
       }


       temp1 = Math.sqrt(b*b + 4.0 * a* c);
       temp2 = (b + temp1) / 2.0*a;
       solution = temp2 - (Math.pow(a,3.0)*c) + Math.pow(b,-2.0);

       return solution;
   }
}
