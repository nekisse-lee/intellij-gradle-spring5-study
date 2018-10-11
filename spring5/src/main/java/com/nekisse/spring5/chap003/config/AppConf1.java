package com.nekisse.spring5.chap003.config;

import com.nekisse.spring5.chap003.spring.MemberDao;
import com.nekisse.spring5.chap003.spring.MemberPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf1 {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberPrinter memberPrinter() {
        return new MemberPrinter();
    }

}
