package cn.itcast.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControll {

    @RequestMapping("hello")
    public String hello() {

        System.out.println("hello");
        return "list";
    }

}
