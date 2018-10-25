package com.nekisse.main;

import com.nekisse.config.AppCtx;
import com.nekisse.spring.ChangePasswordService;
import com.nekisse.spring.MemberNotFoundException;
import com.nekisse.spring.WrongIdPassWordException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainForCPS {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);


        ChangePasswordService cps = ctx.getBean("changePwdSvc", ChangePasswordService.class);

        try {
            cps.changePassword("nekisse@nekisse.com", "1234", "1111");
            System.out.println("암호를 변경 했습니다.");
        } catch (MemberNotFoundException e) {
            System.out.println("회원 데이터가 없습니다.");
        } catch (WrongIdPassWordException e) {
            System.out.println("암호가 올바르지 않습니다.");
        }

        ctx.close();

    }

}
