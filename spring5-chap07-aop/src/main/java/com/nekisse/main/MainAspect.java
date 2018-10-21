package com.nekisse.main;

import com.nekisse.chap07.Calculator;
import com.nekisse.chap07.RecCalculator;
import com.nekisse.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspect {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

//        Calculator cal = ctx.getBean("calculator", Calculator.class);
        RecCalculator cal = ctx.getBean("calculator", RecCalculator.class);  //exception발생  RecCalculator Bean은 Calculator을 상속받고 있기 때문에 프록시 객체는 Calculaotr를 이용해 프록시를 생성한다,   Bean 객체가 인터페이스를 상속할 때 인터페이스가 아닌 클래스를 이용해서 프록시를 생성하고 싶다면   Configuration클래스의   @EnableAspectJAutoProxy(proxyTargetClass = true) 속성을 설정
        long fiveFact = cal.factorial(5);
        System.out.println("cal.factorial(5) = " + fiveFact);
        System.out.println("cal.getClass().getName() = " + cal.getClass().getName());

        ctx.close();
    }
}
