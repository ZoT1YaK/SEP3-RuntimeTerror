package org.dataaccess.config;

import services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig
{

    @Bean public UserService getUserService(){
        return new UserService();
    }
}
