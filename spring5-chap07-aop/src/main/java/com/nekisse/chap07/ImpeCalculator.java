package com.nekisse.chap07;

public class ImpeCalculator implements CalCulator {
    @Override
    public long factorial(long num) {
        long result = 1;
        for (long i = 1; i <= num; i++) {
            result *=i;
        }
        return result;
    }
}
