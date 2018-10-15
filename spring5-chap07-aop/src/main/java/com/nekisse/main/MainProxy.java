package com.nekisse.main;

import com.nekisse.chap07.ExTimeCalculator;
import com.nekisse.chap07.ImpeCalculator;
import com.nekisse.chap07.RecCalculator;

public class MainProxy {

    public static void main(String[] args) {


        ExTimeCalculator ttCal1 = new ExTimeCalculator(new ImpeCalculator());
        System.out.println(ttCal1.factorial(20));

        ExTimeCalculator ttCal2 = new ExTimeCalculator(new RecCalculator());
        System.out.println(ttCal2.factorial(20));

    }
}
