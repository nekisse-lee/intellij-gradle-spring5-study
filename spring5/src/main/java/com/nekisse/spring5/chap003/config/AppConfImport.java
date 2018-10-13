package com.nekisse.spring5.chap003.config;

import com.nekisse.spring5.chap003.spring.MemberDao;
import com.nekisse.spring5.chap003.spring.MemberPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConf2.class)
public class AppConfImport {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberPrinter memberPrinter() {
        return new MemberPrinter();

    }
}
