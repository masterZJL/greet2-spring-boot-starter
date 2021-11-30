package com.study.zjl.greet2.service;

import com.study.zjl.greet2.properties.GreetProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class GreetService {

    @Autowired
    private GreetProperties greetProperties;

    public String greetSomeOne(String friendName) {
        String out = greetProperties.getName() + "：你好！" + friendName + "，我是一个做了" + greetProperties.getAge() + "年的老码农，现在感觉很" + greetProperties.getState();
        return out;
    }

}
