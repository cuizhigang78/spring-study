package com.cui.ui;

import com.cui.service.IAccountService;
import com.cui.service.impl.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        // 1. 获取核心窗口对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 根据id获取bean对象
        IAccountService accountService = ac.getBean("accountService", AccountService.class);
        accountService.save();
    }
}
