package com.nekisse.config;

import com.nekisse.aspect.ExeTimeAspect;
import com.nekisse.chap07.CalCulator;
import com.nekisse.chap07.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {

    @Bean
    public ExeTimeAspect exeTimeAspect() {
        return new ExeTimeAspect();
    }

    @Bean
    public CalCulator calculator() {
        return new RecCalculator();
    }

}
