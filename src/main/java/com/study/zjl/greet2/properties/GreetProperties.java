package com.study.zjl.greet2.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("zjl.greet")
public class GreetProperties {
    private String name;
    private int age;
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
