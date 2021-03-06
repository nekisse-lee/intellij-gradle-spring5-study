package com.nekisse.main;

import com.nekisse.config.AppCtx;
import com.nekisse.spring.Client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Client client = ctx.getBean(Client.class);
        Client client1 = ctx.getBean(Client.class);

        System.out.println(client==client1);
        client.send();

        ctx.close();

    }
}
