package com.atguigu.gmall.mq;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActiveMQConfig {

    @Value("tcp://localhost:61616")
    String brokerURL;

    @Value("true")
    String listenerEnable;

    @Bean
    public ActiveMQConfig getActiveMQUtil(){
        if (brokerURL.equals("disabled")){
            return null;
        }
    }

}
