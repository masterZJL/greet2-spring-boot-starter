package com.study.zjl.greet2.properties;

import com.study.zjl.greet2.service.GreetService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GreetProperties.class)
public class GreetAutoConfigration {

    @ConditionalOnMissingBean(GreetService.class)
    @Bean
    public GreetService greetService() {
        GreetService greetService = new GreetService();
        return greetService;
    }

}
