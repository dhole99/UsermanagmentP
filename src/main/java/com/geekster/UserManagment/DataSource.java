package com.geekster.UserManagment;

import com.geekster.UserManagment.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSource {


    @Bean
    Map<Integer, User> getUsersource(){
        return new HashMap<>();
    }
}
