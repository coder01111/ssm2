package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.dao.UserDao;
import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import cn.itcast.service.AccountService;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    @Test
    public void run1() {
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountDao accountDao = ac.getBean(AccountDao.class);
        UserDao userDao = ac.getBean(UserDao.class);
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
//        User user = new User();
//        user.setUsername("bbb");
//        user.setPassword("3333");
//        userDao.save(user);
//        Account account = new Account();
////        account.setMoney(1000D);
////        account.setName("ASS");
////        accountDao.saveAccount(account);


        // 获取对象
        //AccountService as = (AccountService) ac.getBean("accountService");
        // 调用方法
        //as.findAll();
    }

}
