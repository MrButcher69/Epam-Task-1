package com.company;

public class Main {

    public static void main(String[] args) {
        vivod("1-st");
        FirstPart firstPart = new FirstPart();
        vivod(Boolean.toString(firstPart.mas()));

        vivod("2-nd\nВведите значения переменных");
        SecondPart secondPart = new SecondPart();
        vivod(Double.toString(secondPart.math()));

        vivod("3-rd");
        ThirdPart thirdPart = new ThirdPart();
        vivod(thirdPart.Square());

        vivod("4-rd");
        Four four = new Four();
        vivod(four.Dote());

        vivod("5");
        Five five = new Five();
        vivod(five.POw());

        vivod("6");
        Six six = new Six();
        vivod(six.Sum());

        vivod("7");
        Seven seven = new Seven();
        vivod(seven.function());

        vivod("8");
        Eight eight = new Eight();
        vivod(eight.vosem());

        vivod("9");
        Nine nine = new Nine();
        vivod(nine.concat());

        //десятое не успел


    }

    public static void vivod(String args){
        System.out.println(args);
    }
}
