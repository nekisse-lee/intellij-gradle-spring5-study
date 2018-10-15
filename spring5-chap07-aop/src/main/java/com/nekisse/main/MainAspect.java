package com.nekisse.main;

import com.nekisse.chap07.CalCulator;
import com.nekisse.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspect {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        CalCulator cal = ctx.getBean("calculator", CalCulator.class);
        long fiveFact = cal.factorial(5);
        System.out.println("ca.factorial(5) = " + fiveFact);
        System.out.println(cal.getClass().getName());
        ctx.close();
    }
}
