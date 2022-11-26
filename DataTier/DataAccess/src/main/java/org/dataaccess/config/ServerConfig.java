package org.dataaccess.config;

import org.dataaccess.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig
{

    @Bean
    public UserService getUserService(){
        return new UserService();
    }
}
